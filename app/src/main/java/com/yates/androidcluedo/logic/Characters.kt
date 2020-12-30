package com.yates.androidcluedo.logic

enum class Character {
    COL_MUSTARD, MISS_SCARLET, MR_GREEN, MRS_PEACOCK, MRS_WHITE, PROF_PLUM;

    companion object {
        fun valueOf(name: String): Character? =
            values().find {
                it.toString() == name
            }
    }

    override fun toString(): String =
        name.toLowerCase().replace("_", " ")
}