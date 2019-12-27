package com.murali.customtree;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.murali.multilevel.R;

import java.util.ArrayList;

/**
 * TreeViewAdapter
 *
 * @author Murali
 */
public class TreeViewAdapter extends BaseAdapter {
    /**
     * Elemental data sources
     */
    private ArrayList<Element> elementsData;
    /**
     * Elements in trees
     */
    private ArrayList<Element> elements;
    /**
     * LayoutInflater
     */
    private LayoutInflater inflater;
    /**
     * item Head indentation cardinality
     */
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
            holder.bottomView=  convertView.findViewById(R.id.line_bottom);
            holder.topView=  convertView.findViewById(R.id.line_top);
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
            holder.disclosureImg.setVisibility(View.VISIBLE);
        } else if (element.isHasChildren() && element.isExpanded()) {
            holder.disclosureImg.setVisibility(View.VISIBLE);
        } else if (!element.isHasChildren()) {
            holder.disclosureImg.setVisibility(View.INVISIBLE);
            notifyDataSetChanged();
        }
        if(element.getLevel() == 0 ){
            holder.topView.setVisibility(View.VISIBLE);
            if(element.isExpanded()) {
            holder.bottomView.setVisibility(View.GONE);}
            else{
                holder.bottomView.setVisibility(View.VISIBLE);
            }
        }
        else{
            holder.topView.setVisibility(View.GONE);
            holder.bottomView.setVisibility(View.GONE);
        }
        return convertView;
    }

    /**
     * Optimizing Holder
     *
     * @author Murali
     */
    static class ViewHolder {
        ImageView disclosureImg;
        TextView contentText;
        View topView,bottomView;
    }
}