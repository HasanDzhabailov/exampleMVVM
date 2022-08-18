package com.example.examplemvvm.ui.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.examplemvvm.database.AppDao
import com.example.examplemvvm.model.ExampleDataClass
import com.example.examplemvvm.repository.ExampleRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class ProfileViewModel @Inject constructor (dataSource: AppDao):ViewModel() {
	val database = dataSource
	private val repository: ExampleRepository = ExampleRepository(database)

	fun insert(name:String, age:Int){
		viewModelScope.launch {
			val newExpense = ExampleDataClass(name = name, age = age)
			repository.insert(newExpense)
		}
	}
	fun delete(example:ExampleDataClass){
		CoroutineScope(Dispatchers.IO).launch {
			repository.delete(example)
		}
	}
	fun update(id:Long,name: String, age: Int, date:Long) {
		CoroutineScope(Dispatchers.IO).launch  {
			val updateExample = ExampleDataClass(id = id, name = name, age = age, date = date)
			repository.update(updateExample)
		}
	}
}