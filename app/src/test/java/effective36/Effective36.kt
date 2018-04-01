package effective36

import org.junit.Test

/**
 * Created by geniusmart on 2018/4/1.
 */
class Effective36{
    @Test
    fun test(){
        val countingSet = CountingSet()
        countingSet.add("123")
        countingSet.add(1)
        println(countingSet.count)
    }
}

class CountingSet: HashSet<Any>() {

    var count = 0

    //1.正确的重写
    /*
    override fun add(element: Any): Boolean {
        count++
        return super.add(element)
    }
    */

    //2.错误的重写
    fun add(element: Int): Boolean {
        count++
        return super.add(element)
    }

}