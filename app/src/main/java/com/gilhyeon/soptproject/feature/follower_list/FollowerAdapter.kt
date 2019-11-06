package com.gilhyeon.soptproject.feature.follower_list

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gilhyeon.soptproject.R
import com.gilhyeon.soptproject.data.follower.FollowerItem

class FollowerAdapter(private val context: Context) : RecyclerView.Adapter<FollowerViewHolder>() {
    var data = listOf<FollowerItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowerViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.rv_item_follower, parent, false)

        return FollowerViewHolder(view)
    }

    override fun getItemCount(): Int{
        return data.size
    }

    override fun onBindViewHolder(holder: FollowerViewHolder, position: Int){
        holder.bind(data[position])
    }
}