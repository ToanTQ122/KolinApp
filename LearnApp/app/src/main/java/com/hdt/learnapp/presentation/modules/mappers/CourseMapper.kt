package com.hdt.learnapp.presentation.modules.mappers

import com.hdt.learnapp.data.entities.Course
import com.hdt.learnapp.presentation.base.BaseMapper
import com.hdt.learnapp.presentation.model.CourseModel

class CourseMapper : BaseMapper<Course, CourseModel>() {
    override fun transform(entity: Course): CourseModel {
        return CourseModel(
            id = entity.id,
            time = entity.time,
            title = entity.title,
            content = entity.content,
            colorHex = entity.colorHex
        )
    }
}