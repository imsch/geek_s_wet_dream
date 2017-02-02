package Numbers;

/**
 * Created by legion on 05.11.16.
 */
public class DecimalNumber extends Number {
    public int value;

    public DecimalNumber(int value) {
        this.value = value;
    }

    public String toString() {
        return "" + value;
    }
}
