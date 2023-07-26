package com.hdt.learnapp.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Course(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val metaKeywords: String,
    val avatar: String,
    val type: Int,
    val time: Long,
    val favourite : Int = 0
)
