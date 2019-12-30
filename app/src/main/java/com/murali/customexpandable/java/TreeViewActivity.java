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

        parentElements = new ArrayList<Elements.ElementsData>();
        elementsData = new ArrayList<Elements.ElementsData>();

/*        try {
            AssetManager assetManager = getAssets();
            InputStream ims = assetManager.open("expand_list.json");

            Gson gson = new Gson();
            Reader reader = new InputStreamReader(ims);

            Elements gsonObj = gson.fromJson(reader, Elements.class);
            for(int i=0; i<gsonObj.getElementsData().size();i++){
                Log.i("Title::::", gsonObj.getElementsData().get(i).getTitle());
                elementsData.add(gsonObj.getElementsData().get(i));
                if(gsonObj.getElementsData().get(i).getId().equalsIgnoreCase(gsonObj.getElementsData().get(i).getParentId())){
                    //Add the initial tree element
                    parentElements.add(gsonObj.getElementsData().get(i));
                }

            }

        }catch(IOException e) {
            e.printStackTrace();
        }*/



        //Add nodes -- node name, node level, node id, parent node id, whether there are children, whether expand

        //Add outermost nodes
        Elements.ElementsData e1 = new Elements.ElementsData("Moida Village", Elements.ElementsData.TOP_LEVEL, ""+0, Elements.ElementsData.NO_PARENT, true, false);

        //Adding Layer 1 Nodes
        Elements.ElementsData e2 = new Elements.ElementsData("NelliMarla MD", Elements.ElementsData.TOP_LEVEL + 1, ""+1, e1.getId(), true, false);
        //Adding Layer 2 Nodes
        Elements.ElementsData e3 = new Elements.ElementsData("VZM District", Elements.ElementsData.TOP_LEVEL + 2, ""+2, e2.getId(), true, false);
        //Adding Layer 3 Nodes
        Elements.ElementsData e4 = new Elements.ElementsData("Garividi Road", Elements.ElementsData.TOP_LEVEL + 3, ""+3, e3.getId(), false, false);

        //Adding Layer 1 Nodes
        Elements.ElementsData e5 = new Elements.ElementsData("Gajapathi City", Elements.ElementsData.TOP_LEVEL + 1, ""+4, e1.getId(), true, false);
        //Adding Layer 2 Nodes
        Elements.ElementsData e6 = new Elements.ElementsData("VZM District", Elements.ElementsData.TOP_LEVEL + 2, ""+5, e5.getId(), true, false);
        //Adding Layer 3 Nodes
        Elements.ElementsData e7 = new Elements.ElementsData("Main Street", Elements.ElementsData.TOP_LEVEL + 3, ""+6, e6.getId(), false, false);

        //Adding Layer 1 Nodes
        Elements.ElementsData e8 = new Elements.ElementsData("Vizianagaram City", Elements.ElementsData.TOP_LEVEL + 1, ""+7, e1.getId(), false, false);

        //Add outermost nodes
        Elements.ElementsData e9 = new Elements.ElementsData("Andhra Pradesh", Elements.ElementsData.TOP_LEVEL, ""+8, Elements.ElementsData.NO_PARENT, true, false);
        //Adding Layer 1 Nodes
        Elements.ElementsData e10 = new Elements.ElementsData("VSKP", Elements.ElementsData.TOP_LEVEL + 1, ""+9, e9.getId(), true, false);
        //Adding Layer 2 Nodes
        Elements.ElementsData e11 = new Elements.ElementsData("Vishalakshi Nagar", Elements.ElementsData.TOP_LEVEL + 2, ""+10, e10.getId(), true, false);
        //Adding Layer 3 Nodes
        Elements.ElementsData e12 = new Elements.ElementsData("Police Barex", Elements.ElementsData.TOP_LEVEL + 3, ""+11, e11.getId(), true, false);
        //Adding Layer 4 Nodes
        Elements.ElementsData e13 = new Elements.ElementsData("Police Quarters", Elements.ElementsData.TOP_LEVEL + 4, ""+12, e12.getId(), false, false);

        //Add the initial tree element
        parentElements.add(e1);
        parentElements.add(e9);
        //create data source
        elementsData.add(e1);
        elementsData.add(e2);
        elementsData.add(e3);
        elementsData.add(e4);
        elementsData.add(e5);
        elementsData.add(e6);
        elementsData.add(e7);
        elementsData.add(e8);
        elementsData.add(e9);
        elementsData.add(e10);
        elementsData.add(e11);
        elementsData.add(e12);
        elementsData.add(e13);

    }

}