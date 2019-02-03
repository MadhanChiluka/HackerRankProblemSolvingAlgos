import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CutTheSticks {

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
    	int element = 0 ;
    	int minElement = 0;
    	int cutLength = 0;
    	int resArrLen = 0;
    	int stickCutNum = 0 ;
    	int numOfSticks = 0;
    	int result[] = new int[arr.length];
    	
    	for(int i=0; i<arr.length; i++) {
    		for(int j=0; j<arr.length; j++) {
    			element = arr[j];
    			if(minElement<element) {
    				minElement = element;
    				resArrLen++;
    			}
    		}
    		cutLength = minElement;
    		for(int j=0; j<arr.length; j++) {
    			if(arr[j]==0)
    				continue;
    			else {
    				arr[j]= arr[j]-cutLength;
    				stickCutNum++;
    				numOfSticks = stickCutNum;
    			}
    		}
    		
    		stickCutNum=0;
    		
    	}
    	for(int k = 0 ; k<resArrLen-1; k++) {
			result[k]=numOfSticks;
			//sSystem.out.print(numOfSticks+" "+result[k]);
		}
    	
    	return result;

    }
   
    public static void main(String[] args) throws IOException {
        
        int n = 8;

        

        int[] arr = {1, 2, 3, 4, 3, 3, 2, 1};

        

        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}