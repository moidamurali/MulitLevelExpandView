package com.murali.customtree;


import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.widget.ListView;

import com.google.gson.Gson;
import com.murali.models.FilterChild;
import com.murali.models.FilterElements;
import com.murali.models.FilterSerViceResponse;
import com.murali.multilevel.R;
import com.murali.nlevel.Constants;

import java.util.ArrayList;
import java.util.List;

public class TreeViewActivity extends Activity {
    /**
     * The set of elements in a tree
     */
    private ArrayList<Element> elements;
    /**
     * Data source element set
     */
    private ArrayList<Element> elementsData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tree_view_activity);

        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        init();

        ListView treeview = (ListView) findViewById(R.id.treeview);
        TreeViewAdapter treeViewAdapter = new TreeViewAdapter(elements, elementsData, inflater);
        TreeViewItemClickListener treeViewItemClickListener = new TreeViewItemClickListener(treeViewAdapter);
        treeview.setAdapter(treeViewAdapter);
        treeview.setOnItemClickListener(treeViewItemClickListener);
    }

    private void init() {
        elements = new ArrayList<Element>();
        elementsData = new ArrayList<Element>();

        //Add nodes -- node name, node level, node id, parent node id, whether there are children, whether expand

        //Add outermost nodes
        Element e1 = new Element("Moida Village", Element.TOP_LEVEL, 0, Element.NO_PARENT, true, false);

        //Adding Layer 1 Nodes
        Element e2 = new Element("NelliMarla MD", Element.TOP_LEVEL + 1, 1, e1.getId(), true, false);
        //Adding Layer 2 Nodes
        Element e3 = new Element("VZM District", Element.TOP_LEVEL + 2, 2, e2.getId(), true, false);
        //Adding Layer 3 Nodes
        Element e4 = new Element("Garividi Road", Element.TOP_LEVEL + 3, 3, e3.getId(), false, false);

        //Adding Layer 1 Nodes
        Element e5 = new Element("Gajapathi City", Element.TOP_LEVEL + 1, 4, e1.getId(), true, false);
        //Adding Layer 2 Nodes
        Element e6 = new Element("VZM District", Element.TOP_LEVEL + 2, 5, e5.getId(), true, false);
        //Adding Layer 3 Nodes
        Element e7 = new Element("Main Street", Element.TOP_LEVEL + 3, 6, e6.getId(), false, false);

        //Adding Layer 1 Nodes
        Element e8 = new Element("Vizianagaram City", Element.TOP_LEVEL + 1, 7, e1.getId(), false, false);

        //Add outermost nodes
        Element e9 = new Element("Andhra Pradesh", Element.TOP_LEVEL, 8, Element.NO_PARENT, true, false);
        //Adding Layer 1 Nodes
        Element e10 = new Element("AnandhaPuram", Element.TOP_LEVEL + 1, 9, e9.getId(), true, false);
        //Adding Layer 2 Nodes
        Element e11 = new Element("Vizag District", Element.TOP_LEVEL + 2, 10, e10.getId(), true, false);
        //Adding Layer 3 Nodes
        Element e12 = new Element("Podigiaplem Dadao", Element.TOP_LEVEL + 3, 11, e11.getId(), true, false);
        //Adding Layer 4 Nodes
        Element e13 = new Element("10000 Number", Element.TOP_LEVEL + 4, 12, e12.getId(), false, false);

        //Add the initial tree element
        elements.add(e1);
        elements.add(e9);
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

            //elementInfo = new TreeElementInfo();
        /*    FilterSerViceResponse responseData= null;
            List<FilterElements> elementsList = null;
            String response = Constants.newJsonStringList;
        try {
            responseData = new Gson().fromJson(response, FilterSerViceResponse.class);

            if (null != responseData) {
                List<FilterSerViceResponse.FilterFacet> filterFacets = responseData.getProducts().getFacets();
                for (FilterSerViceResponse.FilterFacet mFilterFacet : filterFacets) {
                    if (mFilterFacet.getKey().equalsIgnoreCase("categories")) {
                        elementsList = mFilterFacet.getElements();
                        for (int i = 0; i < elementsList.size(); i++) {

                            List<FilterChild> child = elementsList.get(i).getChild();
                            String[] scData = new String[child.size()];
                            for (int c = 0; c < child.size(); c++) {
                                scData[c] = child.get(c).getText();
                                List<FilterChild.SubChild> subChildList = child.get(c).getSubChild();
                                if (subChildList != null && !subChildList.isEmpty()) {
                                    String[] subChildArray = new String[subChildList.size()];
                                    for (int sc = 0; sc < subChildList.size(); sc++) {
                                        subChildArray[sc] = subChildList.get(sc).getText();
                                    }

                                }
                            }


                        }


                        return;
                    }
                }
            }
        } catch (Exception e) {
            Log.e("", e.getMessage());
        }*/

    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }*/

}