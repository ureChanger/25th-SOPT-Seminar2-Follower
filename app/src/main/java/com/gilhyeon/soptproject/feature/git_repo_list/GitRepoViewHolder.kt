package com.gilhyeon.soptproject.feature.git_repo_list

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gilhyeon.soptproject.R
import com.gilhyeon.soptproject.data.git_repo.GitRepoItem

class GitRepoViewHolder(view : View) : RecyclerView.ViewHolder(view){
    val txtRvItemName: TextView = view.findViewById(R.id.txtRvItemName)
    val txtRvItemDescription: TextView = view.findViewById(R.id.txtRvItemDescription)
    val txtRvItemLanguage: TextView = view.findViewById(R.id.txtRvItemLanguage)
    val imgRvItemLanguageColor: ImageView = view.findViewById(R.id.imgRvItemLanguageColor)

    fun bind(data: GitRepoItem){
        txtRvItemName.text = data.name
        txtRvItemDescription.text = data.description
        txtRvItemLanguage.text = data.language
        imgRvItemLanguageColor.setImageResource(data.languageColor)
    }
}