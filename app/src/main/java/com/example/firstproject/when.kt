package com.example.firstproject

fun main(){
    when(4){
        1 -> println("ready")
        2 -> println("set")
        3 -> println("go")
    else -> println("command is not ready, set and go")
    }

    when(4){
        in 1..3 -> println("value is in the range")
        !in 1..3 -> println("value is outside the valid")
        in 0..3 -> println("actually value is in the range")
        else -> println("value is in the range")
    }
}