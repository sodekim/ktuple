package io.github.sodekim.ktuple

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertIs

/**
 *
 * @author w-sodalite@hotmail.com
 */
class Tuple1Test {

    val tuple = Tuple(1)

    @Test
    fun test() {
        assert(tuple.isNotEmpty())
        assertFalse(tuple.isEmpty())
        assertEquals(
            1,
            tuple.size
        )
        assertEquals(
            1,
            tuple.first
        )
        assertEquals(
            "(1)",
            tuple.toString()
        )
        assertEquals(
            Tuple(1, 2),
            tuple.append(2)
        )
        assertEquals(
            Tuple(2),
            tuple.map { first -> Tuple(first * 2) }
        )
        assertEquals(
            1,
            tuple { first -> first }
        )

        val list = tuple.toList()
        val mlist: List<Any?> = tuple.toMutableList()
        val set = tuple.toSet()
        val mset: Set<Any?> = tuple.toMutableSet()
        val elist = listOf(1)
        val eset = setOf(1)
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