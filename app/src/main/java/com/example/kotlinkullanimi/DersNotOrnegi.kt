package com.example.kotlinkullanimi

import java.util.Scanner

fun main() {

    val dersler = Array<String>(5){""}  //{"","","","",""}
    val notlar = Array<Int>(5){0} //{0,0,0,0,0}

    val girdi = Scanner(System.`in`)

    for (i in 0 until dersler.count())  { //0,1,2,3,4
        print("${i+1}. dersi giriniz:")
        val ders =  girdi.next()
        dersler[i] = ders

        print("${i+1}. notu giriniz:")
        val not = girdi.nextInt()
        notlar[i] = not
    }

    var toplam =  0

    for (i in 0 until notlar.count()) {
        println("${dersler[i]} : ${notlar[i]}")
        toplam = toplam + notlar[i]
    }

    var ortalama = toplam / notlar.count()
    println("Ortalama : $ortalama")

    if(ortalama >= 50) {
        println("Gectiniz")
    } else {
        println("Kaldiniz")
    }
}
