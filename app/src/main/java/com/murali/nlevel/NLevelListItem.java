package com.murali.nlevel;

/**
 * Created by Murali Moida on 7/29/19.
 */


import android.view.View;

public interface NLevelListItem {

    public boolean isExpanded();
    public void toggle();
    public NLevelListItem getParent();
    public View getView();
}