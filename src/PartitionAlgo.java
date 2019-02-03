import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PartitionAlgo {

    // Complete the quickSort function below.
    static int[] quickSort(int[] arr) {
        int pivot = arr[0];
        int result[] = new int[arr.length];
        int count = 0;
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]<pivot) {
        		count++;
        	}
        }
        int m = 0;
        int n=count+1;
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]<pivot) {
        		result[m]=arr[i];	
        		m=m+1;
            }
        	else if(arr[i]==pivot) {
        		result[count]=arr[i];
        	}
        	else if(arr[i]>pivot) {
        		result[n]=arr[i];	
        		n=n+1;
            }
        }
        
        return result;
    }
    


    public static void main(String[] args) throws IOException {

        int n = 9;

        int[] arr = {-3, -10, -5, -7, 0, 6, 4, 8, 2};

        int[] result = quickSort(arr);

        for(int i=0; i<arr.length; i++) {
        	System.out.print(result[i]+" ");
        }
    }
}
