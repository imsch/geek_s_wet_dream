package Numbers;


import MyUtilities.StringMethods;
import Numbers.Converter.Converter;
import Numbers.Exceptions.NoBinaryNumberException;

import java.lang.*;


/**
 * Created by legion on 11/1/16.
 */
public class BinaryNumber extends Number {

    public String value;

    public BinaryNumber(String value) {
        this.value = value;
    }

    public int digits() {
        return value.length();
    }

    public int length() {
        return value.length();
    }

    public String toString() {
        return value;
    }

    public BinaryNumber add(BinaryNumber bn) {
        Converter convert = new Converter();
        try {
            DecimalNumber dec1 = convert.binaryToDecimal(this);
            DecimalNumber dec2 = convert.binaryToDecimal(bn);
            BinaryNumber erg = convert.decimalToBinary(new DecimalNumber(dec1.value + dec2.value));

            return erg;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
