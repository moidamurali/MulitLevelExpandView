package com.murali.customtree;



import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * TreeView item Click events
 * @author carrey
 *
 */
public class TreeViewItemClickListener implements OnItemClickListener {
    /** adapter */
    private TreeViewAdapter treeViewAdapter;

    public TreeViewItemClickListener(TreeViewAdapter treeViewAdapter) {
        this.treeViewAdapter = treeViewAdapter;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {
        //Click on the item to represent the element
        Element element = (Element) treeViewAdapter.getItem(position);
        //Elements in trees
        ArrayList<Element> elements = treeViewAdapter.getElements();
        //Element data source
        ArrayList<Element> elementsData = treeViewAdapter.getElementsData();

        //Click on item without subitem to return directly
        if (!element.isHasChildren()) {
            Toast.makeText(view.getContext(),elements.get(position).getContentText() + ":::" + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            return;
        }

        if (element.isExpanded()) {
            element.setExpanded(false);
            //Delete the corresponding sub-node data within the node, including the sub-node of the sub-node.
            ArrayList<Element> elementsToDel = new ArrayList<Element>();
            for (int i = position + 1; i < elements.size(); i++) {
                if (element.getLevel() >= elements.get(i).getLevel())
                    break;
                elementsToDel.add(elements.get(i));
            }
            elements.removeAll(elementsToDel);
            treeViewAdapter.notifyDataSetChanged();
        } else {
            element.setExpanded(true);
            //Extract the data from the data source and add it to the tree. Note that only the next level of the data is added here to simplify the logic.
            int i = 1;//Note that the counter here is placed outside of for to ensure that the count is valid.
            for (Element e : elementsData) {
                if (e.getParendId() == element.getId()) {
                    e.setExpanded(false);
                    elements.add(position + i, e);
                    i ++;
                }
            }
            treeViewAdapter.notifyDataSetChanged();
        }
    }

}