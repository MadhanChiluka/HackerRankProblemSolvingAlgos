import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DivisibleSumPairs {

    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
    	int count=0;
    	int addition=0;
    	int mod =0; 
    	for(int i=0; i<ar.length; i++) {
    		for(int j=1; j<ar.length; j++) {
    			addition=ar[i]+ar[j];
    			mod=addition%k;
    			if(i<j && mod==0){
    				count++;
    			}
    		}
    	}
    	return count;
    }

    public static void main(String[] args) throws IOException {

        int n = 6;

        int k = 3;

        int[] ar = new int[n];

        int[] arItems = {1, 3, 2, 6, 1, 2};

        for (int i = 0; i < n; i++) {
            int arItem = arItems[i];
            ar[i] = arItem;
        }

        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}

