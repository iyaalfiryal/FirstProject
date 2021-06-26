package com.example.firstproject

fun main(){
    var jam = 49
    when(jam) {
        in 1..5 -> println("bayar parkir sebanyak\$${jam * 1.0}")
        in 6..23 -> println("bayar parkir sebanyak \$${((jam - 5.0) * 0.5) + 5}")
        else -> println("bayar parkir sebanyak \$${(jam % 24.0) * 0.5 + (jam/24 * 15)} ")














//        println("maka dikenakan pembayaran ${( + jam) * 0.5}")
//        else -> println("maka dikenakan pembayaran ${1*15}")
    }

//    while(jam <= 5) {
//        result = jam * 1
//        if (jam >= 5) {
//            result += jam
//            result2 = (result * 0.5).toInt()
//        }
//        println(message = result2)
//    }


}