package com.example.kotlinkullanimi

fun main() {

    //3ten 5e kadar ve 5 dahil
    for (i in 3..5 ) {
        println(i)
    }

    // 10 ile 20 arasinda 5er
    var baslangic = 10
    var bitis = 20
    var artis = 5
    for (a in baslangic..bitis step artis) {
        println("a: $a")
    }

    // 20 ile 10 arasi 2ser
    for (b in 20 downTo 10 step 2) {
        println("b: $b")
    }

    // 1den 5e kadar ve 5 dahil degil
    for (c in 1 until 5) {
        println("c: $c")
    }

    var sayac = 1

    while(sayac < 4) {

        println("sayac: $sayac")
        sayac += 1 //sayac = sayac + 1
    }
}