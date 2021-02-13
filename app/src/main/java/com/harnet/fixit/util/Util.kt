package com.harnet.fixit.util

import android.view.animation.AnimationSet
import android.view.animation.DecelerateInterpolator
import android.view.animation.RotateAnimation
import android.widget.ImageView
import androidx.databinding.BindingAdapter

fun ImageView.rotateImg(duration: Long) {
    val rotationDelay = duration / 10
    val animSet = AnimationSet(true)
    animSet.interpolator = DecelerateInterpolator()
    animSet.fillAfter = true
    animSet.isFillEnabled = true

    val animRotate = RotateAnimation(
        0.0f, 740.0f,
        RotateAnimation.RELATIVE_TO_SELF, 0.5f,
        RotateAnimation.RELATIVE_TO_SELF, 0.5f
    )

    animRotate.duration = duration - rotationDelay
    animRotate.fillAfter = true
    animSet.addAnimation(animRotate)
    this.startAnimation(animSet)
}