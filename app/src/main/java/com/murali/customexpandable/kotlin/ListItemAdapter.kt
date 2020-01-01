package com.murali.customexpandable.kotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.murali.customexpandable.R
import java.util.*

class ListItemAdapter(val parentItems : ArrayList<Elements.ElementsData>,
                      val elementsData : ArrayList<Elements.ElementsData>,
                      val context: Context): RecyclerView.Adapter<ListItemAdapter.ItemViewHolder>(){

    /**
     * item Head indentation cardinality
     */
    private val indentionBase = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        //To change body of created functions use File | Settings | File Templates.
        //var inflator : LayoutInflater = LayoutInflater.from(parent?.context)
        //var view : View = inflator.inflate(R.layout.treeview_item, null)

        var view = LayoutInflater.from(parent?.context).inflate(R.layout.treeview_item, null)

        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
       //To change body of created functions use File | Settings | File Templates.
        //return parentItems!=null ? parentItems.size : 0
        return parentItems.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        //To change body of created functions use File | Settings | File Templates.
        holder!!.bindElementsData(parentItems.get(position))
        setElementsDataToView(holder,parentItems.get(position))
    }


    class ItemViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {

        var disclosureImg: ImageView? = null
        var contentText: TextView? = null
        var topView: View? = null
        var bottomView: View? = null

        fun bindElementsData(data : Elements.ElementsData){

            disclosureImg = itemView?.findViewById(R.id.disclosureImg) as ImageView
            contentText = itemView?.findViewById(R.id.contentText) as TextView
            topView = itemView?.findViewById(R.id.line_top) as View
            bottomView = itemView?.findViewById(R.id.line_bottom) as View

            contentText!!.text = data.title
        }

    }


    fun setElementsDataToView(holder: ItemViewHolder?, element : Elements.ElementsData){
        val level: Int = element.level
        holder?.disclosureImg!!.setPadding(indentionBase * (level + 1),
                holder?.disclosureImg!!.getPaddingTop(),
                holder?.disclosureImg!!.getPaddingRight(),
                holder?.disclosureImg!!.getPaddingBottom())
        holder?.contentText!!.setText(element.title)
        if (element.hasChildren && !element.isExpanded) {
            holder.disclosureImg!!.setVisibility(View.VISIBLE)
        } else if (element.hasChildren && element.isExpanded) {
            holder.disclosureImg!!.setVisibility(View.VISIBLE)
        } else if (!element.hasChildren) {
            holder.disclosureImg!!.setVisibility(View.INVISIBLE)
            //notifyDataSetChanged()
        }
        if (element.level == 0) {
            holder.topView!!.setVisibility(View.VISIBLE)
            if (element.isExpanded) {
                holder.bottomView!!.setVisibility(View.GONE)
            } else {
                holder.bottomView!!.setVisibility(View.VISIBLE)
            }
        } else {
            holder.topView!!.setVisibility(View.GONE)
            holder.bottomView!!.setVisibility(View.GONE)
        }
    }

}