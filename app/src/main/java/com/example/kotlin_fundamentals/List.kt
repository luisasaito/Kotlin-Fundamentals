package com.example.kotlin_fundamentals

class List {
}

// Create a list from 1 to 99 using 'for'

fun main() {
    val list = mutableListOf<Int>()

    for(i in 1..99){
        list.add(i)
    }
    println(list)
}