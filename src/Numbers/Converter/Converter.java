package Numbers.Converter;


import Numbers.*;
import Numbers.Exceptions.*;
import MyUtilities.*;

import static java.lang.Math.pow;

/**
 * Created by legion on 11/4/16.
 */
public class Converter {


    public DecimalNumber binaryToDecimal(BinaryNumber number) throws Exception {
        int dec = 0;
        for (int i = number.digits() - 1; i >= 0; i--) {

            int currentDigit = Character.getNumericValue(number.value.charAt(i));
            int currentExponent = number.digits() - 1 - i;
            if (currentDigit < 0 || currentDigit > 1) {
                throw new NoBinaryNumberException(number, i);
            } else {
                dec += currentDigit * pow(2, currentExponent);
            }
        }
        return new DecimalNumber(dec);
    }

    public BinaryNumber decimalToBinary(DecimalNumber number) throws Exception {
        StringMethods sm = new StringMethods();
        String binWO = ""; //Wrong Order
        int dec = number.value;
        if (dec < 0) {
            throw new NegativeDecimalException(number);
        } else {
            while (dec != 0) {
                binWO += dec % 2;
                dec /= 2;
            }
        }
        return new BinaryNumber(sm.stringInvert(binWO));
    }
}
