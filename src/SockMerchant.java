import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	int count=0;
    	int skip[] = new int[ar.length];
    	int skipInt=0;
    	for(int i=0; i<ar.length; i++) {
    		for(int l=0; l<ar.length; l++) {
    			if(skip[l]!=i)
    		
    		for(int j=i+1,k=0; j<ar.length; j++,k++) {
    			if(ar[j]==ar[i]) {
    				count++;
    				skipInt=j;
    				System.out.print(j+" ");
    				System.out.println(i+" "+j);
    				break;
    			}
    		}
    			
    			skip[l]=skipInt;
    			
		}
    		
   	}
    	return count;
    }
    public static void main(String[] args) throws IOException {

        int n = 9;

        int[] ar = new int[n];

        int[] arItems = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        for (int i = 0; i < n; i++) {
            int arItem = (arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        
       System.out.println(result);
    }
}