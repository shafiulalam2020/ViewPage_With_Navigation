package com.example.viewpage2withnavigation1.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpage2withnavigation1.R
import kotlinx.android.synthetic.main.fragment_first_screen.view.*


class FirstScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first_screen, container, false)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
        /* eita (R.id.viewPager) dewar karonei .. view page2 ke relation kora ba activity kora gece NEXT button e */

        view.next.setOnClickListener {
            viewPager?.currentItem = 1 // eikhane 1 er chaygai .. joto dewa hobe , button e click korle toto page pore apnake nie jabe .
        }

        return view

    }

    /** eikhane keo jodi chay ... sudhu SLIDE korei page change korbe .. tahole nicher code sudhu likhlei hobe . ar jodi chay .. NEXT button o
     * kaj korbe tahole obossoi upore ja dewa ase sei onujayi kaj korte hobe .

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_screen, container, false)
    }
     */
}