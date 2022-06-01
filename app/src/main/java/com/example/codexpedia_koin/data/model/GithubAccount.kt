package com.example.codexpedia_koin.data.model

import com.google.gson.annotations.SerializedName

class GithubAccount(
    @SerializedName("login") var login: String = "",
    @SerializedName("id") var id: Int = 0,
    @SerializedName("avatar_url") var avatarUrl: String = "",
    @SerializedName("created_at") var createdAt: String = "",
    @SerializedName("updated_at") var updatedAt: String = ""
)