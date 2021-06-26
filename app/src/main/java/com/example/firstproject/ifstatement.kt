package com.example.firstproject


fun main() {
    var a = 9
    var b = 10

    var max = a
    if (a > b) max = b

    var min: Int
    if (a > b) {
        min = b
    } else {
        min = a
    }
    println(min)

    max = if (a > b) a else b
    min = if (a < b) a else b

    println(max)
    println(min)
    calculate(90, '-', 10)
}

fun calculate(a: Int,char: Char, b: Int){
    if (char == '+'){
        println("${a + b}")
    }else if (char == '-'){
        println("${a - b}")
    }else if (char == '/'){
        println("${a / b}")
    }else if (char == '*'){
        println("${a * b}")
    }
}