package com.harnet.fixit.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.harnet.fixit.R
import com.harnet.fixit.modelView.StartUpViewModel

class StartUpFragment : Fragment() {

    companion object {
        fun newInstance() = StartUpFragment()
    }

    private lateinit var viewModel: StartUpViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.start_up_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(StartUpViewModel::class.java)
        // TODO: Use the ViewModel
    }

}