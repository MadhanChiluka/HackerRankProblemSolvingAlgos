import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IceCreamParlor {

    // Complete the icecreamParlor function below.
    static int[] icecreamParlor(int m, int[] arr) {
    	int[] result = new int[2];
    	for(int i=0; i<arr.length-1; i++) {
    		for(int j=i+1; j<arr.length; j++) {
    		if(arr[i]+arr[j]==m) {
    			result[0]=i+1;
    			result[1]=j+1;
    		}
    	}
    }
    	return result;
    }


    public static void main(String[] args) throws IOException {

        int t =2;
        for (int tItr = 0; tItr < t; tItr++) {
            int m = 4;
            int n = 5;

            int[] arr = {2, 2, 4, 3};

            int[] result = icecreamParlor(m, arr);

            for (int i = 0; i < result.length; i++) {
               System.out.print(result[i]+" ");
            }
        }
    }
}