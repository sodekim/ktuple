package io.github.sodekim.ktuple

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertIs

/**
 *
 * @author w-sodalite@hotmail.com
 */
class Tuple5Test {

    val tuple = Tuple(1, 2, 3, 4, 5)

    @Test
    fun test() {
        assert(tuple.isNotEmpty())
        assertFalse(tuple.isEmpty())
        assertEquals(
            5,
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
            "(1, 2, 3, 4, 5)",
            tuple.toString()
        )
        assertEquals(
            Tuple(1, 2, 3, 4, 5, 6),
            tuple.append(6)
        )
        assertEquals(
            Tuple(2, 4, 6, 8, 10),
            tuple.map { first, second, third, fourth, fifth ->
                Tuple(first * 2, second * 2, third * 2, fourth * 2, fifth * 2)
            }
        )
        assertEquals(
            15,
            tuple { first, second, third, fourth, fifth -> first + second + third + fourth + fifth }
        )

        val list = tuple.toList()
        val mlist: List<Any?> = tuple.toMutableList()
        val set = tuple.toSet()
        val mset: Set<Any?> = tuple.toMutableSet()
        val elist = listOf(1, 2, 3, 4, 5)
        val eset = setOf(1, 2, 3, 4, 5)
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