package com.murali.newLevel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.murali.multilevel.R;

import static com.murali.newLevel.NLevelMainActivity.THIRD_LEVEL_COUNT;

public class SecondLevelAdapter extends BaseExpandableListAdapter {

    private Context context;

    public SecondLevelAdapter(Context context) {
        this.context = context;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return groupPosition;
    }

    @Override
    public int getGroupCount() {
        return 1;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.row_second, null);
            TextView text = (TextView) convertView.findViewById(R.id.rowSecondText);
            text.setText("SECOND LEVEL");
        }
        return convertView;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final ThirdLevelExpandableListView thirdLevelELV = new ThirdLevelExpandableListView(context);
        thirdLevelELV.setAdapter(new ThirdLevelAdapter(context));
        thirdLevelELV.setGroupIndicator(null);

        thirdLevelELV.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            int previousGroup = -1;

            @Override
            public void onGroupExpand(int groupPosition) {
                if(groupPosition != previousGroup)
                    thirdLevelELV.collapseGroup(previousGroup);
                previousGroup = groupPosition;
            }
        });

        return thirdLevelELV;

    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return THIRD_LEVEL_COUNT;
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
