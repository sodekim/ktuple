package io.github.sodekim.ktuple

/**
 *
 * @author w-sodalite@hotmail.com
 */
data class Tuple4<out T1, out T2, out T3, out T4>(val first: T1, val second: T2, val third: T3, val fourth: T4) :
    Tuple {
    override val size: Int = 4

    override fun toString() = "($first, $second, $third, $fourth)"

    fun <T5> append(value: T5) = Tuple(first, second, third, fourth, value)

    fun <U1> map1(block: (T1) -> U1): Tuple4<U1, T2, T3, T4> {
        return Tuple(
            block(this.first),
            this.second,
            this.third,
            this.fourth
        )
    }

    fun <U2> map2(block: (T2) -> U2): Tuple4<T1, U2, T3, T4> {
        return Tuple(
            this.first,
            block(this.second),
            this.third,
            this.fourth
        )
    }

    fun <U3> map3(block: (T3) -> U3): Tuple4<T1, T2, U3, T4> {
        return Tuple(
            this.first,
            this.second,
            block(this.third),
            this.fourth
        )
    }

    fun <U4> map4(block: (T4) -> U4): Tuple4<T1, T2, T3, U4> {
        return Tuple(
            this.first,
            this.second,
            this.third,
            block(this.fourth)
        )
    }

    fun <U1, U2, U3, U4> map(block: (T1, T2, T3, T4) -> Tuple4<U1, U2, U3, U4>): Tuple4<U1, U2, U3, U4> {
        return block(this.first, this.second, this.third, this.fourth)
    }

    operator fun <R> invoke(block: (T1, T2, T3, T4) -> R): R {
        return block(this.first, this.second, this.third, this.fourth)
    }
}
