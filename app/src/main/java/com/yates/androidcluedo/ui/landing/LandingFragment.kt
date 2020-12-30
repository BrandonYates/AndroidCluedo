package com.yates.androidcluedo.ui.landing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.yates.androidcluedo.R
import com.yates.androidcluedo.ui.singleplayer.SingleplayerSetup

class LandingFragment : Fragment() {

    companion object {
        fun newInstance() =
            LandingFragment()
    }

    private val viewModel: LandingViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.landing_fragment, container, false).apply {
        findViewById<Button>(R.id.singleplayerBtn)?.setOnClickListener {
            requireActivity().supportFragmentManager.also { fm ->
                fm.beginTransaction().apply {
                    replace(R.id.contentFragment, SingleplayerSetup.newInstance())
                    addToBackStack("singleplayer_setup")
                    commit()
                }
            }
        }
    }
}
