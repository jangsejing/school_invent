package com.jess.schollinvent.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Step4Entity(
    @PrimaryKey(autoGenerate = true)
    val uid: Int,
    val createdAt: Long,
    val type: Int, // 0 : 장점, 1 : 단점, 2 흥비로운 점, 3 : 아이디서 선정 의견
    val idea: String?
)