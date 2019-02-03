import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockSquares {

    // Complete the squares function below.
    static int squares(int a, int b) {
    	int a1 = (int)Math.sqrt(a);
    	int b1 = (int)Math.sqrt(b);
    	int count = 0;
    	for(int i=a1; i<=b1; i++) {
    		if(i*i>=a && i*i<=b) {
    			count++;
    		}
    	}
    	return count;
    }

   
    public static void main(String[] args) {
        
        int q = 2;

        for (int qItr = 0; qItr < q; qItr++) {
            String[] ab = {"17", "24"};

            int a = Integer.parseInt(ab[0]);

            int b = Integer.parseInt(ab[1]);

            int result = squares(a, b);

            System.out.println(result);
        }

     
    }
}
