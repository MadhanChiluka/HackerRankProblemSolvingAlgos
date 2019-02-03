import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class EqualizeArrays {

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
    	int repeatNum = 0;
    	int count = 0;
    	int i=0;
    	int maxRepeatNum = 0;
    	int maxRepeatCount = 0;    		
    	while(i<arr.length-1) {
    		for(int j = i; j<arr.length; j++) {
    			if(i==0)
    				repeatNum=arr[0];
    			if(repeatNum==arr[j]) {
    				count++;
    			}
    			if(maxRepeatCount<count) {
    				maxRepeatCount = count;
    				//maxRepeatNum = repeatNum;
    				System.out.println(maxRepeatNum);
    			}
    		}
    		i=i+1;
    	}
    	for(int j=0; j<arr.length; j++) {
    		if(arr[j]!=maxRepeatNum) {
    			count++;
    		}
    	}
    	return maxRepeatCount;

    }

    
    public static void main(String[] args) throws IOException {
        

        int n = 35;
        

        int[] arr = {32, 32, 37, 72, 72, 96, 12, 32, 67, 37, 57, 18, 57, 78, 29, 34, 67, 16, 34, 78, 72, 33, 96, 16, 37, 32, 87, 43, 29, 16, 48, 49, 29, 37, 32};


        int result = equalizeArray(arr);

        System.out.println(result);
    }
}
