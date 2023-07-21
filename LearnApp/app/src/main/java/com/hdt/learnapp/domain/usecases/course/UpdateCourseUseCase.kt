package com.hdt.learnapp.domain.usecases.course

import com.hdt.learnapp.data.repositories.localrepositories.CourseRepository
import javax.inject.Inject

class UpdateCourseUseCase  @Inject constructor(
    private val courseRepository: CourseRepository
){
    suspend fun invoke(courseId: Long, title: String, content: String)  {
        return courseRepository.updateCourse(courseId, title, content)
    }
}