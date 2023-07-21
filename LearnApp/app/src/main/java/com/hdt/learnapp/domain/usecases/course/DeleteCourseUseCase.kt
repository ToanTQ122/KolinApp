package com.hdt.learnapp.domain.usecases.course

import com.hdt.learnapp.data.repositories.localrepositories.CourseRepository
import javax.inject.Inject

class DeleteCourseUseCase  @Inject constructor(
    private val courseRepository: CourseRepository
    ){
        suspend fun invoke(courseId: Long) {
            return courseRepository.deleteCourse(courseId)
        }
}