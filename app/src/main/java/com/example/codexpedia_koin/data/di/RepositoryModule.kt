package com.example.codexpedia_koin.data.di

import com.example.codexpedia_koin.data.api.GithubRepository
import org.koin.dsl.module

val repositoryModule = module {
    single {
        GithubRepository(get())
    }
}