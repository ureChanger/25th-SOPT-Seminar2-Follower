package com.gilhyeon.soptproject.feature

import android.graphics.Rect
import android.view.View
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView


class RecyclerDecoration : RecyclerView.ItemDecoration{
    private var divHeight:Int = 0

    constructor(divHeight : Int){
        this.divHeight = divHeight
    }

    override fun getItemOffsets(@NonNull outRect: Rect, @NonNull view:View, @NonNull parent:RecyclerView, @NonNull state:RecyclerView.State){
        super.getItemOffsets(outRect, view, parent, state)
        outRect.top = divHeight
    }
}