package com.example.kotlinkullanimi

import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.random.Random

fun main() {

    /*
    for (i in 1..10) {
        val rastgeleSayi = Random.nextInt(0,10) // 0 ile 9 arasinda
        println(rastgeleSayi)
    }
     */

    val c = ceil(6.5) //yukari yuvarliyor
    println("c : $c")

    val f = floor(6.5) //asagi yuvarliyor
    println("f : $f")

    val s = sqrt(4.0) //karekokunu aliyor
    println("s : $s")

    val a = abs(-10) //Mutlak degerini aliyor
    println("a : $a")

    val max = max(100,200)
    val  min  = min(100, 200)
    println("Max : $max")
    println("Min : $min")

    val p = 2.0.pow(3.0) //Uslu sayi islemi (2 uzeri 3)
    println("p : $p")
 }