package com.example.kotlinkullanimi

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)

    print("Islenecek veri miktarini giriniz: ")

    var veri = girdi.nextInt()

/*    for (i in veri downTo 1) {
        println("$i. veri")
    }
 */

    while (veri > 0)  {
        println("$veri. veri")
        veri -= 1
    }

}