import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CircularArrayRotation {

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
    	int temp1 = 0;
    	int temp2 = 0;
    	int queryItem = 0;
    	int result[] = new int[queries.length];
    	for(int i=0; i<k; i++) {
    		for(int j=0; j<a.length-1; j++) {
    			if(j==0)
    				temp1 = a[j];
    			temp2 = a[j+1];
    			a[j+1] = temp1;
    			temp1 = temp2;		
    		}
    		a[0]=temp1;
    	}
    	
    	for(int j=0; j<queries.length; j++) {
    		queryItem=queries[j];
    		result[j]=a[queryItem];
    	}
    	return result;

    }

    
    public static void main(String[] args) throws IOException {
        

        int[] nkq = {5, 2, 3};
        int n = (nkq[0]);

        int k = (nkq[1]);

        int q = (nkq[2]);

        int[] a = new int[n];

        int[] aItems = {1, 2, 3, 4, 5};

        for (int i = 0; i < n; i++) {
            int aItem = (aItems[i]);
            a[i] = aItem;
        }

        int[] queries = {0, 1, 2};

        int[] result = circularArrayRotation(a, k, queries);

        for (int i = 0; i < result.length; i++) {
        	System.out.println(result[i]);
            }
        }
}
