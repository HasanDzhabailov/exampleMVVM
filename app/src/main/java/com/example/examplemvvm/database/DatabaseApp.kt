package com.example.examplemvvm.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.examplemvvm.model.ExampleDataClass

@Database(entities = [ExampleDataClass::class], version = 1, exportSchema = false)

abstract class DatabaseApp : RoomDatabase() {
	abstract fun appDao(): AppDao
}