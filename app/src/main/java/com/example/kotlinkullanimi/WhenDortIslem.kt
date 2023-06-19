package com.example.kotlinkullanimi

import java.util.Scanner

fun main() {
    val girdi = Scanner(System.`in`)

    println("Toplama (1)")
    println("Cikarma (2)")
    println("Carpma (3)")
    println("Bolme (4)")

    val tercih = girdi.nextInt()

    print("Birinci sayiyi giriniz: ")
    val sayi1 = girdi.nextInt()
    print("Ikinci sayiyi giriniz: ")
    val sayi2 = girdi.nextInt()

    when(tercih) {
        1 -> println("Sonuc: ${sayi1 + sayi2}")
        2 -> println("Sonuc: ${sayi1 - sayi2}")
        3 -> println("Sonuc: ${sayi1 * sayi2}")
        4 -> println("Sonuc: ${sayi1 / sayi2}")
        else -> println("Boyle bir secenek yok")

    }
}