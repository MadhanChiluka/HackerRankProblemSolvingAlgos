import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ClosestNumbers {

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
    	
    	Set<Integer> list = new HashSet<Integer>();
			
    	
    	int diff = 0;
    	int minDiff = 999999999;
    	int intial = 0;
    	Arrays.sort(arr);
    	for(int i =0; i<arr.length; i++) {
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println();
    	String res = "";
    	for(int i=0; i<arr.length-1; i++) {
    		diff = Math.abs(arr[i]-arr[i+1]);
    		if(minDiff>=diff) {
    			minDiff = diff;
    			list.add(arr[i]);
    			list.add(arr[i+1]);
    		}
    		
    	}
    	System.out.println("Min diff "+minDiff);
    	System.out.println();
    	int[] result = new int[list.size()];
    	for(int i=0; i<list.size()-1; i++){

    	}
    	return result;
    	
    }

    public static void main(String[] args) throws IOException {

        int n = 10;

        int[] arr = {-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854};

        int[] result = closestNumbers(arr);

        for (int i = 0; i < result.length; i++) {
           System.out.print(result[i]+" ");
            }
        }

}
