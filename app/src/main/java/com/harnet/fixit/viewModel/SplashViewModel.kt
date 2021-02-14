package com.harnet.fixit.viewModel

import android.app.Application
import android.widget.ImageView
import androidx.lifecycle.MutableLiveData
import com.harnet.fixit.helper.SharedPreferencesHelper
import com.harnet.fixit.util.rotateImg
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel(application: Application) : BaseViewModel(application) {
    private val duration = 1500L
    private val rotationDelay = duration / 10
    private val coroutineScope = CoroutineScope(Dispatchers.Default)

    var mIsOnboarding = MutableLiveData<Boolean>()

    fun redirect(imageView: ImageView) {
        coroutineScope.launch {
            delay(duration - rotationDelay)
            imageView.rotateImg(duration)
            delay(duration)
            coroutineScope.launch(Dispatchers.Main) {
                // if an onboarding was shown
                mIsOnboarding.value = SharedPreferencesHelper.invoke(getApplication()).getIsOnboardingShown() == true
            }
        }
    }
}