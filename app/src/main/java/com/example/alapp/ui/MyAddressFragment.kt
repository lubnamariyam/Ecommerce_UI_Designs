package com.example.alapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.alapp.Adapter.MyAddressAdapter
import com.example.alapp.R
import kotlinx.android.synthetic.main.fragment_my_address.*


class MyAddressFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_address, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    fun initAdapter() {
        val layoutManager = LinearLayoutManager(requireContext())
        rv_myaddress.layoutManager = layoutManager
        val adapter = MyAddressAdapter(this)
        rv_myaddress.adapter = adapter
    }


}