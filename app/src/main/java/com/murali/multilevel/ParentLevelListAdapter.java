package com.murali.multilevel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class ParentLevelListAdapter extends BaseExpandableListAdapter {

    String[] parentHeaders;
    List<String[]> secondLevelHeader;
    private Context context;
    List<LinkedHashMap<String, String[]>> data;

    public ParentLevelListAdapter(Context context, String[] parentHeader, List<String[]> secondLevel, List<LinkedHashMap<String, String[]>> data) {
        this.context = context;

        this.parentHeaders = parentHeader;

        this.secondLevelHeader = secondLevel;

        this.data = data;
    }

    @Override
    public int getGroupCount() {
        return parentHeaders.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        // no idea why this code is working
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

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.row_first, null);
            TextView text = (TextView) convertView.findViewById(R.id.rowParentText);
            text.setText(this.parentHeaders[groupPosition]);

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        final CustomExpandableListView customELV = new CustomExpandableListView(context);

        String[] headers = secondLevelHeader.get(groupPosition);


        List<String[]> childData = new ArrayList<>();
        HashMap<String, String[]> secondLevelData=data.get(groupPosition);

        for(String key : secondLevelData.keySet())
        {


            childData.add(secondLevelData.get(key));

        }



        customELV.setAdapter(new ChildLevelListAdapter(context, headers,childData));

        customELV.setGroupIndicator(null);


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
