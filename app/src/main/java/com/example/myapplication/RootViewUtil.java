package com.example.myapplication;

import android.view.View;
import android.view.ViewParent;

public class RootViewUtil {

    /** Returns the root view of a given view in a react application. */
    public static RootView getRootView(View reactView) {
        View current = reactView;
        while (true) {
            if (current instanceof RootView) {
                return (RootView) current;
            }
            ViewParent next = current.getParent();
            if (next == null) {
                return null;
            }
            current = (View) next;
        }
    }
}
