package com.example.kotlinbasics.advnaced.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.*

fun main()  =  runBlocking {
    launch {
        delay(2000L)
        println("Hello")
    }
    delay(1000L)
    println("world")


//    GlobalScope.launch(Dispatchers.IO) { // launch new coroutine in background and continue
//        delay(1000L)
//        println("World!")
//    }
//    println("Hello,") // main thread continues here immediately
//    runBlocking {     // but this expression blocks the main thread
//        delay(2000L)  // ... while we delay for 2 seconds to keep JVM alive
//    }
// https://kotlinlang.org/docs/coroutines-basics.html#your-first-coroutine

}

