package com.hdt.learnapp.domain.usecases

import com.hdt.learnapp.data.repositories.localrepositories.CourseRepository
import javax.inject.Inject

class UpdateCourseUseCase  @Inject constructor(
    private val courseRepository: CourseRepository
){
    suspend fun invoke(id: Int, title: String, description: String, metaKeywords: String, avatar: String, type : Int)  {
        return courseRepository.update(id, title, description, metaKeywords, avatar, type)
    }
}