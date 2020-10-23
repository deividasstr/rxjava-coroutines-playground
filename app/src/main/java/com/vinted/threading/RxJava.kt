package com.vinted.threading

import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy

class RxJava {

    fun run() {

        val disposable = Flowable.just(1)
            .map { it * 2 }
            .observeOn(AndroidSchedulers.mainThread())
            .map { it + 1 }
            .subscribeBy(
                onNext = ::println,
                onError = { t ->
                    println("Error ${t.message}")
                },
                onComplete = {
                    println("Completed")
                }
            )
    }
}
