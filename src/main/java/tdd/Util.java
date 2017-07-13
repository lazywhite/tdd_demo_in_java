package tdd;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by white on 17/7/13.
 */
public class Util {
    private String[] words = {"a", "e", "i", "o", "u"};

    public String mommify(String word){
        int length = word.length();
        int count = countVowels(word);
        if((double)count/length > 0.3){
            //加入连续元音的判断
            String replaced = word.replaceAll("[aeiou]+", "mommy");
            return replaced;
        }

        return word;
    }

    private int countVowels(String word){
        //测试元音字符所占的比率
        int total = 0;
        for(int index=0;index<word.length();index++){
            if(isVowel(String.valueOf(word.charAt(index)))){
                total++;
            }
        }
        return total;

    }
    private boolean isVowel(String word){
        if(Arrays.asList(words).contains(word)) {
            return true;
        }
        return false;
    }

}
