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

        assertEquals("c", util.mommify("c"));
    }

    @Test
    /* 元音超过30%的字符串, 应该将元音替换成mommy*/
    public void mommifyTest02(){
        String expected = "shmommy";
        String result = util.mommify("she");
        assertEquals(expected, result);
    }
    @Test
    /* 元音超过30%的字符串, 并有连续元音出现, 应该将连续元音替换成一个mommy*/
    public void mommifyTest03() {
        String expected = "shmommytmommy";
        String result = util.mommify("sheete");
        assertEquals(expected, result);
    }
}
