package com.harnet.fixit.modelView

import android.widget.ImageView
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import com.harnet.fixit.util.rotateImg
import com.harnet.fixit.view.SplashFragmentDirections
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel : ViewModel() {
    private val duration = 1500L
    private val rotationDelay = duration / 10
    private val coroutineScope = CoroutineScope(Dispatchers.Default)

    fun redirect(imageView: ImageView) {
        coroutineScope.launch {
            delay(duration - rotationDelay)
            imageView.rotateImg(1500)
            delay(duration)
            coroutineScope.launch(Dispatchers.Main) {
                Navigation.findNavController(imageView)
                    .navigate(SplashFragmentDirections.actionSplashFragmentToViewPagerFragment())
            }
        }
    }
}