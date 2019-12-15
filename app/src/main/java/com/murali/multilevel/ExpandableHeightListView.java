package com.murali.multilevel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

public class ExpandableHeightListView extends ExpandableListView {

    boolean expanded = false;

    public ExpandableHeightListView(Context context) {
        super(context);
    }

    public ExpandableHeightListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ExpandableHeightListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public boolean isExpanded() {
        return expanded;
    }


    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (isExpanded()) {
            int expandSpec = MeasureSpec.makeMeasureSpec(MEASURED_SIZE_MASK, MeasureSpec.AT_MOST);
            super.onMeasure(widthMeasureSpec, expandSpec);

            ViewGroup.LayoutParams params = getLayoutParams();
            params.height = getMeasuredHeight();
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }

      /*  // ExpandableListView requires a maximum height in order to do measurement calculations.
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(MEASURED_SIZE_MASK, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);*/
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }
}
