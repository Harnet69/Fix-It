package com.harnet.fixit.view.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.viewpager2.widget.ViewPager2
import com.harnet.fixit.R

class AboutScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.about_screen, container, false)

        // next button
        view.findViewById<TextView>(R.id.next).setOnClickListener {
            Navigation.findNavController(view.findViewById<TextView>(R.id.next)).navigate(ViewPagerFragmentDirections.actionViewPagerFragmentToStartUpFragment())
        }

        return view
    }

}