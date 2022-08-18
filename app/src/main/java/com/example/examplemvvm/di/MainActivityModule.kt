package com.example.examplemvvm.di


import com.example.examplemvvm.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class MainActivityModule {
	@ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
	abstract fun contributeMainActivity(): MainActivity
}