package io.github.sodekim.ktuple

/**
 *
 * @author w-sodalite@hotmail.com
 */
data class Tuple8<out T1, out T2, out T3, out T4, out T5, out T6, out T7, out T8>(
    val first: T1,
    val second: T2,
    val third: T3,
    val fourth: T4,
    val fifth: T5,
    val sixth: T6,
    val seventh: T7,
    val eighth: T8
) : Tuple {
    override val size: Int = 8

    override fun toString() = "($first, $second, $third, $fourth, $fifth, $sixth, $seventh, $eighth)"

    fun <U1> map1(block: (T1) -> U1): Tuple8<U1, T2, T3, T4, T5, T6, T7, T8> {
        return Tuple8(
            block(this.first),
            this.second,
            this.third,
            this.fourth,
            this.fifth,
            this.sixth,
            this.seventh,
            this.eighth
        )
    }

    fun <U2> map2(block: (T2) -> U2): Tuple8<T1, U2, T3, T4, T5, T6, T7, T8> {
        return Tuple8(
            this.first,
            block(this.second),
            this.third,
            this.fourth,
            this.fifth,
            this.sixth,
            this.seventh,
            this.eighth
        )
    }

    fun <U3> map3(block: (T3) -> U3): Tuple8<T1, T2, U3, T4, T5, T6, T7, T8> {
        return Tuple8(
            this.first,
            this.second,
            block(this.third),
            this.fourth,
            this.fifth,
            this.sixth,
            this.seventh,
            this.eighth
        )
    }

    fun <U4> map4(block: (T4) -> U4): Tuple8<T1, T2, T3, U4, T5, T6, T7, T8> {
        return Tuple8(
            this.first,
            this.second,
            this.third,
            block(this.fourth),
            this.fifth,
            this.sixth,
            this.seventh,
            this.eighth
        )
    }

    fun <U5> map5(block: (T5) -> U5): Tuple8<T1, T2, T3, T4, U5, T6, T7, T8> {
        return Tuple8(
            this.first,
            this.second,
            this.third,
            this.fourth,
            block(this.fifth),
            this.sixth,
            this.seventh,
            this.eighth
        )
    }

    fun <U6> map6(block: (T6) -> U6): Tuple8<T1, T2, T3, T4, T5, U6, T7, T8> {
        return Tuple8(
            this.first,
            this.second,
            this.third,
            this.fourth,
            this.fifth,
            block(this.sixth),
            this.seventh,
            this.eighth
        )
    }

    fun <U7> map7(block: (T7) -> U7): Tuple8<T1, T2, T3, T4, T5, T6, U7, T8> {
        return Tuple8(
            this.first,
            this.second,
            this.third,
            this.fourth,
            this.fifth,
            this.sixth,
            block(this.seventh),
            this.eighth
        )
    }

    fun <U8> map8(block: (T8) -> U8): Tuple8<T1, T2, T3, T4, T5, T6, T7, U8> {
        return Tuple8(
            this.first,
            this.second,
            this.third,
            this.fourth,
            this.fifth,
            this.sixth,
            this.seventh,
            block(this.eighth)
        )
    }

    fun <U1, U2, U3, U4, U5, U6, U7, U8> map(block: (T1, T2, T3, T4, T5, T6, T7, T8) -> Tuple8<U1, U2, U3, U4, U5, U6, U7, U8>): Tuple8<U1, U2, U3, U4, U5, U6, U7, U8> {
        return block(
            this.first,
            this.second,
            this.third,
            this.fourth,
            this.fifth,
            this.sixth,
            this.seventh,
            this.eighth
        )
    }

    operator fun <R> invoke(block: (T1, T2, T3, T4, T5, T6, T7, T8) -> R): R {
        return block(
            this.first,
            this.second,
            this.third,
            this.fourth,
            this.fifth,
            this.sixth,
            this.seventh,
            this.eighth
        )
    }
}