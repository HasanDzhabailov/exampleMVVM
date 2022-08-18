package com.example.examplemvvm.ui.home

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.examplemvvm.database.AppDao
import com.example.examplemvvm.model.ExampleDataClass
import com.example.examplemvvm.repository.ExampleRepository
import javax.inject.Inject

class HomeViewModel @Inject constructor(
	dataSource: AppDao,
	application: Application,
) : AndroidViewModel(application) {
	val database = dataSource
	private val repository: ExampleRepository = ExampleRepository(database)

	fun getAllData(): LiveData<List<ExampleDataClass>> {
		return repository.getAllData()
	}

}