package com.example.kotlin_fundamentals

class Array {
}

// Create an 'array' with 40 positions using 'for'

fun main() {
    var array: IntArray = IntArray(40)

    for(i in array.indices){
        array[i] = i * 1
        println(array[i])
    }
}