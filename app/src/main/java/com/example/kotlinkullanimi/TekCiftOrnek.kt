package com.example.kotlinkullanimi

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)

    while (true) {

        print("Sayi giriniz: ")
        val sayi = girdi.nextInt()

        val sonuc = sayi % 2

        if(sonuc == 0) {
            println("Cift sayidir")
        }

        if(sonuc == 1) {
            println("Tek sayidir")
        }

        println("Cikmak icin (1)  - Devam etmek icin diger sayilar")

        val cikis = girdi.nextInt()

        if(cikis == 1) {
            println("Cikis yapildi")
            break
        }
    }
}