package com.hdt.learnapp.domain.usecases

import com.hdt.learnapp.data.entities.Course
import com.hdt.learnapp.data.repositories.localrepositories.CourseRepository
import javax.inject.Inject

class GetCourseByTypeUseCase  @Inject constructor(
    private val courseRepository: CourseRepository
){
    suspend fun invoke(type : Int) : List<Course> {
        return courseRepository.getByType(type)
    }
}