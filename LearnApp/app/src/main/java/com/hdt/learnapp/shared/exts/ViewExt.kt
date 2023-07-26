package com.hdt.learnapp.shared.exts

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.view.View
import androidx.annotation.IdRes
import androidx.core.content.ContextCompat
import com.google.android.material.button.MaterialButton
import com.hdt.learnapp.shared.utilities.ColorUtils

fun View.setOnDelayClickListener(method: () -> Unit) {
    this.setOnClickListener {
        this.isEnabled = false
        method.invoke()
        this.postDelayed({
            this.isEnabled = true
        }, 600)
    }
}

fun View.visible() {
    this.visibility = View.VISIBLE
}

fun View.inVisible() {
    this.visibility = View.INVISIBLE
}

fun View.gone() {
    this.visibility = View.GONE
}

fun MaterialButton.changeBackgroundColor(@IdRes colorRes: Int) {
    //backgroundTintList = ContextCompat.getColorStateList(context, colorRes)
}

fun MaterialButton.changeBackgroundColor(colorHex: String) {
    backgroundTintList = ColorStateList.valueOf(ColorUtils.getColorFromHex(colorHex))
}

fun View.changeVisibility(isVisible: Boolean) {
    if (isVisible) {
        this.visibility = View.VISIBLE
    } else {
        this.visibility = View.GONE
    }
}