package tdd;

import java.util.Arrays;

/**
 * Created by white on 17/7/13.
 */
public class Util {

    public String mommify(String word){
        String[] words = {"a", "e", "i", "o", "u"};
        if(Arrays.asList(words).contains(word)){
            return "mommy";
        }
        return null;
    }

}
