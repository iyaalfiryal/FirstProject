package com.example.firstproject

fun main() {
    val age = 19
    val layers = 5
    cakeCandles(age)
    cakeTop(age)
    cakeBottom(age, layers)

    wishes(layers)

}

fun wishes(layers: Int){
    repeat(layers){
        println("ITS YOUR DAYY, THANKYOU FOR KEEP SURVIVING, I LOVE U")
    }
    println()
}

fun cakeCandles(age: Int) {
    print (" ")
    repeat(age) {
        print(",")
    }
    println() // Print an empty line

    print(" ") // Print the inset of the candles on the cake
    repeat(age) {
        print("|")
    }
    println()
}

fun cakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun cakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }

    println("\n")
}
