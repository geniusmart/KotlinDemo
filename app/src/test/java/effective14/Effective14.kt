package effective14

import org.junit.Test

/**
 * Created by geniusmart on 2018/4/1.
 */
class Effective14{

    @Test
    fun test(){
        val user = User()
        println(user.num)//实际上调用的是getNum()
        user.nickname = "Mr.Geniusmart"//实际上调用的是setNum()
        println(user.nickname)
    }

}

class User{

    val num = 10
    var nickname = "geniusmart"
        get() = field.plus("@email.com")

}