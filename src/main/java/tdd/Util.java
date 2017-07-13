package tdd;

import java.util.Arrays;

/**
 * Created by white on 17/7/13.
 */
public class Util {

    public String mommify(String word){
        //元音字符, 返回mommy
        String[] words = {"a", "e", "i", "o", "u"};
        if(Arrays.asList(words).contains(word)){
            return "mommy";
        }
        //非元音字符, 返回自身
        return word;
    }

}
