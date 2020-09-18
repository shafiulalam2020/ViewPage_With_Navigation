package com.example.viewpage2withnavigation1.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpage2withnavigation1.R
import kotlinx.android.synthetic.main.fragment_first_screen.view.*
import kotlinx.android.synthetic.main.fragment_second.view.*


class SecondScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
        /* eita (R.id.viewPager) dewar karonei .. view page2 ke relation kora ba activity kora gece NEXT button e */

        view.next2.setOnClickListener {
            viewPager?.currentItem = 2 // eikhane 1 er chaygai .. joto dewa hobe , button e click korle toto page pore apnake nie jabe .
        }
        return view
    }
}