package com.hdt.learnapp.data.di

import com.hdt.learnapp.data.repositories.localrepositories.CourseRepository
import com.hdt.learnapp.data.repositories.localrepositories.CourseRepositoryImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindCourseRepository(
        courseRepositoryImp: CourseRepositoryImp
    ): CourseRepository
}
