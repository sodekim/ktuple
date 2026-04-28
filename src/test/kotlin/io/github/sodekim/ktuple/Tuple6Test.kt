package io.github.sodekim.ktuple

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertIs

/**
 *
 * @author w-sodalite@hotmail.com
 */
class Tuple6Test {

    val tuple = Tuple(1, 2, 3, 4, 5, 6)

    @Test
    fun test() {
        assert(tuple.isNotEmpty())
        assertFalse(tuple.isEmpty())
        assertEquals(
            6,
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
            "(1, 2, 3, 4, 5, 6)",
            tuple.toString()
        )
        assertEquals(
            Tuple(1, 2, 3, 4, 5, 6, 7),
            tuple.append(7)
        )
        assertEquals(
            Tuple(2, 4, 6, 8, 10, 12),
            tuple.map { first, second, third, fourth, fifth, sixth ->
                Tuple(first * 2, second * 2, third * 2, fourth * 2, fifth * 2, sixth * 2)
            }
        )
        assertEquals(
            21,
            tuple { first, second, third, fourth, fifth, sixth -> first + second + third + fourth + fifth + sixth }
        )

        val list = tuple.toList()
        val mlist: List<Any?> = tuple.toMutableList()
        val set = tuple.toSet()
        val mset: Set<Any?> = tuple.toMutableSet()
        val elist = listOf(1, 2, 3, 4, 5, 6)
        val eset = setOf(1, 2, 3, 4, 5, 6)
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