package com.example.kotlin_fundamentals

class When {
}

// Validate whether the numbers are even or odd using 'when'

fun main() {
    val date = 8
    val month = 1
    val year = 1997

    when {
        date % 2 == 0 -> println("The number $date is even.")
        else -> println("The number $date is odd.")
    }
    when {
        month % 2 == 0 -> println("The number $month is even.")
        else -> println("The number $month is odd.")
    }
    when {
        year % 2 == 0 -> println("The number $year is even.")
        else -> println("The number $year is odd.")
    }
}