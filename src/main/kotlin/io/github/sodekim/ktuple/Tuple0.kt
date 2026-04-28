package io.github.sodekim.ktuple

/**
 *
 * @author w-sodalite@hotmail.com
 */
object Tuple0 : Tuple {
    override val size: Int = 0

    override fun toString() = "()"

    fun <T> append(value: T) = Tuple(value)
}