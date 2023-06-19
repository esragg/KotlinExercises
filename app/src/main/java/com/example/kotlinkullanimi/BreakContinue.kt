package com.example.kotlinkullanimi

fun main() {


    for (i in 1..5) {

        if(i == 3) {
            break
        }
        println("Dongu  1:  $i")
    }

    for (i in 1..5) {

        if(i == 3) {
            continue
        }
        println("Dongu 2: $i")
    }
}