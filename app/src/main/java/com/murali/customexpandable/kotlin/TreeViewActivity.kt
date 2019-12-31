package com.murali.customexpandable.kotlin

import android.app.Activity
import android.os.Bundle
import com.murali.customexpandable.R


class TreeViewActivity : Activity() {

    var RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nlevel_activity_main)
    }

}