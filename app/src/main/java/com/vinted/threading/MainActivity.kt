package com.vinted.threading

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.rx2.rxSingle

class MainActivity : AppCompatActivity() {

    private val rxJava = RxJava()
    private val coroutines = Coroutines()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*RxJavaPlugins.setErrorHandler {
            Log.e(RX_LOG, "Error handler error: ${it.localizedMessage}")
        }*/

        /*Thread.setDefaultUncaughtExceptionHandler { thread, throwable ->
            Log.e(LOG, "Thread.UncaughtExceptionHandler error: ${throwable.localizedMessage}")
        }*/

        //rxJava.run()
        coroutines.run(lifecycleScope)
    }

    private companion object {
        private const val LOG = "LOG"
        private const val RX_LOG = "RX LOG"
        private const val COROUTINES_LOG = "COROUTINES LOG"
    }
}
