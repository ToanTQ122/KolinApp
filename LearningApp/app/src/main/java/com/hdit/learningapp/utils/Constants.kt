package com.hdit.learningapp.utils.constants
object Constant {
    // Constants
    const val BASE_URL = "https://api.giphy.com/v1/"

    // Enum
    enum class MenuItem { HOME, COURSE, SETTING }

    const val  NOTO_SAN_FONT = "Noto Sans"
    const val EMPTY = ""
    const val POSTER_PATH = "https://image.tmdb.org/t/p/w600_and_h900_bestv2"
    const val BACKDROP_PATH = "https://image.tmdb.org/t/p/w533_and_h300_bestv2"

    const val ID = "id"

    const val PREF_HISTORY = "PREF_HISTORY"

    const val YYYY_DD_MM_1 = "yyyy    dd    MM"
    const val YYYY_DD_MM_2 = "yyyy-dd-MM"

    const val DELAY_TIME = 3000L

    const val DELAY_REQUEST = 300L
}

enum class State {
    LOADING,
    LOAD_MORE,
    SUCCESS,
    ERROR
}
