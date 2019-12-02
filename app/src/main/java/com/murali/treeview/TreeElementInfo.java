package com.murali.treeview;

import java.io.Serializable;
import java.util.ArrayList;

public interface TreeElementInfo extends Serializable {
    public void addChild(TreeElementInfo child);

    public String getId();

    public void setId(String id);

    public String getOutlineTitle();

    public void setOutlineTitle(String outlineTitle);

    public boolean isHasParent();

    public void setHasParent(boolean hasParent);

    public boolean isHasChild();

    public void setHasChild(boolean hasChild);

    public int getLevel();

    public void setLevel(int level);

    public boolean isExpanded();

    public void setExpanded(boolean expanded);

    public ArrayList<TreeElementInfo> getChildList();

    public TreeElementInfo getParent();

    public void setParent(TreeElementInfo parent);
}
