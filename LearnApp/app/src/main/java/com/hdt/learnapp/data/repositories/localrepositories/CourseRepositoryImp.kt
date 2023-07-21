package com.hdt.learnapp.data.repositories.localrepositories

import com.hdt.learnapp.data.database.daos.CourseDao
import com.hdt.learnapp.data.entities.Course
import javax.inject.Inject

class CourseRepositoryImp @Inject constructor(private val courseDao: CourseDao) : CourseRepository {

    override suspend fun getCourses(): List<Course> {
        return courseDao.getCourses()
    }

    override suspend fun insertCourse(course: Course) {
        courseDao.insertCourse(course)
    }

    override suspend fun updateCourse(id: Long, title: String, content: String) {
        courseDao.updateCourse(id, title, content)
    }

    override suspend fun deleteCourse(courseId: Long) {
        courseDao.deleteCourse(courseId)
    }
}