package com.harnet.fixit.view.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.harnet.fixit.R

class ExecutorScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // next button
        val view = inflater.inflate(R.layout.executor_screen, container, false)
        view?.findViewById<TextView>(R.id.next)?.setOnClickListener {
            activity?.findViewById<ViewPager2>(R.id.viewPager)?.currentItem = 2
        }
        return view
    }

}