package io.github.sodekim.ktuple

/**
 *
 * @author w-sodalite@hotmail.com
 */
/**
 * Tuple
 */
interface Tuple {
    val size: Int
}

/**
 * Tuple0
 */
fun Tuple() = Tuple0

/**
 * Tuple1
 */
fun <A> Tuple(first: A) = Tuple1(first)

/**
 * Tuple2
 */
fun <A, B> Tuple(first: A, second: B) = Tuple2(first, second)

/**
 * Tuple3
 */
fun <A, B, C> Tuple(first: A, second: B, third: C) =
    Tuple3(first, second, third)

/**
 * Tuple4
 */
fun <A, B, C, D> Tuple(first: A, second: B, third: C, fourth: D) =
    Tuple4(first, second, third, fourth)

/**
 * Tuple5
 */

fun <A, B, C, D, E> Tuple(first: A, second: B, third: C, fourth: D, fifth: E) =
    Tuple5(first, second, third, fourth, fifth)

/**
 * Tuple6
 */
fun <A, B, C, D, E, F> Tuple(first: A, second: B, third: C, fourth: D, fifth: E, sixth: F) =
    Tuple6(first, second, third, fourth, fifth, sixth)

/**
 * Tuple7
 */
fun <A, B, C, D, E, F, G> Tuple(first: A, second: B, third: C, fourth: D, fifth: E, sixth: F, seventh: G) =
    Tuple7(first, second, third, fourth, fifth, sixth, seventh)

/**
 * Tuple8
 */
fun <A, B, C, D, E, F, G, H> Tuple(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F,
    seventh: G,
    eighth: H
) = Tuple8(first, second, third, fourth, fifth, sixth, seventh, eighth)