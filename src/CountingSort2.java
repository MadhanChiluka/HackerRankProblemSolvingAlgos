import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingSort2 {

    // Complete the countingSort function below.
    static int[] countingSort(int[] arr) {
    	int max = -1;
    	int count=0;
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i]>max) {
    			max=arr[i];
    		}
    	}
    	
    	int[] result =  new int[max+1];
    	
    		for(int i=0; i<arr.length; i++) {
    			if(arr[i]%(max+1)>=0) {
    				count++;
    			}
    			result[arr[i]%(max+1)]+=count;
    			count = 0;
    		}
    		int m=0;
    		for(int i=0; i<result.length; i++) {
    			while(result[i]>0) {
    				
    				arr[m]=i;
    				m++;
    				result[i]--;
    				
    			}
    		}
    	
    	return arr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      
        String[] arrItems = scanner.nextLine().split(" ");
        
        int n = 7;
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = countingSort(arr);
        
        

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
        
    }
}
