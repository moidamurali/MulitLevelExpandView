package com.murali.multilevel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.murali.models.FilterChild;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class FirstLevelListAdapter extends BaseExpandableListAdapter {

    String[] parentHeaders;
    List<String[]> secondLevelHeader;
    private Context context;
    List<LinkedHashMap<String, String[]>> secondLevelData;
    LinkedHashMap<String,List<FilterChild>> finalData;

    public FirstLevelListAdapter(Context context, String[] parentHeader, List<String[]> secondLevel, List<LinkedHashMap<String, String[]>> data,
                                 LinkedHashMap<String,List<FilterChild>> finalData) {
        this.context = context;

        this.parentHeaders = parentHeader;

        this.secondLevelHeader = secondLevel;

        this.secondLevelData = data;
        this.finalData = finalData;
    }

    @Override
    public int getGroupCount() {
        return parentHeaders.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        //return lstHeaders[groupPosition].LstSubItems.Count;
        return 1;

    }

    @Override
    public Object getGroup(int groupPosition) {

        return groupPosition;
    }

    @Override
    public Object getChild(int group, int child) {

        return child;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
            convertView = null;
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.row_first, null);
            TextView text = (TextView) convertView.findViewById(R.id.rowParentText);
            text.setText(this.parentHeaders[groupPosition]);

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        final CustomExpandableListView customELV = new CustomExpandableListView(context);
        LinkedHashMap<String, String[]> thirdLevelMovies = new LinkedHashMap<>();

        List<FilterChild> child = finalData.get(parentHeaders[groupPosition]);
        HashMap<String, List<FilterChild.SubChild>> subSubData = new HashMap<>();

        String[] scData = new String[child.size()];
        for(int c =0; c<child.size();c++){

            scData[c] = child.get(c).getText();
            List<FilterChild.SubChild> subChildList =  child.get(c).getSubChild();
            subSubData.put(child.get(c).getText(), subChildList);
            if(subChildList!=null && !subChildList.isEmpty()) {
                String[] subChildArray = new String[subChildList.size()];

                for (int sc = 0; sc < subChildList.size(); sc++) {
                    subChildArray[sc] = subChildList.get(sc).getText();
                }
                thirdLevelMovies.put(scData[c], subChildArray);

            }
        }

        String[] headers = scData;//secondLevelHeader.get(groupPosition);
        List<String[]> childData = new ArrayList<>();
        HashMap<String, String[]> secondLevelData= thirdLevelMovies;//secondLevelData.get(groupPosition);


        for(String key : secondLevelData.keySet())
        {
            childData.add(secondLevelData.get(key));
        }



        customELV.setAdapter(new SecondLevelListAdapter(context, headers,childData, subSubData));
        //Below lines used for to remove indicator between child items
        customELV.setGroupIndicator(null);
        customELV.setChildIndicator(null);
        customELV.setDividerHeight(0);

        customELV.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            int previousGroup = -1;

            @Override
            public void onGroupExpand(int groupPosition) {
                if(groupPosition != previousGroup)
                    customELV.collapseGroup(previousGroup);
                previousGroup = groupPosition;
            }
        });


        return customELV;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
