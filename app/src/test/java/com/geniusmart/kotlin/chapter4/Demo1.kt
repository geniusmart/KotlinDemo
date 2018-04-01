package com.geniusmart.kotlin.chapter4

import com.geniusmart.kotlin.chapter4.Money.Dollar
import com.geniusmart.kotlin.chapter4.Money.RMB
import org.junit.Test

/**
 * Created by geniusmart on 2018/1/5.
 */
class Demo1{

    @Test
    fun basic(){
        class Button : Clickable{
            override fun click() {
                super.focus()
                println("Button--click")
            }
        }

        Button().click()
    }

    @Test
    fun inner(){
        Outer.Inner().action()
        Outer().Inner1().action()
    }

    @Test
    fun sealed(){
        val sealedObject : Money = RMB()
        when(sealedObject){
            is RMB -> println("RMB")
            is Dollar -> println("Dollar")
        }
    }

    @Test
    fun construct(){
        val list = listOf(1, 2, 3)
        list.filter { it > 1 }

        val block = {x:Int,y:Int->x+y}
        print(block)
    }

    @Test
    fun  test5(){

// 声明接收者
fun kotlinDSL(block:StringBuilder.()->Unit){
    block(StringBuilder("Kotlin"))
}

kotlinDSL {
    // 这个 lambda 的接收者类型为StringBuilder
    append(" DSL")
    println(this)
}

        class Dependencies{

            fun compile(coordinate:String){
                println("add $coordinate")
            }

            operator fun invoke(block:Dependencies.()->Unit){
                block(this)
            }
        }
    }



}


fun print(sum:(Int,Int)->Int){
    val result = sum(1, 2)
    println(result)
}

interface Clickable{
    fun click()
    fun focus(){
        println("Clickable--focus")
    }
}

class Outer{

    private val num = 10;

    // 默认为嵌套类
    class Inner{
        fun action(){
            println("Inner--action")
        }
    }

    inner class Inner1{
        fun action(){
            println(this@Outer.num)
        }
    }
}

sealed class Money{
    class RMB : Money()
    class Dollar : Money()
}