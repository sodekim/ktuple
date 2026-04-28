package io.github.sodekim.ktuple

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertIs

/**
 *
 * @author w-sodalite@hotmail.com
 */
class Tuple8Test {

    val tuple = Tuple(1, 2, 3, 4, 5, 6, 7, 8)

    @Test
    fun test() {
        assert(tuple.isNotEmpty())
        assertFalse(tuple.isEmpty())
        assertEquals(
            8,
            tuple.size
        )
        assertEquals(
            1,
            tuple.first
        )
        assertEquals(
            2,
            tuple.second
        )
        assertEquals(
            3,
            tuple.third
        )
        assertEquals(
            4,
            tuple.fourth
        )
        assertEquals(
            5,
            tuple.fifth
        )
        assertEquals(
            6,
            tuple.sixth
        )
        assertEquals(
            7,
            tuple.seventh
        )
        assertEquals(
            8,
            tuple.eighth
        )
        assertEquals(
            "(1, 2, 3, 4, 5, 6, 7, 8)",
            tuple.toString()
        )
        assertEquals(
            Tuple(2, 4, 6, 8, 10, 12, 14, 16),
            tuple.map { first, second, third, fourth, fifth, sixth, seventh, eighth ->
                Tuple(first * 2, second * 2, third * 2, fourth * 2, fifth * 2, sixth * 2, seventh * 2, eighth * 2)
            }
        )
        assertEquals(
            36,
            tuple { first, second, third, fourth, fifth, sixth, seventh, eighth -> first + second + third + fourth + fifth + sixth + seventh + eighth }
        )

        val list = tuple.toList()
        val mlist: List<Any?> = tuple.toMutableList()
        val set = tuple.toSet()
        val mset: Set<Any?> = tuple.toMutableSet()
        val elist = listOf(1, 2, 3, 4, 5, 6, 7, 8)
        val eset = setOf(1, 2, 3, 4, 5, 6, 7, 8)
        assertEquals(elist, list)
        assertEquals(elist, mlist)
        assertEquals(eset, set)
        assertEquals(eset, mset)
        assertIs<List<*>>(list)
        assertIs<MutableList<*>>(mlist)
        assertIs<Set<*>>(set)
        assertIs<MutableSet<*>>(mset)
    }

}