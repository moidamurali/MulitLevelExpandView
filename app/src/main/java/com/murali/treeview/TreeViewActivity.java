package com.murali.treeview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ExpandableListView;

import com.google.gson.Gson;
import com.murali.models.FilterChild;
import com.murali.models.FilterElements;
import com.murali.models.FilterSerViceResponse;
import com.murali.multilevel.ParentLevelListAdapter;
import com.murali.multilevel.R;
import com.murali.nlevel.Constants;

import java.util.ArrayList;
import java.util.List;

//https://stackoverflow.com/questions/18717155/expandablelistview-like-treeview-android/20518038
//https://codeday.me/es/qa/20190702/969528.html
public class TreeViewActivity extends AppCompatActivity {
    List<TreeElementInfo> elements = new ArrayList<>();
    TreeElementInfo elementInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        elementInfo = new TreeElementInfo.class;
//        TreeViewAdapter mTreeViewAdapter = new TreeViewAdapter();
    }


        private void getFilterResponse() {
            //elementInfo = new TreeElementInfo();
        FilterSerViceResponse responseData= null;
        List<FilterElements> elementsList = null;
        String response = Constants.newJsonStringList;
        try {
            responseData = new Gson().fromJson(response, FilterSerViceResponse.class);
        } catch (Exception e) {
            Log.e("", e.getMessage());
        }
        if (null != responseData) {
            List<FilterSerViceResponse.FilterFacet> filterFacets = responseData.getProducts().getFacets();
            for (FilterSerViceResponse.FilterFacet mFilterFacet : filterFacets){
                if( mFilterFacet.getKey().equalsIgnoreCase("categories")){
                    elementsList  = mFilterFacet.getElements();
                    for(int i=0; i<elementsList.size();i++){

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

                            }
                        }



                    }



                    return;
                }
            }
        }
    }
}
