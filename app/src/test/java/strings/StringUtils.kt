/**
 * Created by geniusmart on 2018/3/11.
 */
package strings

import java.time.LocalDate
import java.time.Period

fun String.lastChar(): Char = this.get(this.length - 1)

val String.lastChar : Char
    get() = this.get(this.length - 1)


object 前
infix fun Int.天(ago:前) = LocalDate.now() - Period.ofDays(this)

val Int.days:Period
    get() = Period.ofDays(this)

val Period.ago:LocalDate
    get() = LocalDate.now() - this


fun with(str : String , block : String.()->Unit) {
    str.block()
}

fun test(){
    with("hello"){
        this.plus("world")
        plus(".")
    }
}

