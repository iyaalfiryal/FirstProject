package com.example.firstproject;

fun main(args: Array<String>) {

    val character = 'Y'
    val char: Char = 'U'
    println("$character" + char + "S")

    // \t, \b , \n , \r , \' , \" , \\ and \$
    println("Hello world!")
    println("\tHello world!") // memberikan indentasi
    println("\nHello world!") // memberikan baris baru atau enter
    println("\'Hello world!") // memuat tanda '
    println("\"Hello world!") // memuat tanda "
    println("\\Hello world!") // memuat tanda \
    println("\$Hello world!") // memuat tanda $


    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    // operator AND atau Conjunction
    val isOpen = now >= officeOpen && now <= officeClosed
    println("Office is open : $isOpen")

    // operator OR atau Disjunction
    val isClose = now < officeOpen || now > officeClosed
    println("Office is closed : $isClose")

    // operator NOT atau Negation
    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }

    // arrays
    val arrays = arrayOf(1, 2, 3)
    val arrayMix = arrayOf(5, 6, 7, "Yusril kece", true)

    // array yang hanya berisikan satu tipe data primitive
    val arrX = intArrayOf(21, 22, 23, 24)
    val arrY = booleanArrayOf(true, true, false)
    val arrZ = charArrayOf('Y', 'o', 'e', 'n', 'a', 's')

    // membuat Array<String> dengan nilai ["0", "1", "4", "9", "16"]
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { print(it) }

    println()

    val basmallah = "Bismillah"
    for (b in basmallah) {
        println(b)
    }

    val karakterPertama = basmallah[0]
    println(karakterPertama)
    val karakterTerakhir = basmallah[8]
    println(karakterTerakhir)

    // mengambil karakter terakhir dengan fungsi
    val charTerakhir = basmallah.last()

    println("Bismillah")
    println("\tBismillah") // memberikan indentasi
    println("\nBismillah") // memberikan baris baru
    println("\'Bismillah") // memuat tanda '
    println("\"Bismillah") // memuat tanda "
    println("\\Bismillah") // memuat tanda \
    println("\$Bismillah") // memuat tanda $

    val supr = "Yoenas " + 19
    println(supr + "dev")

    val s = "Yus"
    println("$s.length is ${s.length}")

    var kosong: String? = null
    val kosongan: Int? = null
    val kekosongan: Array<String>? = null

    println(kosong)
    kosong = "Yusril"
    println(kosong)

    val name: String? = null

    // println(name.length) // compile time error

    // akses atau mengelola dengan if/else
    if (name != null) {
        val index = name.length // ready to go
    } else {
        println("kalau ini diprint, berarti value dari variablenya null")
    }

    // akses dengan Safe Calls
    println(name?.length)

    // akses dengan Elvis Operator
    println(name?.length ?: 7)


    var a = 9 // a bernilai 9
    var b = 10 // b bernilai 10

    a += b // berarti a = a + b
    println(a) // sekarang a bernilai 19

    a -= b // berarti a = a - b
    println(a) // sekarang a bernilai 9

    b -= a // berarti b = b - a
    println(b) // maka b bernilai 1


    println("a = $a")
    println("b = $b")
    // operator pembanding
    println("a > b = ${a > b}")
    println("a < b = ${a < b}")
    println("a >= b = ${a >= b}")
    println("a <= b = ${a <= b}")
    println("a == b = ${a == b}")
    println("a != b = ${a != b}")

    var angka = 9
    // increment
    println(angka++)
    println(++angka)

    // decrement
    println(angka--)
    println(--angka)
}
