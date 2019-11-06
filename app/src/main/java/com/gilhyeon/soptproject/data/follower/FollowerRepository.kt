package com.gilhyeon.soptproject.data.follower

import com.gilhyeon.soptproject.R

class FollowerRepository{
    fun getFollowerList():List<FollowerItem>{
        return listOf(
            FollowerItem(
                id = "greedy0110",
                name = "ShinSeung-min",
                img = R.drawable.racoon
            ),
            FollowerItem(
                id = "rlfgus8708",
                name = "ParkGil-hyeon",
                img = R.drawable.racoon
            ),
            FollowerItem(
                id = "greedy0110",
                name = "ShinSeung-min",
                img = R.drawable.racoon
            ),
            FollowerItem(
                id = "rlfgus8708",
                name = "ParkGil-hyeon",
                img = R.drawable.racoon
            ),FollowerItem(
                id = "greedy0110",
                name = "ShinSeung-min",
                img = R.drawable.racoon
            ),
            FollowerItem(
                id = "rlfgus8708",
                name = "ParkGil-hyeon",
                img = R.drawable.racoon
            ),FollowerItem(
                id = "greedy0110",
                name = "ShinSeung-min",
                img = R.drawable.racoon
            ),
            FollowerItem(
                id = "rlfgus8708",
                name = "ParkGil-hyeon",
                img = R.drawable.racoon
            )
        )
    }
}