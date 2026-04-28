package io.github.sodekim.ktuple

/**
 *
 * @author w-sodalite@hotmail.com
 */
data class Tuple7<out T1, out T2, out T3, out T4, out T5, out T6, out T7>(
    val first: T1,
    val second: T2,
    val third: T3,
    val fourth: T4,
    val fifth: T5,
    val sixth: T6,
    val seventh: T7
) : Tuple {
    override val size: Int = 7

    override fun toString() = "($first, $second, $third, $fourth, $fifth, $sixth, $seventh)"

    fun <T8> append(value: T8) =
        Tuple(first, second, third, fourth, fifth, sixth, seventh, value)

    fun <U1> map1(block: (T1) -> U1): Tuple7<U1, T2, T3, T4, T5, T6, T7> {
        return Tuple(
            block(this.first),
            this.second,
            this.third,
            this.fourth,
            this.fifth,
            this.sixth,
            this.seventh
        )
    }

    fun <U2> map2(block: (T2) -> U2): Tuple7<T1, U2, T3, T4, T5, T6, T7> {
        return Tuple(
            this.first,
            block(this.second),
            this.third,
            this.fourth,
            this.fifth,
            this.sixth,
            this.seventh
        )
    }

    fun <U3> map3(block: (T3) -> U3): Tuple7<T1, T2, U3, T4, T5, T6, T7> {
        return Tuple(
            this.first,
            this.second,
            block(this.third),
            this.fourth,
            this.fifth,
            this.sixth,
            this.seventh
        )
    }

    fun <U4> map4(block: (T4) -> U4): Tuple7<T1, T2, T3, U4, T5, T6, T7> {
        return Tuple(
            this.first,
            this.second,
            this.third,
            block(this.fourth),
            this.fifth,
            this.sixth,
            this.seventh
        )
    }

    fun <U5> map5(block: (T5) -> U5): Tuple7<T1, T2, T3, T4, U5, T6, T7> {
        return Tuple(
            this.first,
            this.second,
            this.third,
            this.fourth,
            block(this.fifth),
            this.sixth,
            this.seventh
        )
    }

    fun <U6> map6(block: (T6) -> U6): Tuple7<T1, T2, T3, T4, T5, U6, T7> {
        return Tuple(
            this.first,
            this.second,
            this.third,
            this.fourth,
            this.fifth,
            block(this.sixth),
            this.seventh
        )
    }

    fun <U7> map7(block: (T7) -> U7): Tuple7<T1, T2, T3, T4, T5, T6, U7> {
        return Tuple(
            this.first,
            this.second,
            this.third,
            this.fourth,
            this.fifth,
            this.sixth,
            block(this.seventh)
        )
    }

    fun <U1, U2, U3, U4, U5, U6, U7> map(block: (T1, T2, T3, T4, T5, T6, T7) -> Tuple7<U1, U2, U3, U4, U5, U6, U7>): Tuple7<U1, U2, U3, U4, U5, U6, U7> {
        return block(this.first, this.second, this.third, this.fourth, this.fifth, this.sixth, this.seventh)
    }

    operator fun <R> invoke(block: (T1, T2, T3, T4, T5, T6, T7) -> R): R {
        return block(this.first, this.second, this.third, this.fourth, this.fifth, this.sixth, this.seventh)
    }
}