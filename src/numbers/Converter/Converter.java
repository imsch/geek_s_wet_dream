package numbers.Converter;

import numbers.BinaryNumber;
import numbers.Exceptions.NoBinaryNumberException;

import static java.lang.Math.pow;

/**
 * Created by legion on 11/4/16.
 */
public class Converter {



    public int toNumber(BinaryNumber number) throws Exception {
        int decimalNumber = 0;
        for (int i = number.digits() - 1; i >= 0; i--) {

            int currentDigit = Character.getNumericValue(number.charAt(i));
            int currentExponent = number.digits() - 1 - i;
            if (currentDigit < 0 || currentDigit > 1) {
                throw new NoBinaryNumberException(number, i);
            } else {
                decimalNumber += currentDigit * pow(2, currentExponent);
            }
        }
        return decimalNumber;
    }
}
