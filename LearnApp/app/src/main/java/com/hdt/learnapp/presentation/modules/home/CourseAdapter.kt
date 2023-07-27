package com.hdt.learnapp.presentation.modules.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.hdt.learnapp.databinding.ItemCourseBinding
import com.hdt.learnapp.presentation.base.BaseAdapter
import com.hdt.learnapp.presentation.model.CourseModel

class CourseAdapter(
    private val onCourseClicked: (CourseModel) -> Unit

) : BaseAdapter<ItemCourseBinding, CourseModel>() {
    override fun getLayoutBinding(parent: ViewGroup, viewType: Int): ItemCourseBinding {
        return ItemCourseBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    }

    override fun bind(binding: ItemCourseBinding, item: CourseModel, position: Int) {
        binding.title.text = item.title
    }
}