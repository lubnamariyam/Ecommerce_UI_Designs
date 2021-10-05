package com.example.alapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.alapp.R
import kotlinx.android.synthetic.main.myaddresslist.view.*

class MyAddressAdapter(var fragment: Fragment) : RecyclerView.Adapter<MyAddressAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyAddressAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.myaddresslist, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyAddressAdapter.ViewHolder, position: Int) {
        if (position == 0){
            holder.checkDefaultAddress.visibility = View.VISIBLE
        }
        else{
            holder.checkDefaultAddress.visibility = View.GONE
        }

        holder.clickButtonEdit.setOnClickListener {
            findNavController(fragment).navigate(R.id.action_myAddressFragment_to_addAddressFragment)
        }





    }

    override fun getItemCount(): Int {
        return 3

    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var checkDefaultAddress = itemView.iv_checkDefault!!
        var clickButtonEdit = itemView.iv_edit!!

    }

}