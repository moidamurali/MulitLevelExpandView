package com.murali.newLevel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import com.murali.multilevel.R;
//https://stackoverflow.com/questions/35431342/4-level-expandablelistview-4th-level-opens-underneath-the-2nd-level-doesnt-sh
public class NLevelMainActivity extends AppCompatActivity {

    public static final int FIRST_LEVEL_COUNT = 3;
    public static final int SECOND_LEVEL_COUNT = 2;
    public static final int THIRD_LEVEL_COUNT = 2;
    public static final int FOURTH_LEVEL_COUNT = 2;
    private ExpandableListView expandableListView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);
        expandableListView.setAdapter(new ParentLevel(this));
    }
}