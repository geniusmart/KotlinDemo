package other

import org.junit.Test

/**
 * Created by geniusmart on 2018/3/11.
 */
class ExtendDemo{

    var String.num
        get() = this.toInt()
        set(value){
            this.plus(123)
        }
    fun String.printNum() = println(this.toInt())

    @Test
    fun test1(){
         println("123".num)
        "345".printNum()

        1 to 2
    }

    @Test
    fun test2(){
        val dependencies = Dependencies()

        dependencies {
            compile("dependence1")
            compile("dependence2")
        }

        dependencies.compile("dependence4")
        dependencies.compile("dependence15")

        val person = Person("Kotlin")
        person()

        "".apply {
            plus(123)
        }



    }


}

class Dependencies{

    fun compile(coordinate:String){
        println("add $coordinate")
    }

    operator fun invoke(block:Dependencies.()->Unit){
        block()
    }
}

class Person(val name:String){

    operator fun invoke(){
        println("my name is $name")
    }
}

