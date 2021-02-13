package com.harnet.fixit.view.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.harnet.fixit.R
import com.harnet.fixit.databinding.AboutScreenBinding
import com.harnet.fixit.util.rotateImg

class AboutScreen : Fragment() {
    lateinit var dataBinding: AboutScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.about_screen, container, false)
        // rotate image
        dataBinding.imageView.rotateImg(3000)
        // next button
        dataBinding.next.setOnClickListener {
            Navigation.findNavController(dataBinding.next)
                .navigate(ViewPagerFragmentDirections.actionViewPagerFragmentToStartUpFragment())
        }

        return dataBinding.root
    }
}