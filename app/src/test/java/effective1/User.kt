package effective1

import org.junit.Test

/**
 * Created by geniusmart on 2018/3/31.
 */
class User private constructor(val account:String){

    companion object {

        fun newWeiboUser(email:String):User{
            return User(email)
        }

        fun newTelUser(tel:Long):User{
            return User(tel.toString())
        }
    }

}

class TestUser{

    @Test
    fun test1(){
        val newTelUser = User.newTelUser(18888888888)
        val weiBoUser = User.newWeiboUser("geniusmart")
        println(newTelUser.account)
    }
}

//TODO 伴生对象的更多用法--伴生对象实现接口，伴生对象扩展