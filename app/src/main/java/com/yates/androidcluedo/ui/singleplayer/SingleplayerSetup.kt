package com.yates.androidcluedo.ui.singleplayer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.yates.androidcluedo.R

class SingleplayerSetup : Fragment() {

    companion object {
        fun newInstance() =
            SingleplayerSetup()
    }

    private val viewModel: SingleplayerSetupViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.singleplayer_setup_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // TODO: Use the ViewModel
    }

}
