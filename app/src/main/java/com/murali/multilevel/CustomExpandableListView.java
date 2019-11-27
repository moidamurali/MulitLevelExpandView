package com.murali.multilevel;

import android.content.Context;
import android.widget.ExpandableListView;

public class CustomExpandableListView extends ExpandableListView
{

        public CustomExpandableListView(Context context) {
			super(context);
        }

        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            //999999 is a size in pixels. ExpandableListView requires a maximum height in order to do measurement calculations. 
            heightMeasureSpec = MeasureSpec.makeMeasureSpec(999999, MeasureSpec.AT_MOST);
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
}