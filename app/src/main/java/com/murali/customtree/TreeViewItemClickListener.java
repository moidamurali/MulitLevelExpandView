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

    private void Expend(int position, Element element, ArrayList<Element> elements, ArrayList<Element> elementsData) {
        //Extract the data from the data source and add it to the tree. Note that only the next level of the data is added here to simplify the logic.
        element.setExpanded(true);
        int i = 1;//Note that the counter here is placed outside of for to ensure that the count is valid.
        for (Element e : elementsData) {
            if (e.getParendId() == element.getId()) {
                e.setExpanded(false);
                elements.add(position + i, e);
                i ++;
            }
        }
        collapseOthers(element, elements);
    }

    private void collapseOthers(Element element, ArrayList<Element> elements) {
        ArrayList<Integer> parents =new ArrayList<>();

        getParents(element.getId(), elements, parents);

        for (int j = 0; j < elements.size(); j++) {
            if (!parents.contains(elements.get(j).getId())) {
                    collapse(j, elements.get(j), elements);
                }
            }
    }

    private void getParents(int id, ArrayList<Element> elements, ArrayList<Integer> parents) {

            for(int j =0;j<elements.size();j++){
                if(elements.get(j).getId() == id) {
                    parents.add(elements.get(j).getId());
                    if(elements.get(j).getParendId() != -1) {
                        getParents(elements.get(j).getParendId(),elements,parents);
                    }
            }
        }
    }

    private void collapse(int position, Element element, ArrayList<Element> elements) {
        element.setExpanded(false);
        //Delete the corresponding sub-node data within the node, including the sub-node of the sub-node.
        ArrayList<Element> elementsToDel = new ArrayList<Element>();
        for (int i = position + 1; i < elements.size(); i++) {
            if (element.getLevel() >= elements.get(i).getLevel())
                break;
            elementsToDel.add(elements.get(i));
        }
        elements.removeAll(elementsToDel);
    }
}