package com.example.examplemvvm.di


import com.example.examplemvvm.ui.home.HomeFragment
import com.example.examplemvvm.ui.profile.ProfileFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
	@ContributesAndroidInjector
	abstract fun contributeHomeFragmentFragment(): HomeFragment

	@ContributesAndroidInjector
	abstract fun contributeAddExpensesFragment(): ProfileFragment

}