package effective22

/**
 * Created by geniusmart on 2018/4/1.
 */
class Outer{

    class Inner{ // 静态成员类，等价于public final class Outer

    }

    inner class OtherInner{ // 非静态成员类

        fun action(){
            this@Outer.toString()
        }
    }
}