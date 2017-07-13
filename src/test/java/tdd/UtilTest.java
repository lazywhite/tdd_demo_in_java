package tdd;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Created by white on 17/7/13.
 */
public class UtilTest {
    private Util util;

    @Before
    public void before(){
        util = new Util();
    }

    @Test
    /* should return "mommy" when given "a" */
    public void mommifyTest(){
        String expected = "mommy";
        String result  = util.mommify("a");
    }

}
