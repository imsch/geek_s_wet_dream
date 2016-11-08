package Numbers.Exceptions;

import Numbers.Number;

/**
 * Created by legion on 05.11.16.
 */
public class NoDecimalNumberException extends Exception {
    public NoDecimalNumberException() {
        super();
    }

    public NoDecimalNumberException(String s) {
        super(s);
    }

    public NoDecimalNumberException(Number number, int position){
        super();
        System.out.println(number+" is not a binary number, position "+(position+1)+" is wrong!");
    }
}
