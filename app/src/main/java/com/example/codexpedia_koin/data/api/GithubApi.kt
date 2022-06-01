package com.example.codexpedia_koin.data.api

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubApi {
    @GET("/users/{username}")
    fun fetchGithubAccountAsync(@Path("username") username: String): Deferred<Response<GithubAccount>>
}