package effective3

import junit.framework.Assert.assertEquals
import org.junit.Test

/**
 * Created by geniusmart on 2018/4/1.
 */
object singleton{//由于同时创建了实例，因此类名使用小写
    fun action(){
        println(this.hashCode())
    }
}

class Single{

    @Test
    fun test(){
        val instance1 = singleton
        val instance2 = singleton
        assertEquals(instance1,instance2)
    }

}