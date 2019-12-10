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
import java.util.List;


public class SecondLevelListAdapter extends BaseExpandableListAdapter {

    private Context context;


    List<String[]> data;

    String[] headers;
    HashMap<String, List<FilterChild.SubChild>> subSubData;

    public SecondLevelListAdapter(Context context, String[] headers, List<String[]> data, HashMap<String, List<FilterChild.SubChild>> subSubData) {
        this.context = context;
        this.data = data;
        this.headers = headers;
        this.subSubData = subSubData;
    }

    @Override
    public Object getGroup(int groupPosition) {

        return headers[groupPosition];
    }

    @Override
    public int getGroupCount() {

        return headers.length;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        convertView = null;
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.row_second, null);
            TextView text = (TextView) convertView.findViewById(R.id.rowSecondText);
            String groupText = getGroup(groupPosition).toString();
            text.setText(groupText);

        return convertView;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {

        String[] childData;

        childData = data.get(groupPosition);


        return childData[childPosition];
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final CustomExpandableListView customELV = new CustomExpandableListView(context);

        List<String[]> childData =new ArrayList<>();
        List<FilterChild.SubChild> subChild =  subSubData.get(headers[groupPosition]);
        String[] headersInfo = new String[subChild.size()];
        if(subChild!=null && !subChild.isEmpty()) {
            for (int k = 0; k < subChild.size(); k++) {
                headersInfo[k] = subChild.get(k).getText();
                if(subChild.get(k).getGrandChild() != null) {
                    List<FilterChild.SubChild.GrandChild> grandChildInfo = subChild.get(k).getGrandChild();
                    String[] info = new String[grandChildInfo.size()];
                    for(int gc = 0; gc<grandChildInfo.size(); gc++){
                        info[gc] = grandChildInfo.get(gc).getText();
                    }
                    childData.add(info);
                }
            }
        }

        customELV.setAdapter(new ThirdLevelListAdapter(context, headersInfo,childData));
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
    public int getChildrenCount(int groupPosition) {

        List<FilterChild.SubChild> subChildInfo =  subSubData.get(headers[groupPosition]);

        if(subChildInfo==null || subChildInfo.size()==0) {
            return  0;
        }
        else{
        return subChildInfo.size();
        }
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}