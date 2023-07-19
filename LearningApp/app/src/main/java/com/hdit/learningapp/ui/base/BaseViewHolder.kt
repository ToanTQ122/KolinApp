package com.hdit.learningapp.ui.base

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.hdit.learningapp.utils.constants.State

abstract class BaseViewHolder<in T>(view: View) : RecyclerView.ViewHolder(view) {

    protected val context: Context = view.context
    abstract fun bind(model: T?, state: State = State.SUCCESS)
}