package com.hdt.learnapp.data.repositories.localrepositories

import com.hdt.learnapp.data.entities.Course

interface CourseRepository {
    suspend fun getCourses(): List<Course>
    suspend fun insertCourse(course: Course)
    suspend fun updateCourse(id: Long, title: String, content: String)
    suspend fun deleteCourse(courseId: Long)
}