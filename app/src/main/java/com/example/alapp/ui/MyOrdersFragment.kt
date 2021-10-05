package com.example.alapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.alapp.Adapter.MyAddressAdapter
import com.example.alapp.Adapter.MyOrderAdapter
import com.example.alapp.R
import kotlinx.android.synthetic.main.fragment_my_address.*
import kotlinx.android.synthetic.main.fragment_my_orders.*

class MyOrdersFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_orders, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }



    fun initAdapter() {
        val layoutManager = LinearLayoutManager(requireContext())
        rv_myorders.layoutManager = layoutManager
        val adapter = MyOrderAdapter()
        rv_myorders.adapter = adapter
    }

}