package com.example.firstproject

fun main(args: Array<String>) {
    val one = 1 // Int

    val threeBillion = 3000000000 // Long karena melebihi nilai maksismum Int
    // threeBillion = 1000 // menyebabkan error

    var oneLong = 1L // Long, dengan menambahkan L pada akhiran value
    oneLong = 24L // tidak masalah untuk diubah

    var oneByte: Byte = 1 // nilai variable telah ditetapkan sebagai Byte

    val pi = 3.14 // Double
    println(pi)
    val e = 2.7182818284 // Double
    println(e)
    val eFloat = 2.7182818284f // Float, nilai sesungguhnya 2.7182817
    println(eFloat)

    val oneMillion = 1_000_000
    println(oneMillion)
    val creditCardNumber = 1234_5678_9012_3456L
    println(creditCardNumber)
    val socialSecurityNumber = 999_99_9999L
    println(socialSecurityNumber)

    val sum = one + oneLong
    println(sum)

    val sub = oneByte - oneLong
    println(sub)

    val multiplication = one * oneByte
    println(multiplication)

    val division = threeBillion / oneMillion
    println(division)

    val math = ((((one + threeBillion) - oneLong) * oneByte) / oneMillion)
    println(math)

    val modulus = 25 % 3.14
    println(modulus)

    val modulus2 = 25 % 2
    println(modulus2)

    val modulus3 = 25 % 1
    println(modulus3)

    val besar: Int = 35
    val convertToByte: Byte = besar.toByte()
    val convertToDouble: Double = besar.toDouble()
    println(convertToDouble)
    val convertToLong: Long = convertToDouble.toLong()
    val convertToChar: Char = besar.toChar()
    println(convertToChar)

    val char: Char = 'ಢ'
    val convertToInt: Int = char.toInt()
    println(convertToInt)
}
