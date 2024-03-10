package com.example.kotlin_fundamentals

class While {
}

// Discover the total sum of the numbers from 'List' exercise using 'while'

fun main() {
    val list = mutableListOf<Int>()

    for(i in 1..99){
        list.add(i)
    }

    var sum = 0
    var value = 0

    while(value < list.size){
        sum += list[value]
        value++
    }
    println("The total sum of the numbers is: $sum")
}