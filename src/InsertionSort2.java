import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class InsertionSort2 {

    // Complete the insertionSort2 function below.
    static int insertionSort2(int n, int[] arr) {
    	int count = 0;
    	for(int i=1; i<arr.length; i++) {
    		int key = arr[i];
    		int j=i-1;
    		while(j>=0 && arr[j]>key) {
    			arr[j+1] = arr[j];
    			count++;
    			j=j-1;
    		}
    		arr[j+1]=key;
    		
    	}for(int i=0; i<arr.length; i++) {
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println();
    	return count;
    }

    public static void main(String[] args) {
        int n = 6;

        int[] arr= {2, 1, 3, 1, 2};

        int result = insertionSort2(n, arr);
        System.out.println(result);
       
    }
}
