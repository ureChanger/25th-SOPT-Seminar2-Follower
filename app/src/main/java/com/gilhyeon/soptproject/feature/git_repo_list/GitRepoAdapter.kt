package com.gilhyeon.soptproject.feature.git_repo_list

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gilhyeon.soptproject.R
import com.gilhyeon.soptproject.data.git_repo.GitRepoItem

class GitRepoAdapter(private val context: Context) : RecyclerView.Adapter<GitRepoViewHolder>(){
    var data = listOf<GitRepoItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GitRepoViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.rv_item_repository, parent, false)

        return GitRepoViewHolder(view)
    }

    override fun getItemCount(): Int{
        return data.size
    }

    override fun onBindViewHolder(holder: GitRepoViewHolder, position: Int) {
        holder.bind(data[position])
    }

}