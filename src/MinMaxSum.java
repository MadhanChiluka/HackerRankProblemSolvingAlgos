import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    int sum = 0;
    int a[] = new int[5];
    int res[] = new int[5];
    for(int i=0; i<arr.length; i++) {
    	for (int j=0; j<arr.length; j++) {
    		if(i!=j) {
    			sum = sum + arr[j];
    		}
    		else {
    			continue;
    	}
    }
    	a[i]=sum;
    	sum=0;
    	res[i]=a[i];
    }
    Arrays.sort(res);
    	System.out.println(res[0]+" "+res[arr.length-1]);
    
    
    }


    public static void main(String[] args) {
        int[] arr = new int[5];

        int arrItems[]= {1,2,3,4,5};
        for (int i = 0; i < 5; i++) {
            int arrItem = arrItems[i];
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        
    }
}
