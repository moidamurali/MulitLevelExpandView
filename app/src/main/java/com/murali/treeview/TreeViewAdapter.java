package com.murali.treeview;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.murali.multilevel.R;

import java.util.ArrayList;
import java.util.List;

public class TreeViewAdapter extends BaseAdapter {
    private static final int TREE_ELEMENT_PADDING_VAL = 25;
    private List<TreeElementInfo> fileList;
    private Context context;
    private Bitmap iconCollapse;
    private Bitmap iconExpand;
    //private Dialog dialog;
    //private XTreeViewClassif treeView;

    public TreeViewAdapter(Context context, List<TreeElementInfo> fileList/*, Dialog dialog, XTreeViewClassif treeView*/) {
        this.context = context;
        this.fileList = fileList;
       // this.dialog = dialog;
        //this.treeView = treeView;
        iconCollapse = BitmapFactory.decodeResource(context.getResources(), R.drawable.up_arrow);
        iconExpand = BitmapFactory.decodeResource(context.getResources(), R.drawable.down_arrow);
    }

    public List<TreeElementInfo> getListData() {
        return this.fileList;
    }

    @Override
    public int getCount() {
        return this.fileList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.fileList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        convertView = View.inflate(context, R.layout.treeview_list_item, null);
        holder = new ViewHolder();
        holder.setTextView((TextView) convertView.findViewById(R.id.text));
        holder.setImageView((ImageView) convertView.findViewById(R.id.icon));
        convertView.setTag(holder);

        final TreeElementInfo elem = (TreeElementInfo) getItem(position);

        int level = elem.getLevel();
        holder.getIcon().setPadding(TREE_ELEMENT_PADDING_VAL * (level + 1), holder.icon.getPaddingTop(), 0, holder.icon.getPaddingBottom());
        holder.getText().setText(elem.getOutlineTitle());
        if (elem.isHasChild() && (elem.isExpanded() == false)) {
            holder.getIcon().setImageBitmap(iconCollapse);
        } else if (elem.isHasChild() && (elem.isExpanded() == true)) {
            holder.getIcon().setImageBitmap(iconExpand);
        } else if (!elem.isHasChild()) {
            holder.getIcon().setImageBitmap(iconCollapse);
            holder.getIcon().setVisibility(View.INVISIBLE);
        }

        IconClickListener iconListener = new IconClickListener(this, position);
        TextClickListener txtListener = new TextClickListener((ArrayList<TreeElementInfo>) this.getListData(), position);
        holder.getIcon().setOnClickListener(iconListener);
        holder.getText().setOnClickListener(txtListener);
        return convertView;
    }

    private class ViewHolder {
        ImageView icon;
        TextView text;

        public TextView getText() {
            return this.text;
        }

        public void setTextView(TextView text) {
            this.text = text;
        }

        public ImageView getIcon() {
            return this.icon;
        }

        public void setImageView(ImageView icon) {
            this.icon = icon;
        }
    }

    /**
     * Listener For TreeElement Text Click
     */
    private class TextClickListener implements View.OnClickListener {
        private ArrayList<TreeElementInfo> list;
        private int position;

        public TextClickListener(ArrayList<TreeElementInfo> list, int position) {
            this.list = list;
            this.position = position;
        }

        @Override
        public void onClick(View v) {
            //treeView.setXValue(String.valueOf(list.get(position).getId()));
            //dialog.dismiss();
        }
    }

    /**
     * Listener for TreeElement "Expand" button Click
     */
    private class IconClickListener implements View.OnClickListener {
        private ArrayList<TreeElementInfo> list;
        private TreeViewAdapter adapter;
        private int position;

        public IconClickListener(TreeViewAdapter adapter, int position) {
            this.list = (ArrayList<TreeElementInfo>) adapter.getListData();
            this.adapter = adapter;
            this.position = position;
        }

        @Override
        public void onClick(View v) {
            if (!list.get(position).isHasChild()) {
                return;
            }

            if (list.get(position).isExpanded()) {
                list.get(position).setExpanded(false);
                TreeElementInfo element = list.get(position);
                ArrayList<TreeElementInfo> temp = new ArrayList<TreeElementInfo>();

                for (int i = position + 1; i < list.size(); i++) {
                    if (element.getLevel() >= list.get(i).getLevel()) {
                        break;
                    }
                    temp.add(list.get(i));
                }
                list.removeAll(temp);
                adapter.notifyDataSetChanged();
            } else {
                TreeElementInfo obj = list.get(position);
                obj.setExpanded(true);
                int level = obj.getLevel();
                int nextLevel = level + 1;

                for (TreeElementInfo element : obj.getChildList()) {
                    element.setLevel(nextLevel);
                    element.setExpanded(false);
                    list.add(position + 1, element);
                }
                adapter.notifyDataSetChanged();
            }
        }
    }
}