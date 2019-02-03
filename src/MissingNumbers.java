import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MissingNumbers {

    // Complete the missingNumbers function below.
    static int[] missingNumbers(int[] arr, int[] brr) {
    	int count = 0;
    	int count1 = 0;
    	int resItem = 0;
    	for(int i=0; i<brr.length; i++) {
    		for(int j=0; j<brr.length; j++) {
    			if(brr[i]==brr[j]) {
    				count++;	
    			}
    		}
    		for(int m=i; m<arr.length; m++) {
    			for(int k=0; k<arr.length; k++) {
    				if(arr[m]==arr[k]) {
    					count1++;
    				}
    			}
    		if(count1!=count) {
    			resItem=arr[i];
    		}
    		System.out.print(+resItem+" ");
    		count = 0;
    	}
    	}
    	System.out.println();
    	return arr;
    }


    public static void main(String[] args) throws IOException {

        int n = 10;

        int[] arr = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};

        int m = 13;
        int[] brr = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};

        int[] result = missingNumbers(arr, brr);

        for (int i = 0; i < result.length; i++) {
            
            System.out.print(result[i]+" ");
            }
        }

    }
