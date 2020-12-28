package com.yates.androidcluedo.ui.board

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.yates.androidcluedo.R

class BoardFragment : Fragment() {

    private val boardViewModel: BoardViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_board, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        boardViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}