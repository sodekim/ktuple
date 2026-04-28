package io.github.sodekim.ktuple

/**
 *
 * @author w-sodalite@hotmail.com
 */
data class Tuple6<out T1, out T2, out T3, out T4, out T5, out T6>(
    val first: T1,
    val second: T2,
    val third: T3,
    val fourth: T4,
    val fifth: T5,
    val sixth: T6
) : Tuple {
    override val size: Int = 6

    override fun toString() = "($first, $second, $third, $fourth, $fifth, $sixth)"

    fun <T7> append(value: T7) =
        Tuple(first, second, third, fourth, fifth, sixth, value)

    fun <U1> map1(block: (T1) -> U1): Tuple6<U1, T2, T3, T4, T5, T6> {
        return Tuple(
            block(this.first),
            this.second,
            this.third,
            this.fourth,
            this.fifth,
            this.sixth
        )
    }

    fun <U2> map2(block: (T2) -> U2): Tuple6<T1, U2, T3, T4, T5, T6> {
        return Tuple(
            this.first,
            block(this.second),
            this.third,
            this.fourth,
            this.fifth,
            this.sixth
        )
    }

    fun <U3> map3(block: (T3) -> U3): Tuple6<T1, T2, U3, T4, T5, T6> {
        return Tuple(
            this.first,
            this.second,
            block(this.third),
            this.fourth,
            this.fifth,
            this.sixth
        )
    }

    fun <U4> map4(block: (T4) -> U4): Tuple6<T1, T2, T3, U4, T5, T6> {
        return Tuple(
            this.first,
            this.second,
            this.third,
            block(this.fourth),
            this.fifth,
            this.sixth
        )
    }

    fun <U5> map5(block: (T5) -> U5): Tuple6<T1, T2, T3, T4, U5, T6> {
        return Tuple(
            this.first,
            this.second,
            this.third,
            this.fourth,
            block(this.fifth),
            this.sixth
        )
    }

    fun <U6> map6(block: (T6) -> U6): Tuple6<T1, T2, T3, T4, T5, U6> {
        return Tuple(
            this.first,
            this.second,
            this.third,
            this.fourth,
            this.fifth,
            block(this.sixth)
        )
    }

    fun <U1, U2, U3, U4, U5, U6> map(block: (T1, T2, T3, T4, T5, T6) -> Tuple6<U1, U2, U3, U4, U5, U6>): Tuple6<U1, U2, U3, U4, U5, U6> {
        return block(this.first, this.second, this.third, this.fourth, this.fifth, this.sixth)
    }

    operator fun <R> invoke(block: (T1, T2, T3, T4, T5, T6) -> R): R {
        return block(this.first, this.second, this.third, this.fourth, this.fifth, this.sixth)
    }
}