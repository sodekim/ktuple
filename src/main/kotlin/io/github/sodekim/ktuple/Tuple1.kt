package io.github.sodekim.ktuple

/**
 *
 * @author w-sodalite@hotmail.com
 */
data class Tuple1<out T1>(val first: T1) : Tuple {
    override val size: Int = 1

    override fun toString() = "($first)"

    fun <T2> append(value: T2) = Tuple(first, value)

    fun <U1> map1(block: (T1) -> U1): Tuple1<U1> {
        return Tuple(block(this.first))
    }

    fun <U1> map(block: (T1) -> Tuple1<U1>): Tuple1<U1> {
        return block(this.first)
    }

    operator fun <R> invoke(block: (T1) -> R): R {
        return block(this.first)
    }
}