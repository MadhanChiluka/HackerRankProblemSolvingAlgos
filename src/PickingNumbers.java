import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PickingNumbers {

    // Complete the pickingNumbers function below.
    static int pickingNumbers(int a[]) {
    	int arrCount = 0;
    	for(int i=0; i<a.length-1; i++) {
    		for(int j=i+1; j<a.length; j++) {
    			if((a[0]-a[i]==0 || a[0]-a[i]==1)  && a[i]-a[j]==0 || a[i]-a[j]==1 || a[j]-a[i]==0 || a[j]-a[i]==1 ) {
    						arrCount++;
    			}
    		}
    		
    	}
    	System.out.println(arrCount);
    	return arrCount;
    }

    public static void main(String[] args) throws IOException {
        
        int n = 6;

        int[] a = new int[n];

        int[] aItems = {4, 6, 5, 3, 3, 1};

        for (int i = 0; i < n; i++) {
            int aItem = (aItems[i]);
            a[i] = aItem;
        }

        int result = pickingNumbers(a);

      // System.out.println(result);
    }
}
