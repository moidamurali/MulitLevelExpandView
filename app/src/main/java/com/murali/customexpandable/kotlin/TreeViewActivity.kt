package com.murali.customexpandable.kotlin

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import com.murali.customexpandable.R
import java.util.*


class TreeViewActivity : Activity() {

    lateinit var mRecyclerView : RecyclerView
    var parentElements: List<Elements.ElementsData> = ArrayList<Elements.ElementsData>()
    var elementsData: List<Elements.ElementsData> = ArrayList<Elements.ElementsData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nlevel_activity_main)

        mRecyclerView = findViewById(R.id.expList) as RecyclerView;
    }

}