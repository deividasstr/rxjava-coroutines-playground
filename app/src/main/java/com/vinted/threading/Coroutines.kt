package com.vinted.threading

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.runBlocking

class Coroutines {

    fun run(coroutineScope: CoroutineScope) {
        runBlocking {
            calculating()
        }
    }

    private suspend fun calculating() {
        (1 until 99999).forEach {
            (it until 99999999).forEach {
                (it until 99999999).forEach {
                    it * it
                }
            }
        }
        println("Done")
    }
}