package com.gilhyeon.soptproject.feature.follower_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gilhyeon.soptproject.R
import com.gilhyeon.soptproject.data.follower.FollowerRepository
import com.gilhyeon.soptproject.feature.RecyclerDecoration

class FollowerListActivity : AppCompatActivity() {
    private lateinit var rvFollower: RecyclerView
    private lateinit var followerAdapter: FollowerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_follower_list)

        val imgProfile: ImageView = findViewById(R.id.imgProfile)
        imgProfile.setImageResource(R.drawable.racoon)

        rvFollower = findViewById(R.id.rvFollower)
        followerAdapter = FollowerAdapter(this)
        rvFollower.adapter = followerAdapter
        rvFollower.layoutManager = LinearLayoutManager(this)

        followerAdapter.data = FollowerRepository().getFollowerList()
        followerAdapter.notifyDataSetChanged()

        rvFollower.addItemDecoration(
            RecyclerDecoration(25)
        )
    }
}
