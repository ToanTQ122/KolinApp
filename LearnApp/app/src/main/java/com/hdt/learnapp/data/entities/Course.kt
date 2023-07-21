package com.hdt.learnapp.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Course(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val time: Long,
    val title: String,
    val content: String,
    val colorHex: String
)