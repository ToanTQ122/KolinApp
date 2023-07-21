package com.hdt.learnapp.data.di

import android.content.Context
import androidx.room.Room
import com.hdt.learnapp.CourseDao
import com.hdt.learnapp.data.database.daos.CourseDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {
    @Provides
    @Singleton
    fun providerDb(@ApplicationContext context: Context): CourseDatabase {
        return Room
            .databaseBuilder(context, CourseDatabase::class.java, CourseDatabase.DATABASE_NAME)
            .build()
    }

    @Provides
    @Singleton
    fun providesNotificationDao(appDatabase: CourseDatabase): CourseDao {
        return appDatabase.appDao()
    }
}