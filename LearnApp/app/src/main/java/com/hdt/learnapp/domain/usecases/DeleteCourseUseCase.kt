package com.hdt.learnapp.domain.usecases

import com.hdt.learnapp.data.repositories.localrepositories.CourseRepository
import javax.inject.Inject

class DeleteCourseUseCase  @Inject constructor(
    private val courseRepository: CourseRepository
    ){
        suspend fun invoke(courseId: Int) {
            return courseRepository.delete(courseId)
        }
}