package io.github.sodekim.ktuple

/**
 *
 * @author w-sodalite@hotmail.com
 */
data class Tuple3<out T1, out T2, out T3>(val first: T1, val second: T2, val third: T3) :
    Tuple {
    override val size: Int = 3

    override fun toString() = "($first, $second, $third)"

    fun <T4> append(value: T4) = Tuple(first, second, third, value)

    fun <U1> map1(block: (T1) -> U1): Tuple3<U1, T2, T3> {
        return Tuple(block(this.first), this.second, this.third)
    }

    fun <U2> map2(block: (T2) -> U2): Tuple3<T1, U2, T3> {
        return Tuple(this.first, block(this.second), this.third)
    }

    fun <U3> map3(block: (T3) -> U3): Tuple3<T1, T2, U3> {
        return Tuple(this.first, this.second, block(this.third))
    }

    fun <U1, U2, U3> map(block: (T1, T2, T3) -> Tuple3<U1, U2, U3>): Tuple3<U1, U2, U3> {
        return block(this.first, this.second, this.third)
    }

    operator fun <R> invoke(block: (T1, T2, T3) -> R): R {
        return block(this.first, this.second, this.third)
    }
}