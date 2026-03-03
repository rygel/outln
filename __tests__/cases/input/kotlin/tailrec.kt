package com.example

// Tailrec functions
tailrec fun factorial(n: Long, acc: Long = 1): Long {
    return if (n <= 1) acc else factorial(n - 1, acc * n)
}

tailrec fun findMax(list: List<Int>, max: Int? = null): Int? {
    return when {
        list.isEmpty() -> max
                        max == null -> findMax(list.drop(1), list.first())
                        else -> findMax(list.drop(1), maxOf(max, list.first()))
    }
}

tailrec fun repeatString(s: String, n: Int, acc: String = ""): String {
    return if (n <= 0) acc else repeatString(s, n - 1, acc + s)
}

// Non-tailrec for comparison
fun normalFactorial(n: Long): Long {
    return if (n <= 1) 1 else n * normalFactorial(n - 1)
}
