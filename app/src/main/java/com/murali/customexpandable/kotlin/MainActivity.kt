package com.murali.customexpandable.kotlin

import android.app.Activity
import android.content.res.AssetManager
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.google.gson.Gson
import com.murali.customexpandable.R
import java.io.InputStreamReader
import java.io.Reader


class MainActivity : Activity() {

    lateinit var mRecyclerView : RecyclerView
    var parentElementsList: ArrayList<Elements.ElementsData> = ArrayList<Elements.ElementsData>()
    var elementsDataList: ArrayList<Elements.ElementsData> = ArrayList<Elements.ElementsData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nlevel_activity_main)

        mRecyclerView = findViewById(R.id.expList) as RecyclerView;
        loadJsonDataFromAssets()
        val llm = LinearLayoutManager(this)
        llm.orientation = LinearLayoutManager.HORIZONTAL
        mRecyclerView.layoutManager = llm;
       val mListItemAdapter: ListItemAdapter = ListItemAdapter(parentElementsList, elementsDataList, this)
        mRecyclerView.adapter = mListItemAdapter
    }

    fun loadJsonDataFromAssets() {
        try {
            var assetManager: AssetManager = assets
            var inputStream = application.assets.open("expand_list.json")//assetManager.open("expand_list.json")
            var gson: Gson = Gson()
            var reader: Reader = InputStreamReader(inputStream)
            var elements: Elements = gson.fromJson(reader, Elements::class.java)


            if (elements.elementsData != null && !elements.elementsData.isEmpty()) {
                for (element: Elements.ElementsData? in elements.elementsData) {
                    element?.let {
                        elementsDataList.add(it)
                    };

                    if (element!!.parentId.equals("ROOT", true)) {
                        parentElementsList.add(element);
                    }
                }
            } else {
            }

        } catch (e: Exception) {

        }
    }

}