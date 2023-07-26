package com.hdt.learnapp.domain.usecases

import com.hdt.learnapp.data.entities.Course
import com.hdt.learnapp.data.repositories.localrepositories.CourseRepository
import javax.inject.Inject

class GetCourseByIdUseCase  @Inject constructor(
    private val courseRepository: CourseRepository
){
    suspend fun invoke(id : Int) : Course {
        return courseRepository.getById(id)
    }
}