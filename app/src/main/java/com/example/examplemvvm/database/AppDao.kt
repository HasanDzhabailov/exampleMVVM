package com.example.examplemvvm.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.examplemvvm.model.ExampleDataClass
@Dao
interface AppDao {
	@Insert(onConflict = OnConflictStrategy.IGNORE)
	suspend fun insert(example: ExampleDataClass)
	@Update
	suspend fun update(expensive: ExampleDataClass)
	@Delete
	suspend fun delete(expensive: ExampleDataClass)

	@Query("SELECT * from name_table")
	fun getAllData(): LiveData<List<ExampleDataClass>>
}