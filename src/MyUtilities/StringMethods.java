package MyUtilities;

import java.util.Random;

/**
 * Created by legion on 11/8/16.
 */
public class StringMethods {

    public String stringInvert(String s) {

        String returnString = "";
        for (int i = 0; i < s.length(); i++) {
            returnString=returnString+s.charAt(s.length()-1-i);
        }
        return returnString;
    }

    public String shuffle(String s){
        Random r = new Random();
        String returnString = "";
        for (int i = 0; i < s.length(); i++) {
            returnString=returnString+s.charAt(r.nextInt(s.length()));
        }
        return returnString;
    }

}
