package com.harnet.fixit.view.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.harnet.fixit.R
import com.harnet.fixit.adapter.ViewPagerAdapter
import com.harnet.fixit.databinding.ViewPagerBinding

class ViewPagerFragment : Fragment() {
    lateinit var dataBinding: ViewPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            CustomerScreen(),
            ExecutorScreen(),
            AboutScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        dataBinding.viewPager.adapter = adapter

        return dataBinding.root
    }
}