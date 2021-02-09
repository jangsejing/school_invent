package com.jess.schollinvent.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Step3Entity(
    @PrimaryKey(autoGenerate = true)
    val uid: Int,
    val createdAt: Long,
    val uncomfortable: String?, // 불편한 점
    val solution: String?, // 해결 방안
    val summary: String? // 정리
)