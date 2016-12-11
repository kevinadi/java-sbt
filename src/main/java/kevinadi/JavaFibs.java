package kevinadi;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.math.BigInteger;

public class JavaFibs {
    protected static List<BigInteger> fibs(int n) {
        List<BigInteger> f = new ArrayList<BigInteger>( Arrays.asList(BigInteger.ONE,BigInteger.ONE) );
        for(int i = 2; i < n; i++) {
            f.add( f.get(f.size() - 1).add(f.get(f.size() - 2)) );
        }
        return f.subList(0,n);
    }

    public static List<BigInteger> list(int n) {
        return fibs(n);
    }

    public static BigInteger num(int n) {
        return fibs(n).get(n-1);
    }
}