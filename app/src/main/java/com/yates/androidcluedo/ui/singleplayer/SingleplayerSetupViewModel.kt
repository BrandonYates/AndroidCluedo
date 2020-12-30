package com.yates.androidcluedo.ui.singleplayer

import androidx.lifecycle.ViewModel
import datamodel.SingleplayerDatamodel

class SingleplayerSetupViewModel : ViewModel() {

    private lateinit var characterName: String
    private lateinit var playerName: String
    private var numBots: Int = 5
    private val datamodel = SingleplayerDatamodel()

    fun getCharacterOptions() =
        datamodel.characterOptions()

    fun setCharacterName(position: Int) {
        characterName = datamodel.characterOptions()[position]
    }

    fun setNumBots(num: Int) {
        numBots = num
    }

    fun getNumBots() =
        numBots

    fun getCharacterName() =
        characterName

    fun getPlayerName() =
        playerName
}
