package com.gilhyeon.soptproject.feature.git_repo_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gilhyeon.soptproject.R
import com.gilhyeon.soptproject.data.git_repo.GitRepoRepository
import com.gilhyeon.soptproject.feature.RecyclerDecoration

class GitRepoListActivity : AppCompatActivity() {

    private lateinit var rvMainGitRepo: RecyclerView
    private lateinit var gitRepoAdapter: GitRepoAdapter
    private val gitRepoRepository = GitRepoRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_git_repo_list)

        rvMainGitRepo = findViewById(R.id.rvMainGitRepo)

        gitRepoAdapter = GitRepoAdapter(this)

        rvMainGitRepo.adapter = gitRepoAdapter

        rvMainGitRepo.layoutManager = LinearLayoutManager(this)

        gitRepoAdapter.data = gitRepoRepository.getRepoList()

        rvMainGitRepo.addItemDecoration(
            RecyclerDecoration(25)
        )

    }
}