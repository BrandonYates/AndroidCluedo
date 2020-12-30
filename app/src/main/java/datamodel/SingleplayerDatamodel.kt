package datamodel

import com.yates.androidcluedo.logic.Character

class SingleplayerDatamodel {

    fun characterOptions() =
        Character.values().map(Character::toString)
}