import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FindMedian {

    // Complete the findMedian function below.
    static int findMedian(int[] arr) {
    	int temp = 0;
    	int midInt = 0;
    	int median=0;
    	
    	//Arrays.sort(arr);
    	
    	for(int i=0; i<arr.length-1; i++) {
    		for(int j=i+1; j<arr.length; j++) {
    			if(arr[i]>arr[j]) {
    			temp=arr[i];
    			arr[i]=arr[j];
    			arr[j]=temp;
    			}
    		}
    	}
    	
    	for(int j=0 ; j<arr.length; j++) {
    		System.out.print(arr[j]+" ");
    	}
    	midInt = (arr.length-1)/2;
    	median= arr[midInt];
    	return median;
    }


    public static void main(String[] args) throws IOException {

        int n = 7;

        int[] arr = new int[n];

        String[] arrItems = {"0", "1", "2", "4", "6", "5", "3"};

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = findMedian(arr);
        System.out.println(result);
    }
}
