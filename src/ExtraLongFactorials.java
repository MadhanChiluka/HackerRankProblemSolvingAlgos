import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ExtraLongFactorials {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
    	BigInteger fact = BigInteger.ONE;
    	for (int i=n; i>=1; i--) {
    		fact = fact.multiply(new BigInteger(String.valueOf(i)));
   
    	}
    	System.out.println(fact);
    	
    }

   

    public static void main(String[] args) {
        int n = 25;

        extraLongFactorials(n);

    }
}