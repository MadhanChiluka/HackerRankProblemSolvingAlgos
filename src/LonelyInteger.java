import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LonelyInteger {

    // Complete the lonelyinteger function below.
    static int lonelyinteger(int[] a) {
    	int match = 0;
    	int result = 0;
    	for(int i=0; i<a.length; i++) {
    		for(int j=0; j<a.length; j++) {
    			if(a[i]==a[j] && i!=j) {
    				match = 1;
    			}
    		}
    		if(match!=1) {
    			result = a[i];
    		}
    		match = 0;
    	}
    	return result;

    }


    public static void main(String[] args) throws IOException {

        int n = 5;

        int[] a = {0, 0, 1, 2, 1};

        int result = lonelyinteger(a);
        
        System.out.println(result);
    }
}
