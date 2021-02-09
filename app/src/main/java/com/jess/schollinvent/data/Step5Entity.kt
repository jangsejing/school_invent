package com.jess.schollinvent.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Step5Entity(
    @PrimaryKey(autoGenerate = true)
    val uid: Int,
    val timeStamp: Long,
    val type: Int, // 0 스케치, 1 구상도, 2 제작도
    val idea: String?,
    val attach: String?
)