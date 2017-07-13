package tdd;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

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
        String[] words = {"a", "e", "i", "o", "u"};
        Arrays.asList(words).forEach(word -> assertEquals("mommy", util.mommify(word)));
    }

}
