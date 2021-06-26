package com.example.firstproject

fun main(){
    val sum = 1 + 9
    val sub = 6 - 2
    val multiplication = 1 * 9
    val division = 56 / 7

    val math = 10 / (6 - 2) + 4 * 8
    val math2 = (((10 / 6) - 2) + 4) * 8
    println(math2)


    val a = sum.toDouble()
    val b = sub.toDouble()
    val c = multiplication.toDouble()
    val d = division.toDouble()

    val mod: Double = a % b
    val mod2: Double = d % c
    val mod3: Double = 10.0 % 3.3
    val mod4: Double = 5.0 % 7

//    println(a)
//    println(b)
//    println(d)
//    println(c)
//    println(mod)
//    println(mod2)
//    println(mod3)
//    println(mod4)

    tambah(12, 3)
    kali(12, 3)
    bagi(12, 3)
    kurang(12, 3)
}

fun tambah(a: Int, b: Int){
    val result = a + b
    println(result)
}

fun kurang(a: Int, b: Int){
    val result = a - b
    println(result)
}

fun bagi(a: Int, b: Int){
    val result = a / b
    println(result)
}

fun kali(a: Int, b: Int){
//    val result = a * b
    println("${a*b}")
}
