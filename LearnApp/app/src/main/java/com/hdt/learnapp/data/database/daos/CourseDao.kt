package com.hdt.learnapp.data.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.hdt.learnapp.data.entities.Course

@Dao
interface CourseDao {
    @Query("SELECT * FROM Course")
    suspend fun getCourses(): List<Course>

    @Insert
    suspend fun insertCourse(course: Course)

    @Query("UPDATE Course SET title = :title, content = :content WHERE id =:id ")
    suspend fun updateCourse(id: Long, title: String, content: String)

    @Query("DELETE FROM Course WHERE id =:courseId")
    suspend fun deleteCourse(courseId: Long)
}