package io.github.sodekim.ktuple

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertIs

/**
 *
 * @author w-sodalite@hotmail.com
 */
class Tuple3Test {

    val tuple = Tuple(1, 2, 3)

    @Test
    fun construct() {
        assert(tuple.isNotEmpty())
        assertFalse(tuple.isEmpty())
        assertEquals(
            3,
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
            "(1, 2, 3)",
            tuple.toString()
        )
        assertEquals(
            Tuple(1, 2, 3, 4),
            tuple.append(4)
        )
        assertEquals(
            Tuple(2, 4, 6),
            tuple.map { first, second, third -> Tuple(first * 2, second * 2, third * 2) }
        )
        assertEquals(
            6,
            tuple { first, second, third -> first + second + third }
        )

        val list = tuple.toList()
        val mlist: List<Any?> = tuple.toMutableList()
        val set = tuple.toSet()
        val mset: Set<Any?> = tuple.toMutableSet()
        val elist = listOf(1, 2, 3)
        val eset = setOf(1, 2, 3)
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