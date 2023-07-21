package com.hdt.learnapp.shared.widget

import android.content.Context
import androidx.annotation.ColorRes
import com.hdt.learnapp.databinding.DialogCommonBinding
import com.hdt.learnapp.presentation.base.BaseDialog
import com.hdt.learnapp.shared.exts.changeBackgroundColor
import com.hdt.learnapp.shared.exts.gone
import com.hdt.learnapp.shared.exts.setOnDelayClickListener

class CommonDialog(
    context: Context,
    private val title: String,
    private val negativeText: String? = null,
    @ColorRes private val negativeBackgroundColor: Int? = null,
    private val negativeEvent: (() -> Unit)? = null,
    private val positiveText: String? = null,
    @ColorRes private val positiveBackgroundColor: Int? = null,
    private val positiveEvent: (() -> Unit)? = null,
) : BaseDialog<DialogCommonBinding>(context) {
    override fun getLayoutBinding(): DialogCommonBinding {
        return DialogCommonBinding.inflate(layoutInflater)
    }

    override fun initialize() {
        getViewBinding().tvMessage.text = title

        negativeText?.let {
            getViewBinding().btNegative.apply {
                text = it
                negativeBackgroundColor?.let {
                    changeBackgroundColor(it)
                }
                setOnDelayClickListener {
                    dismiss()
                    negativeEvent?.invoke()
                }
            }
        } ?: kotlin.run {
            getViewBinding().btNegative.gone()
        }

        positiveText?.let {
            getViewBinding().btPositive.apply {
                text = it
                positiveBackgroundColor?.let {
                    changeBackgroundColor(it)
                }
                setOnDelayClickListener {
                    dismiss()
                    positiveEvent?.invoke()
                }
            }
        } ?: kotlin.run {
            getViewBinding().btPositive.gone()
        }
    }
}