package com.murali.customexpandable.java;


import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ListView;

import com.google.gson.Gson;
import com.murali.customexpandable.R;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;


public class TreeViewActivity extends Activity {
    /**
     * The set of elements in a tree
     */
    private ArrayList<Elements.ElementsData> parentElements;
    /**
     * Data source element set
     */
    private ArrayList<Elements.ElementsData> elementsData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tree_view_activity);

        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        loadDynamicData();

        ListView treeview = (ListView) findViewById(R.id.treeview);
        TreeViewAdapter treeViewAdapter = new TreeViewAdapter(parentElements, elementsData, inflater);
        TreeViewItemClickListener treeViewItemClickListener = new TreeViewItemClickListener(treeViewAdapter);
        treeview.setAdapter(treeViewAdapter);
        treeview.setOnItemClickListener(treeViewItemClickListener);
    }

    private void loadDynamicData() {

        parentElements = new ArrayList<>();
        elementsData = new ArrayList<>();

        try {
            AssetManager assetManager = getAssets();
            InputStream ims = assetManager.open("expand_list.json");

            Gson gson = new Gson();
            Reader reader = new InputStreamReader(ims);

            Elements gsonObj = gson.fromJson(reader, Elements.class);
            for(int i=0; i<gsonObj.getElementsData().size();i++){
                Log.i("Title::::", gsonObj.getElementsData().get(i).getTitle());
                elementsData.add(gsonObj.getElementsData().get(i));
                if(gsonObj.getElementsData().get(i).getParentId().equalsIgnoreCase("ROOT")){
                    //Add the initial tree element
                    parentElements.add(gsonObj.getElementsData().get(i));
                }

            }

        }catch(IOException e) {
            e.printStackTrace();
        }

    }

}