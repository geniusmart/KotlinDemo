package strings;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by geniusmart on 2018/3/11.
 */

public class DemoTest {

    @Test
    public void test1(){
        String name = "geniusmart";

        char lastChar1 = StringUtilsKt.getLastChar(name);
        char lastChar2 = StringUtilsKt.lastChar(name);

        assertEquals(lastChar1,lastChar2);

    }




}
