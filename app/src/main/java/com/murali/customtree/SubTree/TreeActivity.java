package com.murali.customtree.SubTree;

import java.util.LinkedList;

public class TreeActivity
        extends android.app.Activity
        implements android.view.View.OnClickListener
{
    public TreeNode[] nodes;
    TreeAdapter adapter;

    @Override
    public void onCreate(android.os.Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        android.widget.ListView list_view;

        nodes=new TreeNode[10];
        nodes[0]=new TreeNode(null, "Node 1");
        nodes[1]=new TreeNode(null, "Node 2");
        nodes[2]=new TreeNode(null, "Node 3");
        nodes[3]=new TreeNode(nodes[1], "Node 2.1");
        nodes[4]=new TreeNode(nodes[1], "Node 2.2");
        nodes[5]=new TreeNode(nodes[1], "Node 2.3");
        nodes[6]=new TreeNode(nodes[4], "Node 2.2.1");
        nodes[7]=new TreeNode(nodes[4], "Node 2.2.2");
        nodes[8]=new TreeNode(nodes[2], "Node 3.1");
        nodes[9]=new TreeNode(nodes[2], "Node 3.2");

        adapter=new TreeAdapter(this, nodes);
        adapter.on_click_listener=this;

        list_view = new android.widget.ListView(this);
        list_view.setAdapter(adapter);

        setContentView(list_view);
    }

    @Override
    public void onClick(android.view.View view)
    {
        TreeNode n;

        n=(TreeNode)view.getTag();

        if (view instanceof android.widget.CheckBox)
        {
            n.is_open = ((android.widget.CheckBox)view).isChecked();
            this.adapter.clear();
            this.adapter.addAll(TreeNode.Get_Visible_Nodes(null, this.nodes));
        }
        else
            android.widget.Toast.makeText(this, n.data.toString(), android.widget.Toast.LENGTH_LONG).show();
    }

   /* private void addChildren(TreeNode parent, LinkedList<MyObject> myOList) {
        for (MyObject myO : myOList) {
            TreeNode tn1 = new TreeNode(myO);
            parent.addChild(tn1);
            if (myO.getListOfChildren().size() > 0) {
                addChildren(tn1, myO.getListOfChildren());
            }
        }
    }*/
}