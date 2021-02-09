package com.jess.schollinvent.common.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jess.schollinvent.data.Step1Entity
import com.jess.schollinvent.data.Step3Entity
import com.jess.schollinvent.data.Step4Entity
import com.jess.schollinvent.data.Step5Entity

@Database(
    entities = [
        Step1Entity::class,
        Step3Entity::class,
        Step4Entity::class,
        Step5Entity::class,
    ], version = 1
)
abstract class AppDatabase : RoomDatabase() {
//    abstract fun userDao(): UserDao
}
