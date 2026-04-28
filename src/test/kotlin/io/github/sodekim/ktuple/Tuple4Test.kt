package io.github.sodekim.ktuple

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertIs

/**
 *
 * @author w-sodalite@hotmail.com
 */
class Tuple4Test {

    val tuple = Tuple(1, 2, 3, 4)

    @Test
    fun test() {
        assert(tuple.isNotEmpty())
        assertFalse(tuple.isEmpty())
        assertEquals(
            4,
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
            "(1, 2, 3, 4)",
            tuple.toString()
        )
        assertEquals(
            Tuple(1, 2, 3, 4, 5),
            tuple.append(5)
        )
        assertEquals(
            Tuple(2, 4, 6, 8),
            tuple.map { first, second, third, fourth ->
                Tuple(first * 2, second * 2, third * 2, fourth * 2)
            }
        )
        assertEquals(
            10,
            tuple { first, second, third, fourth -> first + second + third + fourth }
        )

        val list = tuple.toList()
        val mlist: List<Any?> = tuple.toMutableList()
        val set = tuple.toSet()
        val mset: Set<Any?> = tuple.toMutableSet()
        val elist = listOf(1, 2, 3, 4)
        val eset = setOf(1, 2, 3, 4)
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