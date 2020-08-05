package com.example.myapplication

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener { button ->

            var backgroundDrawable1 =  ReactViewBackgroundDrawable(view.context);
            backgroundDrawable1.layoutDirection = View.LAYOUT_DIRECTION_LTR;
            backgroundDrawable1.color = -851197 // -789757;
            view.findViewById<LinearLayout>(R.id.box).background = backgroundDrawable1

            var backgroundDrawable2 =  ReactViewBackgroundDrawable(view.context);
            backgroundDrawable2.layoutDirection = View.LAYOUT_DIRECTION_LTR;
            backgroundDrawable2.color = -789757;
            view.findViewById<LinearLayout>(R.id.inner).background = backgroundDrawable2;
            view.findViewById<LinearLayout>(R.id.inner).elevation = 10.0f;

            var backgroundDrawable3 =  ReactViewBackgroundDrawable(view.context);
            backgroundDrawable3.layoutDirection = View.LAYOUT_DIRECTION_LTR;
            backgroundDrawable3.color = -851197 // -789757;
            view.findViewById<LinearLayout>(R.id.box1).background = backgroundDrawable3

            var backgroundDrawable4 =  ReactViewBackgroundDrawable(view.context);
            backgroundDrawable4.layoutDirection = View.LAYOUT_DIRECTION_LTR;
            backgroundDrawable4.color = -789757;
            view.findViewById<LinearLayout>(R.id.inner1).background = backgroundDrawable4;
            view.findViewById<LinearLayout>(R.id.inner1).elevation = 10.0f;

            var backgroundDrawable5 =  ReactViewBackgroundDrawable(view.context);
            backgroundDrawable5.layoutDirection = View.LAYOUT_DIRECTION_LTR;
            backgroundDrawable5.color = -851197 // -789757;
            view.findViewById<LinearLayout>(R.id.box2).background = backgroundDrawable5

            var backgroundDrawable6 =  ReactViewBackgroundDrawable(view.context);
            backgroundDrawable6.layoutDirection = View.LAYOUT_DIRECTION_LTR;
            backgroundDrawable6.color = -789757;
            view.findViewById<LinearLayout>(R.id.inner2).background = backgroundDrawable6;
            view.findViewById<LinearLayout>(R.id.inner2).elevation = 10.0f;




            var backgroundDrawable7 =  ReactViewBackgroundDrawable(view.context);
            backgroundDrawable7.layoutDirection = View.LAYOUT_DIRECTION_LTR;
            backgroundDrawable7.color = -851197 // -789757;
            view.findViewById<LinearLayout>(R.id.box3).background = backgroundDrawable7

            var backgroundDrawable8 =  ReactViewBackgroundDrawable(view.context);
            backgroundDrawable8.layoutDirection = View.LAYOUT_DIRECTION_LTR;
            backgroundDrawable8.color = -789757;
            view.findViewById<LinearLayout>(R.id.inner3).background = backgroundDrawable8;
            view.findViewById<LinearLayout>(R.id.inner3).elevation = 10.0f;

            var backgroundDrawable9 =  ReactViewBackgroundDrawable(view.context);
            backgroundDrawable9.layoutDirection = View.LAYOUT_DIRECTION_LTR;
            backgroundDrawable9.color = -851197 // -789757;
            view.findViewById<LinearLayout>(R.id.box4).background = backgroundDrawable9

            var backgroundDrawable10 =  ReactViewBackgroundDrawable(view.context);
            backgroundDrawable10.layoutDirection = View.LAYOUT_DIRECTION_LTR;
            backgroundDrawable10.color = -789757;
            view.findViewById<LinearLayout>(R.id.inner4).background = backgroundDrawable10;
            view.findViewById<LinearLayout>(R.id.inner4).elevation = 10.0f;

            var backgroundDrawable11 =  ReactViewBackgroundDrawable(view.context);
            backgroundDrawable11.layoutDirection = View.LAYOUT_DIRECTION_LTR;
            backgroundDrawable11.color = -851197 // -789757;
            view.findViewById<LinearLayout>(R.id.box5).background = backgroundDrawable11

            var backgroundDrawable12 =  ReactViewBackgroundDrawable(view.context);
            backgroundDrawable12.layoutDirection = View.LAYOUT_DIRECTION_LTR;
            backgroundDrawable12.color = -789757;
            view.findViewById<LinearLayout>(R.id.inner5).background = backgroundDrawable12;
            view.findViewById<LinearLayout>(R.id.inner5).elevation = 10.0f;



        }

        view.findViewById<Button>(R.id.button_second).setOnClickListener { button ->
            view.findViewById<LinearLayout>(R.id.box).alpha = 0.5f;
            view.findViewById<LinearLayout>(R.id.box1).alpha = 0.5f;
            view.findViewById<LinearLayout>(R.id.box1).background.alpha = 127;
            view.findViewById<LinearLayout>(R.id.box2).background.alpha = 127;

            view.findViewById<LinearLayout>(R.id.box3).alpha = 0.5f;
            view.findViewById<LinearLayout>(R.id.box4).alpha = 0.5f;
            view.findViewById<LinearLayout>(R.id.box4).background.alpha = 127;
            view.findViewById<LinearLayout>(R.id.box5).background.alpha = 127;
        }
    }
}