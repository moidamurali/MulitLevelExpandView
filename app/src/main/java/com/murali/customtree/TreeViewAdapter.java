package com.murali.customtree;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.murali.multilevel.R;

import java.util.ArrayList;
import java.util.List;

/**
 * TreeViewAdapter
 * @author carrey
 *
 */
public class TreeViewAdapter extends BaseAdapter {
    /** Elemental data sources*/
    private ArrayList<Element> elementsData;
    /** Elements in trees*/
    private ArrayList<Element> elements;
    /** LayoutInflater */
    private LayoutInflater inflater;
    /** item Head indentation cardinality*/
    private int indentionBase;

    public TreeViewAdapter(ArrayList<Element> elements, ArrayList<Element> elementsData, LayoutInflater inflater) {
        this.elements = elements;
        this.elementsData = elementsData;
        this.inflater = inflater;
        indentionBase = 50;
    }

    public ArrayList<Element> getElements() {
        return elements;
    }

    public ArrayList<Element> getElementsData() {
        return elementsData;
    }

    @Override
    public int getCount() {
        return elements.size();
    }

    @Override
    public Object getItem(int position) {
        return elements.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.treeview_item, null);
            holder.disclosureImg = (ImageView) convertView.findViewById(R.id.disclosureImg);
            holder.contentText = (TextView) convertView.findViewById(R.id.contentText);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Element element = elements.get(position);
        int level = element.getLevel();
        holder.disclosureImg.setPadding(indentionBase * (level + 1),
                holder.disclosureImg.getPaddingTop(),
                holder.disclosureImg.getPaddingRight(),
                holder.disclosureImg.getPaddingBottom());
        holder.contentText.setText(element.getContentText());
        if (element.isHasChildren() && !element.isExpanded()) {
            holder.disclosureImg.setImageResource(R.drawable.down_arrow);
            //Actively set icon visibility here, because convertView may be a reuse of "set invisible" view, the same below.
            holder.disclosureImg.setVisibility(View.VISIBLE);
        } else if (element.isHasChildren() && element.isExpanded()) {
            holder.disclosureImg.setImageResource(R.drawable.up_arrow);
            holder.disclosureImg.setVisibility(View.VISIBLE);
        } else if (!element.isHasChildren()) {
            holder.disclosureImg.setImageResource(R.drawable.down_arrow);
            holder.disclosureImg.setVisibility(View.INVISIBLE);
            collapseBrotherNode(element);
            notifyDataSetChanged();
        }
        return convertView;
    }

    /**
     * Optimizing Holder
     * @author carrey
     *
     */
    static class ViewHolder{
        ImageView disclosureImg;
        TextView contentText;
    }

    @NonNull
    private List<Element> backupDisplayNodes() {
        List<Element> temp = new ArrayList<>();
        for (Element displayNode : elementsData) {
           /* try {
                temp.add(displayNode.clone());
            } catch (CloneNotSupportedException e) {
                temp.add(displayNode);
            }*/
        }
        return temp;
    }

    public void collapseBrotherNode(Element pNode) {
        List<Element> temp = backupDisplayNodes();
        if (pNode.isHasChildren()) {
            List<Element> roots = new ArrayList<>();
            for (Element displayNode : elementsData) {
                if (displayNode.isHasChildren())
                    roots.add(displayNode);
            }
            //Close all root nodes.
            for (Element root : roots) {
                if (root.isExpanded() && !root.equals(pNode))
                    removeChildNodes(root);
            }
        }/* else {
            Element parent = pNode.getParent();
            if (parent == null)
                return;
            List<Element> childList = parent.getChildList();
            for (Element node : childList) {
                if (node.equals(pNode) || !node.isExpanded())
                    continue;
                removeChildNodes(node);
            }
        }*/
        //notifyDiff(temp);
    }

    private int removeChildNodes(Element pNode) {
        return removeChildNodes(pNode, true);
    }

    private int removeChildNodes(Element pNode, boolean shouldToggle) {
        if (pNode.isHasChildren())
            return 0;
        List<Element> childList = getChildList();
        int removeChildCount = childList.size();
        elementsData.removeAll(childList);

       /* if (shouldToggle)
            pNode.toggle();*/
        return removeChildCount;
    }

    public List<Element> getChildList() {
        return elements;
    }


/*    private void notifyDiff(final List<Element> temp) {
        DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(new DiffUtil.Callback() {
            @Override
            public int getOldListSize() {
                return temp.size();
            }

            @Override
            public int getNewListSize() {
                return displayNodes.size();
            }

            // judge if the same items
            @Override
            public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
                return TreeViewAdapter.this.areItemsTheSame(temp.get(oldItemPosition), displayNodes.get(newItemPosition));
            }

            // if they are the same items, whether the contents has bean changed.
            @Override
            public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
                return TreeViewAdapter.this.areContentsTheSame(temp.get(oldItemPosition), displayNodes.get(newItemPosition));
            }

            @Nullable
            @Override
            public Object getChangePayload(int oldItemPosition, int newItemPosition) {
                return TreeViewAdapter.this.getChangePayload(temp.get(oldItemPosition), displayNodes.get(newItemPosition));
            }
        });
        diffResult.dispatchUpdatesTo(this);
    }

    // For DiffUtil, if they are the same items, whether the contents has bean changed.
    private boolean areContentsTheSame(Element oldNode, Element newNode) {
        return oldNode.getContent() != null && oldNode.getContent().equals(newNode.getContent())
                && oldNode.isExpand() == newNode.isExpand();
    }

    private Object getChangePayload(Element oldNode, Element newNode) {
        Bundle diffBundle = new Bundle();
        if (newNode.isExpanded() != oldNode.isExpanded()) {
            diffBundle.putBoolean(KEY_IS_EXPAND, newNode.isExpanded());
        }
        if (diffBundle.size() == 0)
            return null;
        return diffBundle;
    }

    // judge if the same item for DiffUtil
    private boolean areItemsTheSame(TreeNode oldNode, TreeNode newNode) {
        return oldNode.getContent() != null && oldNode.getContent().equals(newNode.getContent());
    }*/


}