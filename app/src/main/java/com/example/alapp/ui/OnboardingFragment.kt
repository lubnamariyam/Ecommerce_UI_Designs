package com.example.alapp.ui

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.navigation.fragment.findNavController
import com.example.alapp.R
import com.example.alapp.utils.Common
import kotlinx.android.synthetic.main.fragment_onboarding.*


class onboardingFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_onboarding, container, false)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUi()

    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun initLogin(){

            login_button.setOnClickListener {
                if (Common.isOnline(requireContext())){
                    findNavController().navigate(R.id.action_onboardingFragment_to_loginFragment)
                }
                else{
                    Common.alertDialogTitleOneButton(requireContext(),"Internet Alert", "Please check your internet connectivity and try again","Retry")
                }

            } }



    @RequiresApi(Build.VERSION_CODES.M)
    fun initUi(){
        if (Common.isOnline(requireContext())){
            initLogin()
            initSkip()
        }
        else{
            Common.alertDialogTitleOneButton(requireContext(),"Internet Alert", "Please check your internet connectivity and try again","Retry")
        }

    }

    fun initSkip(){
        skip_button.setOnClickListener {

        }
    }
    }


