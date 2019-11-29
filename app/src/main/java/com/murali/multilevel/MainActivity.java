package com.murali.multilevel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ExpandableListView;

import com.google.gson.Gson;
import com.murali.models.FilterChild;
import com.murali.models.FilterElements;
import com.murali.models.FilterSerViceResponse;
import com.murali.nlevel.Constants;

import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.List;


/**
 * Add in parent for more main category
 * Define array for genre (subcategory) for each parent category added
 * Define LinkedHasMap for each subcategory where key is subcategory name, and value is a string array
 */
public class MainActivity extends AppCompatActivity {

    /**
     * The Expandable list view.
     */
    ExpandableListView expandableListView;

    // We have two  main category. (third one is left for example addition)

    /**
     * The Parent Group Names.
     */
    //String[] parent = new String[]{"MOVIES", "GAMES"}; // comment this when uncomment bottom
    String[] parentLevelHeaders = new String[]{};

    //The Second level.
    List<String[]> secondLevelHeaders = new ArrayList<>();
    // Datastructure for Third level movies.
    LinkedHashMap<String, String[]> thirdLevelMovies = new LinkedHashMap<>();

    LinkedHashMap<String,List<FilterChild>> finalData = new LinkedHashMap<>();

    /**
     * The Data.
     */
    List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // expandable listview
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);
        getFilterResponse();
        // parent adapter
        ParentLevelListAdapter threeLevelListAdapterAdapter = new ParentLevelListAdapter(this, parentLevelHeaders, secondLevelHeaders, data, finalData);


        // set adapter
        expandableListView.setAdapter( threeLevelListAdapterAdapter );


        // OPTIONAL : Show one list at a time
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            int previousGroup = -1;

            @Override
            public void onGroupExpand(int groupPosition) {
                if (groupPosition != previousGroup)
                    expandableListView.collapseGroup(previousGroup);
                previousGroup = groupPosition;
            }
        });


    }

    private void getFilterResponse() {
        FilterSerViceResponse responseData= null;
        List<FilterElements> elementsList = null;
        String response = Constants.newJsonStringList;
        try {
            responseData = new Gson().fromJson(response, FilterSerViceResponse.class);
        } catch (Exception e) {
            Log.e("", e.getMessage());
        }
        secondLevelHeaders = new ArrayList<>();
        if (null != responseData) {
            List<FilterSerViceResponse.FilterFacet> filterFacets = responseData.getProducts().getFacets();
            for (FilterSerViceResponse.FilterFacet mFilterFacet : filterFacets){
               if( mFilterFacet.getKey().equalsIgnoreCase("categories")){
                   elementsList  = mFilterFacet.getElements();
                   parentLevelHeaders = new String[elementsList.size()];
                   for(int i=0; i<elementsList.size();i++){
                       parentLevelHeaders[i] = elementsList.get(i).getText();
                       finalData.put(elementsList.get(i).getText(),elementsList.get(i).getChild());
                       List<FilterChild> child = elementsList.get(i).getChild();
                       String[] scData = new String[child.size()];
                       for(int c =0; c<child.size();c++){
                           scData[c] = child.get(c).getText();
                           List<FilterChild.SubChild> subChildList =  child.get(c).getSubChild();
                           if(subChildList!=null && !subChildList.isEmpty()) {
                               String[] subChildArray = new String[subChildList.size()];
                               for (int sc = 0; sc < subChildList.size(); sc++) {
                                   subChildArray[sc] = subChildList.get(sc).getText();
                               }
                               thirdLevelMovies.put(scData[c], subChildArray);
                           }
                       }
                       secondLevelHeaders.add(scData);
                   }
                   data.add(thirdLevelMovies);
                   return;
               }
            }
        }
    }
}
