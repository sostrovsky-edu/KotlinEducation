package data.type.collections.example2

import java.util.*

fun main() {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c]=binary
    }
    for((letter, binary) in binaryReps) {
        print("$letter:$binary ")
    }
}