package com.example.kotlinkullanimi

fun main()  {

    for (i in 3..6) {
        println("Dongu 1: $i")
    }

    var sayac = 3

    while (sayac < 7) {
        println("Dongu 2: $sayac")
        sayac += 1
    }

    //0 ile 8 arasinda 2ser

    for (i in 0..8 step 2) {
        println("Dongu 3: $i")
    }

    var sayac1 = 0

    while (sayac1 < 9) {
        println("Dongu 4: $sayac1")
        sayac1 += 2
    }

    //8den 0 2ser azalsin
    for (i in 8 downTo 0 step 2) {
        println("Dongu 5: $i")
    }

    var sayac2 = 8

    while (sayac2 > -1) {
        println("Dongu 6: $sayac2")
        sayac2 -= 2
    }
}