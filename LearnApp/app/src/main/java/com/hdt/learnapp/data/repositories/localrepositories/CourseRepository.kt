package com.hdt.learnapp.data.repositories.localrepositories

import androidx.room.Insert
import androidx.room.Query
import com.hdt.learnapp.data.entities.Course

interface CourseRepository {
    //Get function
    suspend fun getAll(): List<Course>
    suspend fun getById(id : Int): Course
    suspend fun getByType(type : Int): List<Course>
    suspend fun getFavourite(): List<Course>

    //Action Function
    suspend fun insert(course: Course)
    suspend fun update(id: Int, title: String, description: String, metaKeywords: String, avatar: String, type : Int)
    suspend fun updateFavourite(id: Int, favourite: Int )
    suspend fun delete(courseId: Int)
}
