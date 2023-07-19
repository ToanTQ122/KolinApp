package com.hdit.learningapp.ui.base

import android.os.Bundle
import androidx.lifecycle.ViewModel
import com.hdit.learningapp.utils.constants.Constant
import com.hdit.learningapp.utils.constants.State
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers


abstract class BaseViewModel : ViewModel() {

    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    fun Disposable.track() = compositeDisposable.add(this)

    inline fun <T> Observable<T>.fetchData(
        crossinline success: (T) -> Unit,
        crossinline error: (Throwable) -> Unit,
        crossinline state: (State) -> Unit
    ) {
        subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe {
                state(State.LOADING)
            }
            .subscribe(
                { data ->
                    state(State.SUCCESS)
                    success(data)
                },
                { throwable ->
                    state(State.ERROR)
                    error(throwable)
                }
            ).track()
    }

    override fun onCleared() = compositeDisposable.dispose()

    open fun getArguments(bundle: Bundle) {}
}