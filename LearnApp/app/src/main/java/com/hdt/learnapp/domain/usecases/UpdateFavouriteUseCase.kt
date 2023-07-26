package com.hdt.learnapp.domain.usecases

import com.hdt.learnapp.data.repositories.localrepositories.CourseRepository
import javax.inject.Inject

class UpdateFavouriteUseCase  @Inject constructor(
    private val courseRepository: CourseRepository
){
    suspend fun invoke(id: Int, favourite: Int)  {
        return courseRepository.updateFavourite(id, favourite)
    }
}