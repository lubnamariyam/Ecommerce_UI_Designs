package com.example.alapp.utils

import android.content.Context
import android.content.DialogInterface

import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build

import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar


class Common {
    companion object {
        @RequiresApi(Build.VERSION_CODES.M)
        fun isOnline(context: Context): Boolean {
            val connectivityManager =
                context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            if (connectivityManager != null) {
                val capabilities =
                    connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)
                if (capabilities != null) {
                    if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)) {
                        Log.i("Internet", "NetworkCapabilities.TRANSPORT_CELLULAR")
                        return true
                    } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {
                        Log.i("Internet", "NetworkCapabilities.TRANSPORT_WIFI")
                        return true
                    } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)) {
                        Log.i("Internet", "NetworkCapabilities.TRANSPORT_ETHERNET")
                        return true
                    }
                }
            }
            return false
        }

        fun alertDialogTitleOneButton(context: Context , title: String , message : String, positivebutton : String ){
            MaterialAlertDialogBuilder(context).setTitle(title).setMessage(message).setPositiveButton(positivebutton){
                dialog , which ->
                }.setCancelable(false)
                .show()
            }

        fun alertDialogTitleTwoButton(context: Context , title: String , message : String, positivebutton : String ,negativebutton : String ){
            MaterialAlertDialogBuilder(context).setTitle(title).setMessage(message).setPositiveButton(positivebutton){
                    dialog , which ->
            }.setNegativeButton(negativebutton){
                    dialog , which ->
            }
                .show()
        }

        fun customToast(context: Context , message: String){
            Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
        }

        fun customSnackBar(view : View, message: String){
            Snackbar.make(view, message, Snackbar.LENGTH_SHORT)
                .show()

        }

        }
    }
