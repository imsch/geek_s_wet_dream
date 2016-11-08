package Numbers.Exceptions;
import Numbers.BinaryNumber;

public class NoBinaryNumberException extends Exception {
    public NoBinaryNumberException() {
        super();
    }

    public NoBinaryNumberException(String s) {
        super(s);
    }

    public NoBinaryNumberException(BinaryNumber number, int position){
        super();
        System.out.println(number+" is not a binary number, position "+(position+1)+" is wrong!");
    }
}
