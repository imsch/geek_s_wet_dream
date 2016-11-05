package numbers;

import numbers.Exceptions.NoBinaryNumberException;

import java.lang.*;

import static java.lang.Math.pow;

/**
 * Created by legion on 11/1/16.
 */
public class BinaryNumber extends Number{

    public BinaryNumber(String value) {
        this.value = value;
    }

    public int digits(){
        return value.length();
    }

    public String toString(){
        return value;
    }

}
