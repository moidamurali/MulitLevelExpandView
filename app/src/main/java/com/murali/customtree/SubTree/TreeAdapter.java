package com.murali.customtree.SubTree;

public class TreeAdapter extends android.widget.ArrayAdapter<TreeNode>
{
    public TreeNode[] nodes;
    public android.view.View.OnClickListener on_click_listener;

    public TreeAdapter(android.content.Context ctx, TreeNode[] nodes)
    {
        super(ctx, 0);

        this.nodes = nodes;
        this.addAll(TreeNode.Get_Visible_Nodes(null, this.nodes));
    }

    @Override
    public android.view.View getView(int idx, android.view.View view, android.view.ViewGroup parent_view)
    {
        android.widget.LinearLayout layout;
        android.widget.CheckBox handle;
        android.widget.TextView label;
        android.widget.LinearLayout.LayoutParams layout_params;
        TreeNode node;

        node=this.getItem(idx);

        handle = new android.widget.CheckBox(parent_view.getContext());
        handle.setTag(node);
        handle.setChecked(node.is_open);
        handle.setOnClickListener(this.on_click_listener);
        if (!node.Has_Children(this.nodes))
            handle.setVisibility(android.view.View.INVISIBLE);

        label = new android.widget.TextView(parent_view.getContext());
        label.setText(node.data.toString());
        label.setClickable(true);
        label.setGravity(android.view.Gravity.CENTER_VERTICAL);
        label.setOnClickListener(this.on_click_listener);
        label.setTag(node);
        label.setPadding(0, 0, 20, 0);

        layout = new android.widget.LinearLayout(parent_view.getContext());
        layout_params = new android.widget.LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, android.widget.LinearLayout.LayoutParams.WRAP_CONTENT);
        layout_params.leftMargin = node.Count_Parents() * 35;
        layout_params.topMargin = 0;
        layout_params.bottomMargin = 0;
        layout_params.rightMargin = 0;
        layout_params.gravity = android.view.Gravity.CENTER;
        layout.addView(handle, layout_params);
        layout_params = new android.widget.LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.FILL_PARENT, android.widget.LinearLayout.LayoutParams.FILL_PARENT);
        layout.addView(label, layout_params);

        return layout;
    }
}
