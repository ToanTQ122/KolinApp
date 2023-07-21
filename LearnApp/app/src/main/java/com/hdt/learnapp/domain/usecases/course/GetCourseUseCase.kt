package com.hdt.learnapp.domain.usecases.course

import com.hdt.learnapp.data.entities.Course
import com.hdt.learnapp.data.repositories.localrepositories.CourseRepository
import javax.inject.Inject

class GetCourseUseCase  @Inject constructor(
    private val courseRepository: CourseRepository
){
    suspend fun invoke() : List<Course> {
        return courseRepository.getCourses()
    }
}