package io.github.sodekim.ktuple

/**
 * @author w-sodalite@hotmail.com
 */
data class Tuple2<out T1, out T2>(val first: T1, val second: T2) : Tuple {
    override val size: Int = 2

    override fun toString() = "($first, $second)"

    fun <T3> append(value: T3) = Tuple(first, second, value)

    fun <U1> map1(block: (T1) -> U1): Tuple2<U1, T2> {
        return Tuple(block(this.first), this.second)
    }

    fun <U2> map2(block: (T2) -> U2): Tuple2<T1, U2> {
        return Tuple(this.first, block(this.second))
    }

    fun <U1, U2> map(block: (T1, T2) -> Tuple2<U1, U2>): Tuple2<U1, U2> {
        return block(this.first, this.second)
    }

    operator fun <R> invoke(block: (T1, T2) -> R): R {
        return block(this.first, this.second)
    }
}