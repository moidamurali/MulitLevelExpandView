package com.murali.multilevel;

import android.content.Context;
import android.util.Log;
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


public class ChildLevelListAdapter extends BaseExpandableListAdapter {

    private Context context;


    List<String[]> data;

    String[] headers;
    HashMap<String, List<FilterChild.SubChild>> subSubData;

    public ChildLevelListAdapter(Context context, String[] headers, List<String[]> data, HashMap<String, List<FilterChild.SubChild>> subSubData) {
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

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.row_third, null);

            TextView textView = (TextView) convertView.findViewById(R.id.rowThirdText);

            for(int j=0; j<headers.length;j++){
                List<FilterChild.SubChild> subChild =  subSubData.get(headers[j]);

                if(subChild!=null && !subChild.isEmpty()) {
                    for (int k = 0; k < subChild.size(); k++) {

                        textView.setText(subChild.get(k).getText());
                        for(int gc=0;gc<subChild.get(k).getGrandChild().size();gc++){
                            Log.v("Log Info:::","Header:::" + headers[j] + " ::Child::" + subChild.get(k).getText()+ " ::Grand Child::" + subChild.get(k).getGrandChild().get(gc).getText());
                        }
                    }
                    break;
                }
            }

           /* String[] childArray=data.get(groupPosition);

            String text = childArray[childPosition];

            textView.setText(text);*/

        return convertView;
    /*    final CustomExpandableListView customELV = new CustomExpandableListView(context);

        String[] headersInfo = headers;//secondLevel.get(groupPosition);
        List<String[]> childData =new ArrayList<>();

        for(int i=0; i<data.size();i++)
        {
            childData.add(data.get(i));
        }


        customELV.setAdapter(new SubChildLevelListAdapter(context, headersInfo,childData));
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


        return customELV;*/
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        //String[] children = data.get(groupPosition);


        return data.size();//children.length;
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