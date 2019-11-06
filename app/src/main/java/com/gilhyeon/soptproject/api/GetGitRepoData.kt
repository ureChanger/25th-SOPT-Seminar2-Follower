package com.gilhyeon.soptproject

import com.google.gson.annotations.SerializedName

data class GetGitRepoData(
    @SerializedName("name")
    val name:String,
    @SerializedName("login")
    val login:String?)