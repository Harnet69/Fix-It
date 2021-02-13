package com.harnet.fixit.view.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.harnet.fixit.R
import com.harnet.fixit.databinding.ExecutorScreenBinding

class ExecutorScreen : Fragment() {
    lateinit var dataBinding: ExecutorScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.executor_screen, container, false)
        // next button
        dataBinding.next.setOnClickListener {
            activity?.findViewById<ViewPager2>(R.id.viewPager)?.currentItem = 2
        }

        return dataBinding.root
    }

}