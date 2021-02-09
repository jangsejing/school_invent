package com.jess.schollinvent.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Step4ItemEntity(
    @PrimaryKey(autoGenerate = true)
    val uid: Int,
    val createdAt: Long,
    val step4Uid: Int,
    val content: String
)