package effective16

import org.junit.Test

/**
 * Created by geniusmart on 2018/3/31.
 */
class Effective16{

    @Test
    fun test(){

        val countingSet = CountingSet()
        countingSet.addAll(setOf("1","2","3"))
        println("countingSet.count=${countingSet.count}")//期望是3，实际上是6

        val countingSetBy = CountingSetBy(HashSet())
        countingSetBy.addAll(setOf("1","2","3"))
        println("countingSetBy.count=${countingSetBy.count}")

    }
}

class CountingSet: HashSet<String>() {

    var count = 0

    override fun add(element: String): Boolean {
        count++
        return super.add(element)
    }

    override fun addAll(elements: Collection<String>): Boolean {
        count+=elements.size
        return super.addAll(elements)
    }
}

class CountintSetComposite(val countingSet : HashSet<String> ){

    var count = 0

    fun contains(element: String) {
        countingSet.contains(element)
    }

    fun add(element: String): Boolean {
        count++
        return countingSet.add(element)
    }

    // 声明HashSet的所有方法。。
}

class CountingSetBy(val countingSet: MutableCollection<String>):MutableCollection<String> by countingSet{

    var count = 0

    override fun add(element: String): Boolean {
        count++
        return countingSet.add(element)
    }

    override fun addAll(elements: Collection<String>): Boolean {
        count+=elements.size
        return countingSet.addAll(elements)
    }
}