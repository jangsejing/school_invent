package com.jess.schollinvent.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Step1Entity(
    @PrimaryKey(autoGenerate = true)
    val uid: Int,
    val createdAt: Long,
    val title: String,
    val content: String,
    val attach: String?
)