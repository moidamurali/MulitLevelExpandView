package com.murali.multilevel;

import android.content.Context;
import android.util.DisplayMetrics;
import android.widget.ExpandableListView;

public class CustomExpandableListView extends ExpandableListView
{
        private Context mContext;
        public CustomExpandableListView(Context context) {
			super(context);
            this.mContext = context;
        }

     /*   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            //999999 is a size in pixels. ExpandableListView requires a maximum height in order to do measurement calculations. 
            heightMeasureSpec = MeasureSpec.makeMeasureSpec(999999, MeasureSpec.AT_MOST);
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }*/


    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)  {
        DisplayMetrics metrics = mContext.getResources().getDisplayMetrics();
        int screenWidth = (int)(metrics.widthPixels); //or whatever you need here for width of the row

        widthMeasureSpec = MeasureSpec.makeMeasureSpec(screenWidth, MeasureSpec.AT_MOST);
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(20000, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}