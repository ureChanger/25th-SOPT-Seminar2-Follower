package com.gilhyeon.soptproject.feature.follower_list

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gilhyeon.soptproject.R
import com.gilhyeon.soptproject.data.follower.FollowerItem
import com.gilhyeon.soptproject.feature.git_repo_list.GitRepoListActivity

class FollowerViewHolder(view: View): RecyclerView.ViewHolder(view){
    val txtRvItemFollowerId: TextView = view.findViewById(R.id.txtxRvItemFollowerId)
    val txtRvItemFollowerName: TextView = view.findViewById(R.id.txtRvItemFollowerName)
    val imgRvItemFollower: ImageView = view.findViewById(R.id.imgRvItemFollower)
    val imgAddFollower: ImageView = view.findViewById(R.id.imgAddFollower)

    fun bind(data: FollowerItem){
        txtRvItemFollowerId.text = data.id
        txtRvItemFollowerName.text = data.name
        imgRvItemFollower.setImageResource(data.img)
        imgAddFollower.setImageResource(R.drawable.followerimage)

        itemView.setOnClickListener{
            val context = it.context
            val gitRepoIntent = Intent(context, GitRepoListActivity::class.java)

            gitRepoIntent.putExtra("follower_name", data.name)
            context.startActivity(gitRepoIntent)
        }
    }
}