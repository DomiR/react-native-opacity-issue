# Opacity issue

**My issue:**
https://github.com/react-navigation/react-navigation/issues/8676

**The original issue:**
https://github.com/facebook/react-native/issues/23090

On android, setting a view's opacity will render artifacts when child views have elevation.

So I've investigated this issue and came to the conclusion, that this is an android intended behavior.

**Background:**

```jsx
<View style={{opacity: 0.5}}>
	<View style={{elevation: 5, margin: 10, backgroundColor: 'red'}}>
<View>
```

To understand this issue we let's dig into react code.
Both views will get a BaseViewManager (see BaseViewManager.java), which holds a reference to a ReactViewGroup (see ReactViewGroup.java).
ReactViewGroup subclasses a ViewGroup and not an Android View (because it can have children).
When setting a backgroundColor no a ReactViewGroup it creates a ReactViewBackgroundDrawable which subclasses a Drawable and sets it as background.
The creation happens in getOrCreateReactViewBackground which composes any already existing background drawable (maybe images use this, in all my test cases the existing drawable was always null) with the new background using LayerDrawable.

**Problem:**
Now when setting an alpha value (changing opacity) it will do this on the ReactViewGroup directly but not on the background drawable, which is why we have the artifact.
As react-native per default set hasOverlappingRendering to false to save memory, this should be an expected android performance optimization.
It seems that some devices do not perform the optimization and I only experienced this when changing the alpha after the first render.

See [android docs](<https://developer.android.com/reference/android/view/View#hasOverlappingRendering()>) for reference.

In the screenshot below you can see the different parameters (plain android project in this repo, not react-native).
In the first row, hasOverlappingRendering is disabled.
![Screenshot](./screenshot.png)
Repo: https://github.com/DomiR/react-native-opacity-issue

So as you can see on both boxes on the right-hand side setting opacity only on the background is not enough, as all children will still have full opacity.
Setting alpha both on the background and on the view itself will result in 0.25 opacity for the background.
On the left-hand side is what we really want but we need to hasOverlappingRendering enabled like in the left bottom.

**Solution:**
I don't know if there is a solution that is good for everyone.
As you can see from the screenshot we need to set hasOverlappingRendering but doing so per default is not performant ([facebook blog entry](https://www.facebook.com/notes/andy-street/react-native-android-offscreen-alpha-compositing/10153949352079590/))

Fortunately, we can set this flag using [needsOffscreenAlphaCompositing](https://reactnative.dev/docs/view#needsoffscreenalphacompositing) as a view prop.

As @kmagiera [mentioned](https://github.com/software-mansion/react-native-screens/issues/153#issuecomment-546841196) that you should probably enable this only temporarily during animations.
The react-native docs also mention using renderToHardwareTextureAndroid in combination.
