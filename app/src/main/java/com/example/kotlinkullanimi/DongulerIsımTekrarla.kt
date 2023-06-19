package com.example.kotlinkullanimi

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)

    print("Isim giriniz: ")
    val  isim  =  girdi.next();

    print("Tekrar giriniz: ")
    val tekrar = girdi.nextInt()

    for (i in 1..tekrar) {
        println("$i. $isim")
    }
}