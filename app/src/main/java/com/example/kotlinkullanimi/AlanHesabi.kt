package com.example.kotlinkullanimi

import java.util.Scanner

fun main() {

    val  girdi = Scanner(System.`in`)

    println("Dikdortgen Alani (1)")
    println("Cember Alani (2)")

    val secim = girdi.nextInt()

    println("Seciminiz: $secim")

    if(secim == 1) {
        print("Kisa kenari giriniz: ")
        val kisaKenar = girdi.nextInt()

        print("Uzun kenari giriniz: ")
        val uzunKenar = girdi.nextInt()

        println("Dikdortgen Alani")
        val dikdortgenAlani = kisaKenar * uzunKenar
        println("Sonuc: $dikdortgenAlani")
    }

    if(secim == 2) {

        print("Yari capi giriniz:")
        val yariCap = girdi.nextInt()

        println("Cember Alani")
        val cemberAlani = 3.14 * yariCap * yariCap
        println("Sonuc: $cemberAlani")
    }
}