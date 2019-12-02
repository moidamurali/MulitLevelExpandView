package com.murali.customtree.SubTree;

public class TreeNode {
    public boolean is_open;
    public TreeNode parent;
    public Object data;

    public TreeNode(TreeNode parent, Object data) {
        this.is_open = false;
        this.parent = parent;
        this.data = data;
    }

    public boolean Has_Children(TreeNode[] nodes) {
        boolean res = false;

        for (TreeNode n : nodes)
            if (n.parent == this) {
                res = true;
                break;
            }

        return res;
    }

    public int Count_Parents() {
        int res = 0;
        TreeNode n;

        for (n = this; n.parent != null; n = n.parent)
            res++;

        return res;
    }

    public static java.util.ArrayList<TreeNode> Get_Visible_Nodes(TreeNode parent, TreeNode[] nodes) {
        java.util.ArrayList<TreeNode> visible_nodes = null;

        visible_nodes = new java.util.ArrayList<TreeNode>();
        for (TreeNode n : nodes)
            if (n.parent == parent) {
                visible_nodes.add(n);
                if (n.is_open)
                    visible_nodes.addAll(Get_Visible_Nodes(n, nodes));
            }

        return visible_nodes;
    }
}