package Numbers;


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

    public String toString() {
        return value;
    }

}
