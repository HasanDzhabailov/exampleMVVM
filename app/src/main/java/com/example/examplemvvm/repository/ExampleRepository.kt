package com.example.examplemvvm.repository

import androidx.lifecycle.LiveData
import com.example.examplemvvm.database.AppDao
import com.example.examplemvvm.model.ExampleDataClass
import javax.inject.Inject

class ExampleRepository  @Inject constructor(private val appDao: AppDao){
	fun getAllData(): LiveData<List<ExampleDataClass>> {
		return appDao.getAllData()
	}
	suspend fun insert(example: ExampleDataClass){
		appDao.insert(example)
	}

	suspend fun delete(example: ExampleDataClass){
		appDao.delete(example)
	}
	suspend fun update(example: ExampleDataClass){
		appDao.update(example)
	}

}