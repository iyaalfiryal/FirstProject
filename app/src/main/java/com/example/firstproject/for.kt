package com.example.firstproject

fun main() {
    val name = "Yusril"
    for (name in name) {
        println("\"$name\"")
    }

    for(index in (19.downTo(9) step 3)){
        println(index)
    }

    val range = 1.rangeTo(9)
    range.forEachIndexed { index, i ->
        println("index $index bernilai $i")
    }
}