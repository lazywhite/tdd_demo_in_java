package tdd;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by white on 17/7/13.
 */
public class Util {

    public String mommify(String word){
        String[] words = {"a", "e", "i", "o", "u"};
        int length = word.length();
        //元音字符, 返回mommy
        if(length == 1){
            if(Arrays.asList(words).contains(word)) {
                return "mommy";
            }else{
                //非元音字符, 返回自身
                return word;
            }
        }

        //测试元音字符所占的比率
        int total = 0;
        for(int index=0;index<length;index++){
            if(Arrays.asList(words).contains(String.valueOf(word.charAt(index)))){
                total++;
            }
        }
        if((double)total/length > 0.3){
            String result = word.replaceAll("[aeiou]", "mommy");
            return result;
        }
        
        return word;
    }

}
