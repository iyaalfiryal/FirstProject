package com.example.firstproject

fun main(){
    var a = !true
    println(a)

    var d = !false
    println(d)

    val isOpen = true && false
    println("office is open : $isOpen")

    val isClose = false || true
    println("office is close : $isClose")

    val open = true && !false
    println("office is open : $isOpen")
}