package com.example.alapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.RecyclerView
import com.example.alapp.R
import kotlinx.android.synthetic.main.myaddresslist.view.*

class MyOrderAdapter : RecyclerView.Adapter<MyOrderAdapter.ViewHolder>()  {






    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return MyOrderAdapter.ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.myorderslist2, parent, false)
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


    }

    override fun getItemCount(): Int {
        return 5
    }
}


