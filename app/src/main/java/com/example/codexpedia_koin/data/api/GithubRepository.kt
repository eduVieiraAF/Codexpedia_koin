package com.example.codexpedia_koin.data.api

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext

class GithubRepository(private val githubApi: GithubApi) {

    suspend fun getGithubAccountAsync(accountName: String): Deferred<GithubAccount?> {
        return withContext(Dispatchers.IO) {
            async {
                try {
                    githubApi
                        .fetchGithubAccountAsync(accountName)
                        .await()
                        .body()
                            as GithubAccount
                } catch (e: Exception) {
                    e.printStackTrace()
                    null
                }
            }
        }
    }
}