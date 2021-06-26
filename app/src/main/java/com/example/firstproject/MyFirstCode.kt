package com.example.firstproject

fun main(args: Array<String>) {

    // Nama seorang muslim
    val name = "Yusril"
    val age = 19

    salam(name)
    berkah(name, age)
    kebaikan(name)
    perlindunganSafar(name)
}

fun salam(name: String){
    // Salam sekaligus doa bagi sesama umat Islam
    // Semoga keselamatan, rahmat dan berkah dari Allah untukmu
    println("Assalamu'alaikum Warahmatullahi Wabarakatuh, ${name}")
}

fun berkah(name: String, age: Int){
    // Semoga Allah melimpahkan keberkahan-Nya padamu
    println("Barakallahu fiik ${name} atas ${age} tahunnya merasakan manis pahit kehidupan..")
    lilinKueUlangTahun(age)
    kueUlangTahun(age)
}

fun lilinKueUlangTahun(age: Int){
    print(" ")
    repeat(age){
        print(",")
    }
    println()

    print(" ")
    repeat(age){
        print("|")
    }
    println()
}

fun kueUlangTahun(wide: Int){
    repeat (4){
        repeat (wide + 2){
            print("@")
        }
        println()
    }
    println()
}

fun kebaikan(name: String){
    // Semoga Allah membalasmu dengan kebaikan
    println("Jazakallahu khairan, ${name}")
}

fun perlindunganSafar(name: String){
    // Semoga engkau dalam lindungan Allah
    println("Fii amanillah, ${name}")
}