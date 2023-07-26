package com.hdt.learnapp.data.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.hdt.learnapp.data.entities.Course

@Dao
interface CourseDao {
    @Query("SELECT * FROM Course")
    suspend fun getAll(): List<Course>

    @Query("SELECT * FROM Course WHERE id =:courseId")
    suspend fun getById(courseId: Int): Course

    @Query("SELECT * FROM Course WHERE type =:type")
    suspend fun getByType(type: Int): List<Course>

    @Query("SELECT * FROM Course WHERE favourite = 1")
    suspend fun getFavourite(): List<Course>

    @Insert
    suspend fun insert(course: Course)

    @Query("UPDATE Course SET title = :title, description = :content, metaKeywords = :metaKeywords, avatar = :avatar, type = :type,WHERE id =:id")
    suspend fun update(id: Int, title: String, description: String, metaKeywords: String, avatar: String, type : Int)

    @Query("UPDATE Course SET favourite = :favourite WHERE id =:id")
    suspend fun updateFavourite(id: Int, favourite: Int )

    @Query("DELETE FROM Course WHERE id =:courseId")
    suspend fun detete(courseId: Int)
}