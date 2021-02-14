package com.harnet.fixit.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.harnet.fixit.R
import com.harnet.fixit.databinding.SplashFragmentBinding
import com.harnet.fixit.viewModel.SplashViewModel

class SplashFragment : Fragment() {
    private lateinit var viewModel: SplashViewModel
    private lateinit var dataBinding: SplashFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.splash_fragment, container, false)
        viewModel = ViewModelProvider(this).get(SplashViewModel::class.java)

        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        viewModel.rotateImg(view.findViewById(R.id.logo))
        viewModel.redirect(dataBinding.logo)

        observeViewModel()
    }

    private fun observeViewModel() {
        viewModel.mIsOnboarding.observe(viewLifecycleOwner, { isOnboardingShown ->
            if (isOnboardingShown) {
                Navigation.findNavController(dataBinding.logo)
                    .navigate(SplashFragmentDirections.actionSplashFragmentToStartUpFragment())
            } else {
                Navigation.findNavController(dataBinding.logo)
                    .navigate(SplashFragmentDirections.actionSplashFragmentToViewPagerFragment())
            }
        })
    }
}