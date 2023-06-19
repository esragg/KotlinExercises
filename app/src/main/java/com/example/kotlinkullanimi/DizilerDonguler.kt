package com.example.kotlinkullanimi

fun main() {

    val meyveler = arrayOf<String>("Cilek", "Muz", "Elma", "Kivi", "Kiraz")

    for (meyve in meyveler) {
        println("Sonuc: $meyve")
    }

    for ((indeks,meyve) in meyveler.withIndex()) {
        println("Sonuc $indeks : $meyve")
    }
}