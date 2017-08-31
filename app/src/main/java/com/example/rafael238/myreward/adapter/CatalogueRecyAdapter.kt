package com.example.rafael238.myreward.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rafael238.myreward.R
import com.example.rafael238.myreward.viewHolder.CatalogueRecyHeadAdapter
import com.example.rafael238.myreward.viewHolder.CatalogueRecyListViewHolder

/**
 * Created by rafael238 on 8/31/17.
 */
class CatalogueRecyAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        when(viewType) {
            0 -> return LayoutInflater.from(parent
                    .let { it?.context }).inflate(R.layout.catalogue_head, parent, false)
                    .let { CatalogueRecyHeadAdapter(it) }
            1 -> return LayoutInflater.from(parent
                    .let { it?.context }).inflate(R.layout.catalogue_list, parent, false)
                    .let { CatalogueRecyListViewHolder(it) }
        }
        
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {

    }

    override fun getItemCount(): Int {

    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }
}