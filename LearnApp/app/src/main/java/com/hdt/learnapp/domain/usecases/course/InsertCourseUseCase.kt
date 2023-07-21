package com.hdt.learnapp.domain.usecases.course

import com.hdt.learnapp.data.entities.Course
import com.hdt.learnapp.data.repositories.localrepositories.CourseRepository
import javax.inject.Inject

class InsertCourseUseCase  @Inject constructor(
    private val courseRepository: CourseRepository
){
    suspend fun invoke(course: Course)  {
        return courseRepository.insertCourse(course)
    }
}
