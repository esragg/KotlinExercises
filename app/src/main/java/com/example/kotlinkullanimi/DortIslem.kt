package com.example.kotlinkullanimi

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)

    println("Toplama (1)")
    println("Cikarma (2)")
    println("Carpma (3)")
    println("Bolme (4)")

    val tercih = girdi.nextInt()

    println("Birinci sayiyi giriniz")
    val sayi1 = girdi.nextInt()
    println("Ikinci sayiyi giriniz")
    val sayi2 = girdi.nextInt()

    if(tercih == 1) {
        println("Toplama: ${sayi1+sayi2}")
    } else if(tercih == 2) {
            println("Cikarma: ${sayi1-sayi2}")
    } else if(tercih == 3) {
        println("Carpma: ${sayi1*sayi2}")
    } else if(tercih == 4) {
        println("Bolme: ${sayi1/sayi2}")
    }
}