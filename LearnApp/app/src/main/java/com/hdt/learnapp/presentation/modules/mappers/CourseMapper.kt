package com.hdt.learnapp.presentation.modules.mappers

import com.hdt.learnapp.data.entities.Course
import com.hdt.learnapp.presentation.base.BaseMapper
import com.hdt.learnapp.presentation.model.CourseModel

class CourseMapper : BaseMapper<Course, CourseModel>() {
    override fun transform(entity: Course): CourseModel {
        return CourseModel(
            id = entity.id,
            title = entity.title,
            description = entity.description,
            metaKeywords = entity.metaKeywords,
            avatar = entity.avatar,
            type = entity.type,
            time = entity.time,
            favourite = entity.favourite
        )
    }
}