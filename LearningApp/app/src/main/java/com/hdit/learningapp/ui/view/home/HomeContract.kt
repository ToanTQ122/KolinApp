package com.hdit.learningapp.ui.view.home

import com.hdit.learningapp.ui.base.BasePresenter

interface HomeContract {

    interface Presenter : BasePresenter<View> {

        fun getTrending()

        fun getRandom()
    }

    interface View {

//        fun onGetTrendingSuccess(gifs: MutableList<Gif>)
//
//        fun onGetRandomSuccess(gifs: MutableList<Gif>)
//
//        fun onError(exception: Exception?)
    }
}
