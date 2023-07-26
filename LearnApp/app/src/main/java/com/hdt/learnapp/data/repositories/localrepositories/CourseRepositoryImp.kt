package com.hdt.learnapp.data.repositories.localrepositories

import com.hdt.learnapp.data.database.daos.CourseDao
import com.hdt.learnapp.data.entities.Course
import javax.inject.Inject

class CourseRepositoryImp @Inject constructor(private val courseDao: CourseDao) : CourseRepository {

    override suspend fun getAll(): List<Course> {
        return courseDao.getAll()
    }

    override suspend fun getById(id : Int): Course {
        return courseDao.getById(id)
    }

    override suspend fun getByType(type : Int): List<Course> {
        return courseDao.getByType(type)
    }

    override suspend fun getFavourite(): List<Course> {
        return courseDao.getFavourite()
    }

    override suspend fun insert(course: Course) {
        courseDao.insert(course)
    }

    override suspend fun update(
        id: Int,
        title: String,
        description: String,
        metaKeywords: String,
        avatar: String,
        type: Int
    ) {
        courseDao.update(id, title, description, metaKeywords, avatar, type)
    }

    override suspend fun updateFavourite(id: Int, favourite: Int) {
        courseDao.updateFavourite(id, favourite)
    }

    override suspend fun delete(courseId: Int) {
        courseDao.detete(courseId)
    }
}