package com.murali.customexpandable.kotlin

import android.app.Activity
import android.content.res.AssetManager
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import com.google.gson.Gson
import com.murali.customexpandable.R
import java.io.InputStream
import java.io.InputStreamReader
import java.io.Reader
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

    fun loadJsonDataFromAssets() = try {
        var assetManager: AssetManager = assets
        var inputStream = assets.open("expand_list.json")
        var gson :Gson = Gson()
        var reader : Reader = InputStreamReader(inputStream)
        var elements: Elements = gson.fromJson(reader,Elements())

//        for (elemntsData in  elements.elementsData.size){
//            elementsData.add(elemntsData)
//            if (elemntsData.)
//        }

    }catch(e : Exception) {

    }

}