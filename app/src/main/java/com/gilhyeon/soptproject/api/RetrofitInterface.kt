package com.gilhyeon.soptproject

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService{
    @GET("/users/{login}/repos")
    fun getRepos(
        @Path("login") login: String): Call<List<GetGitRepoData>>
}