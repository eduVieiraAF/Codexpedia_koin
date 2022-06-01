package com.example.codexpedia_koin.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.codexpedia_koin.data.api.GithubRepository
import com.example.codexpedia_koin.data.model.GithubAccount
import kotlinx.coroutines.launch

class MainActivityViewModel
constructor(private val githubRepository: GithubRepository): ViewModel() {

    private val _githubAccount = MutableLiveData<GithubAccount>()
    val githubAccount: LiveData<GithubAccount> get() = _githubAccount

    fun fetchAccount(accountName: String) {

        viewModelScope.launch {
            val githubAccount = githubRepository.getGithubAccountAsync(accountName).await()
            githubAccount?.let { _githubAccount.value = it }
        }
    }
}