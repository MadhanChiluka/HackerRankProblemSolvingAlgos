import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeautifulTriplets {

    // Complete the beautifulTriplets function below.
    static int beautifulTriplets(int d, int[] arr) {
    	int count = 0;
    	int maxReach=0;
    	int intial =0;
    	for(int i = 0; i<arr.length-1; i++) {
    		intial=arr[i]+d;
    		for(int j=i; j<arr.length; j++) {
    			if(intial == arr[j]) {
    				count++;
    				intial+=d;
    			}
    			if(count==2) {
    				maxReach++;
    				break;
    				}
    		}count=0;
    	}
return maxReach;
    }

   
    public static void main(String[] args) throws IOException {
        
        String[] nd = {"7", "3"};

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);


        int[] arr = {1, 2, 4, 5, 7, 8, 10};
        
        int result = beautifulTriplets(d, arr);

        System.out.println(result);
    }
}
