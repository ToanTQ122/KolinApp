package com.hdt.learnapp.data.database.daos

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hdt.learnapp.data.entities.Course

@Database(entities = [Course::class], version = 1, exportSchema = false)
abstract class CourseDatabase : RoomDatabase() {
    companion object {
        const val DATABASE_NAME = "course-database"
    }

    abstract fun appDao(): CourseDao
}