package com.harnet.fixit.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.harnet.fixit.R
import com.harnet.fixit.modelView.SplashViewModel

class SplashFragment : Fragment() {
    var viewModel = SplashViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(SplashViewModel::class.java)
        return inflater.inflate(R.layout.splash_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        viewModel.rotateImg(view.findViewById(R.id.logo))
        viewModel.redirect(view.findViewById(R.id.logo))
    }
}