package com.geniusmart.kotlin

import com.geniusmart.kotlin.ClassDemoTest.A.A1
import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.Collections

/**
 * Created by geniusmart on 2017/12/12.
 */
class ClassDemoTest{

    @Test
    fun method1(){
        val person1 = Person(number = 2)
        val person2 = Person(number = 3)
        val list = listOf(person1, person2)
        Collections.sort(list,MyComparator())
        assertEquals(list[1].number,2)

        fun <T> joinToString(collection: Collection<T>, separator:String=",", prefix:String="[", postfix:String="]"):String{
            val result = StringBuilder(prefix)
            for((index, element) in collection.withIndex()){
                if(index>0){
                    result.append(separator)
                }
                result.append(element)
            }
            result.append(postfix)
            return result.toString()
        }
        val strings = listOf(1, 2,3,4)

        println(joinToString(strings, "["))
    }

    data class Person(var number: Int)

    class MyComparator : Comparator<Person>{
        override fun compare(o1: Person, o2: Person): Int {
            return o2.number - o1.number;
        }

    }

    interface Hello{
        fun test1()
        fun test2(){
            print("helloWorld")
        }
    }

    @Test
    fun interfaceDefault(){
        class SubHello : Hello{
            var name = ""
            override fun test1() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        }

        val subHello:SubHello = SubHello()
        subHello.test2()
        subHello.name = "abc"
        print(subHello.name)

        val a = A1()
        val user = User("")

    }

    sealed class A{
        class A1: A()
        class A2: A()
    }
}

@JvmOverloads
fun test(age:Int=1,name:String="123",isGirl:Boolean=true){
    val sum = { x:Int, y:Int -> x + y }
}