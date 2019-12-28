package com.murali.customexpandable;



import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * TreeView item Click events
 * @author Murali
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
        Elements.ElementsData element = (Elements.ElementsData) treeViewAdapter.getItem(position);
        //Elements in trees
        ArrayList<Elements.ElementsData> elements = treeViewAdapter.getElements();
        //Element data source
        ArrayList<Elements.ElementsData> elementsData = treeViewAdapter.getElementsData();


        //Click on item without subitem to return directly
        if (!element.isHasChildren()) {
            Toast.makeText(view.getContext(),elements.get(position).getTitle() + ":::" + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            collapseOthers(element, elements);
            treeViewAdapter.notifyDataSetChanged();
            return;
        }

        if (element.isExpanded()) {
            collapse(position, element, elements);
        } else {
            Expend(position, element, elements, elementsData);
        }
        treeViewAdapter.notifyDataSetChanged();
    }

    private void Expend(int position, Elements.ElementsData element, ArrayList<Elements.ElementsData> elements, ArrayList<Elements.ElementsData> elementsData) {
        //Extract the data from the data source and add it to the tree. Note that only the next level of the data is added here to simplify the logic.
        element.setExpanded(true);
        int i = 1;//Note that the counter here is placed outside of for to ensure that the count is valid.
        for (Elements.ElementsData e : elementsData) {
            if (e.getParentId() == element.getId()) {
                e.setExpanded(false);
                elements.add(position + i, e);
                i ++;
            }
        }
        collapseOthers(element, elements);
    }

    private void collapseOthers(Elements.ElementsData element, ArrayList<Elements.ElementsData> elements) {
        ArrayList<String> parents =new ArrayList<>();

        getParents(element.getId(), elements, parents);

        for (int j = 0; j < elements.size(); j++) {
            if (!parents.contains(elements.get(j).getId())) {
                    collapse(j, elements.get(j), elements);
                }
            }
    }

    private void getParents(String id, ArrayList<Elements.ElementsData> elements, ArrayList<String> parents) {

            for(int j =0;j<elements.size();j++){
                if(elements.get(j).getId() == id) {
                    parents.add(elements.get(j).getId());
                    if(!elements.get(j).getParentId().equalsIgnoreCase(elements.get(j).getId())) {
                        getParents(elements.get(j).getParentId(),elements,parents);
                    }
            }
        }
    }

    private void collapse(int position, Elements.ElementsData element, ArrayList<Elements.ElementsData> elements) {
        element.setExpanded(false);
        //Delete the corresponding sub-node data within the node, including the sub-node of the sub-node.
        ArrayList<Elements.ElementsData> elementsToDel = new ArrayList<Elements.ElementsData>();
        for (int i = position + 1; i < elements.size(); i++) {
            if (element.getLevel() >= elements.get(i).getLevel())
                break;
            elementsToDel.add(elements.get(i));
        }
        elements.removeAll(elementsToDel);
    }
}