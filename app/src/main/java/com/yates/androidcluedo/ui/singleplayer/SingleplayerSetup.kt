package com.yates.androidcluedo.ui.singleplayer

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.yates.androidcluedo.R
import com.yates.androidcluedo.activity.GameActivity

const val PLAYER_NAME = "PLAYER_NAME"
const val NUM_BOTS = "NUM_BOTS"
const val PLAYER_CHARACTER = "PLAYER_CHARACTER"

class SingleplayerSetup : Fragment() {

    companion object {
        fun newInstance() =
            SingleplayerSetup()
    }

    private val viewModel: SingleplayerSetupViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.singleplayer_setup_fragment, container, false).apply {

            val playerNameEditText = findViewById<TextView>(R.id.playerName)

            val numBotsSpinner = findViewById<Spinner>(R.id.numBotsSpinner)?.apply {
                adapter = ArrayAdapter(
                    requireContext(),
                    R.layout.support_simple_spinner_dropdown_item,
                    arrayOf(1, 2, 3, 4, 5)
                )
            }

            val playerCharacterSpinner =
                findViewById<Spinner>(R.id.playerCharacterNameSpinner)?.apply {
                    adapter = ArrayAdapter(
                        requireContext(), R.layout.support_simple_spinner_dropdown_item,
                        viewModel.getCharacterOptions()
                    )
                    onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                        override fun onNothingSelected(parent: AdapterView<*>?) {
                            viewModel.setCharacterName(0)
                        }

                        override fun onItemSelected(
                            parent: AdapterView<*>?,
                            view: View?,
                            position: Int,
                            id: Long
                        ) {
                            viewModel.setCharacterName(position)
                        }
                    }
                }

            findViewById<Button>(R.id.startBtn)?.setOnClickListener {
                val gameActivityIntent = Intent(requireContext(), GameActivity::class.java).apply {
                    putExtra(PLAYER_NAME, playerNameEditText.text)
                    putExtra(NUM_BOTS, (numBotsSpinner?.selectedItem ?: 5) as Int)
                    putExtra(PLAYER_CHARACTER, viewModel.getCharacterName())
                }

                startActivity(gameActivityIntent)
            }
        }
}
