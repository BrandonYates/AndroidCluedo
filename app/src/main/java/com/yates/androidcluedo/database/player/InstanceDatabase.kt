package com.yates.androidcluedo.database.player

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.yates.androidcluedo.database.game.InstanceDao
import com.yates.androidcluedo.database.game.InstanceFull

@Database(entities = [InstanceFull::class], version = 1, exportSchema = false)
abstract class InstanceDatabase : RoomDatabase() {

    abstract fun instanceDao(): InstanceDao

    companion object {
        @Volatile
        private var INSTANCE: InstanceDatabase? = null

        fun getDatabase(context: Context): InstanceDatabase =
            INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    InstanceDatabase::class.java,
                    "instance_database"
                ).build()
                instance
            }
    }
}