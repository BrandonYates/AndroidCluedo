package com.yates.androidcluedo.activity.ui.singleplayer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.yates.androidcluedo.R

class SingleplayerSetup : Fragment() {

    companion object {
        fun newInstance() =
            SingleplayerSetup()
    }

    private lateinit var viewModel: SingleplayerSetupViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.singleplayer_setup_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SingleplayerSetupViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
