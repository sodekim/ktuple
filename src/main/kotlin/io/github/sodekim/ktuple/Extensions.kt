package io.github.sodekim.ktuple

/**
 *
 * @author w-sodalite@hotmail.com
 */
fun Tuple.isEmpty() = this.size == 0
fun Tuple.isNotEmpty() = this.size > 0

// @formatter:off
fun <T> Tuple1<T>.toList() = listOf(first)
fun <T> Tuple1<T>.toMutableList() = mutableListOf(first)
fun <T> Tuple1<T>.toSet() = setOf(first)
fun <T> Tuple1<T>.toMutableSet() = mutableSetOf(first)
inline fun <reified T> Tuple1<T>.toArray() = arrayOf(first)

fun <T> Tuple2<T, T>.toList() = listOf(first, second)
fun <T> Tuple2<T, T>.toMutableList() = mutableListOf(first, second)
fun <T> Tuple2<T, T>.toSet() = setOf(first, second)
fun <T> Tuple2<T, T>.toMutableSet() = mutableSetOf(first, second)
inline fun <reified T> Tuple2<T, T>.toArray() = arrayOf(first, second)

fun <T> Tuple3<T, T, T>.toList() = listOf(first, second, third)
fun <T> Tuple3<T, T, T>.toMutableList() = mutableListOf(first, second, third)
fun <T> Tuple3<T, T, T>.toSet() = setOf(first, second, third)
fun <T> Tuple3<T, T, T>.toMutableSet() = mutableSetOf(first, second, third)
inline fun <reified T> Tuple3<T, T, T>.toArray() = arrayOf(first, second, third)

fun <T> Tuple4<T, T, T, T>.toList() = listOf(first, second, third, fourth)
fun <T> Tuple4<T, T, T, T>.toMutableList() = mutableListOf(first, second, third, fourth)
fun <T> Tuple4<T, T, T, T>.toSet() = setOf(first, second, third, fourth)
fun <T> Tuple4<T, T, T, T>.toMutableSet() = mutableSetOf(first, second, third, fourth)
inline fun <reified T> Tuple4<T, T, T, T>.toArray() = arrayOf(first, second, third, fourth)

fun <T> Tuple5<T, T, T, T, T>.toList() = listOf(first, second, third, fourth, fifth)
fun <T> Tuple5<T, T, T, T, T>.toMutableList() = mutableListOf(first, second, third, fourth, fifth)
fun <T> Tuple5<T, T, T, T, T>.toSet() = setOf(first, second, third, fourth, fifth)
fun <T> Tuple5<T, T, T, T, T>.toMutableSet() = mutableSetOf(first, second, third, fourth, fifth)
inline fun <reified T> Tuple5<T, T, T, T, T>.toArray() = arrayOf(first, second, third, fourth, fifth)

fun <T> Tuple6<T, T, T, T, T, T>.toList() = listOf(first, second, third, fourth, fifth, sixth)
fun <T> Tuple6<T, T, T, T, T, T>.toMutableList() = mutableListOf(first, second, third, fourth, fifth, sixth)
fun <T> Tuple6<T, T, T, T, T, T>.toSet() = setOf(first, second, third, fourth, fifth, sixth)
fun <T> Tuple6<T, T, T, T, T, T>.toMutableSet() = mutableSetOf(first, second, third, fourth, fifth, sixth)
inline fun <reified T> Tuple6<T, T, T, T, T, T>.toArray() = arrayOf(first, second, third, fourth, fifth, sixth)

fun <T> Tuple7<T, T, T, T, T, T, T>.toList() = listOf(first, second, third, fourth, fifth, sixth, seventh)
fun <T> Tuple7<T, T, T, T, T, T, T>.toMutableList() = mutableListOf(first, second, third, fourth, fifth, sixth, seventh)
fun <T> Tuple7<T, T, T, T, T, T, T>.toSet() = setOf(first, second, third, fourth, fifth, sixth, seventh)
fun <T> Tuple7<T, T, T, T, T, T, T>.toMutableSet() = mutableSetOf(first, second, third, fourth, fifth, sixth, seventh)
inline fun <reified T> Tuple7<T, T, T, T, T, T, T>.toArray() = arrayOf(first, second, third, fourth, fifth, sixth, seventh)

fun <T> Tuple8<T, T, T, T, T, T, T, T>.toList() = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth)
fun <T> Tuple8<T, T, T, T, T, T, T, T>.toMutableList() = mutableListOf(first, second, third, fourth, fifth, sixth, seventh, eighth)
fun <T> Tuple8<T, T, T, T, T, T, T, T>.toSet() = setOf(first, second, third, fourth, fifth, sixth, seventh, eighth)
fun <T> Tuple8<T, T, T, T, T, T, T, T>.toMutableSet() = mutableSetOf(first, second, third, fourth, fifth, sixth, seventh, eighth)
inline fun <reified T> Tuple8<T, T, T, T, T, T, T, T>.toArray() = arrayOf(first, second, third, fourth, fifth, sixth, seventh, eighth)
// @formatter:on