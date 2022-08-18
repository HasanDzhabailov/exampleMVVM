package com.example.examplemvvm.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.examplemvvm.ui.home.HomeViewModel
import com.example.examplemvvm.ui.profile.ProfileViewModel
import com.example.examplemvvm.viewmodel.ViewModelFactory

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class  ViewModelModule {

	@Binds
	@IntoMap
	@ViewModelKey(HomeViewModel::class)
	abstract fun bindHomeViewModel(homeViewModel: HomeViewModel): ViewModel

	@Binds
	@IntoMap
	@ViewModelKey(ProfileViewModel::class)
	abstract fun bindAddExpensesViewModel(addExpensesViewModel: ProfileViewModel): ViewModel



	@Binds
	abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}