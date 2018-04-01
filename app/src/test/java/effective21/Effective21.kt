package effective21

import org.junit.Test

/**
 * Created by geniusmart on 2018/4/1.
 */
class Effective21{

    @Test
    fun testNomal(){
        val context1 = Context(StrategyA())
        val context2 = Context(StrategyB())
        val context3 = Context(object : Strategy{
            override fun action() {
                println("匿名内部类--StrategyC")
            }

        })
        context1.preform()
    }

@Test
fun testAdavance(){
    val context = ContextKotlin()
    context.perform {
        println("StrategyA")
    }
    val strategyB = { println("strategyB")}
    context.perform(strategyB)
}
}


interface Strategy{
    fun action()
}

class StrategyA : Strategy{
    override fun action() {
        println("StrategyA")
    }
}

class StrategyB : Strategy{
    override fun action() {
        println("StrategyB")
    }
}

class Context(var strategy: Strategy){

    fun preform(){
        strategy.action()
    }
}

class ContextKotlin{

    fun perform(strategy: ()->Unit){
        strategy()
    }
}
