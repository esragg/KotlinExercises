package com.example.kotlinkullanimi

import java.util.Scanner

fun main() {

    val isimler = Array<String>(5){""}

    val girdi = Scanner(System.`in`)

    for (i in 0 until isimler.count()) {
        print("${i+1}. ismi giriniz: ")

        val isim = girdi.next()
        isimler.set(i,isim)
    }

    for ((indeks,isim) in isimler.withIndex()) {
        println("${indeks+1}. isim: $isim")
    }
}