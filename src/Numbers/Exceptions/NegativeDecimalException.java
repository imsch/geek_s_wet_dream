package Numbers.Exceptions;

import Numbers.DecimalNumber;

/**
 * Created by legion on 11/8/16.
 */
public class NegativeDecimalException extends Exception {

    public NegativeDecimalException() {
        super();
    }

    public NegativeDecimalException(String s) {
        super(s);
    }

    public NegativeDecimalException(DecimalNumber n){
        super();
        System.out.println(n+" is negative!");
    }
}
