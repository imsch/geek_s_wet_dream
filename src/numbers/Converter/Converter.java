package numbers.Converter;

import numbers.BinaryNumber;
import numbers.DecimalNumber;
import numbers.Exceptions.NoBinaryNumberException;

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
        String bin = "";
        int dec = number.value;

        while (dec != 0) {
            bin += dec % 2;
            dec /= 2;
        }
        String swap = "";
        for(int i = 0; i< bin.length(); i++){

            swap = swap+bin.charAt(bin.length()-i);
        }
        return new BinaryNumber(swap);
    }
}
