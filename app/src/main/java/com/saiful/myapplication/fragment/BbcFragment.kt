package com.saiful.myapplication.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.saiful.myapplication.R
import com.saiful.myapplication.global.Constant


class BbcFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bbc, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        Log.d("TAG", "BBC Fragment Created-> ${Constant.category}")
//        Constant.category = "BBC Fragment"
        Log.d("TAG", "BBC Fragment -> ${Constant.category}")
    }
}