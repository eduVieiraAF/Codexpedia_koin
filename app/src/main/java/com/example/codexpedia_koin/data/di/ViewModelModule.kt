package com.example.codexpedia_koin.data.di

import com.example.codexpedia_koin.ui.MainActivityViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val vmModule = module { viewModel { MainActivityViewModel(get()) } }