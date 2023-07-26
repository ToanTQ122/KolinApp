package com.hdt.learnapp.domain.usecases

import com.hdt.learnapp.data.entities.Course
import com.hdt.learnapp.data.repositories.localrepositories.CourseRepository
import javax.inject.Inject

class GetFavouriteUseCase  @Inject constructor(
    private val courseRepository: CourseRepository
){
    suspend fun invoke() : List<Course> {
        return courseRepository.getFavourite()
    }
}