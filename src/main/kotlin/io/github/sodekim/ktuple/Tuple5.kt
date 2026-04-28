package io.github.sodekim.ktuple

/**
 *
 * @author w-sodalite@hotmail.com
 */
data class Tuple5<out T1, out T2, out T3, out T4, out T5>(
    val first: T1,
    val second: T2,
    val third: T3,
    val fourth: T4,
    val fifth: T5
) : Tuple {
    override val size: Int = 5

    override fun toString() = "($first, $second, $third, $fourth, $fifth)"

    fun <T6> append(value: T6) =
        Tuple(first, second, third, fourth, fifth, value)

    fun <U1> map1(block: (T1) -> U1): Tuple5<U1, T2, T3, T4, T5> {
        return Tuple(
            block(this.first),
            this.second,
            this.third,
            this.fourth,
            this.fifth
        )
    }

    fun <U2> map2(block: (T2) -> U2): Tuple5<T1, U2, T3, T4, T5> {
        return Tuple(
            this.first,
            block(this.second),
            this.third,
            this.fourth,
            this.fifth
        )
    }

    fun <U3> map3(block: (T3) -> U3): Tuple5<T1, T2, U3, T4, T5> {
        return Tuple(
            this.first,
            this.second,
            block(this.third),
            this.fourth,
            this.fifth
        )
    }

    fun <U4> map4(block: (T4) -> U4): Tuple5<T1, T2, T3, U4, T5> {
        return Tuple(
            this.first,
            this.second,
            this.third,
            block(this.fourth),
            this.fifth
        )
    }

    fun <U5> map5(block: (T5) -> U5): Tuple5<T1, T2, T3, T4, U5> {
        return Tuple(
            this.first,
            this.second,
            this.third,
            this.fourth,
            block(this.fifth)
        )
    }

    fun <U1, U2, U3, U4, U5> map(block: (T1, T2, T3, T4, T5) -> Tuple5<U1, U2, U3, U4, U5>): Tuple5<U1, U2, U3, U4, U5> {
        return block(this.first, this.second, this.third, this.fourth, this.fifth)
    }

    operator fun <R> invoke(block: (T1, T2, T3, T4, T5) -> R): R {
        return block(this.first, this.second, this.third, this.fourth, this.fifth)
    }
}