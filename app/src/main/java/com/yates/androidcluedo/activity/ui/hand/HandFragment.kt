package com.yates.androidcluedo.activity.ui.hand

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.yates.androidcluedo.R

class HandFragment : Fragment() {

    private lateinit var handViewModel: HandViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        handViewModel =
            ViewModelProviders.of(this).get(HandViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_hand, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        handViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}