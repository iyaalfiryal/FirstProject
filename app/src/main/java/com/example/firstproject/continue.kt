package com.example.firstproject

fun main(){
    var sum = 0
    var i = 1
    while (i <= 10){
        i++
        if (i%2 == 1){
            continue
        }
        sum += i
        println(sum)
    }

    println(sum)
}