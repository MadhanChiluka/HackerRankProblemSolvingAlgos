import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AppleAndOrangeCount {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
       int appleCount = 0;
       int orangeCount=0;
    	for(int i=0; i<apples.length; i++){
            if(apples[i]+a>=s && apples[i]+a<=t) {
            	appleCount++;
            }
        }
    	System.out.println(appleCount);
    	
    	for(int i=0; i<oranges.length; i++) {
    		if(oranges[i]+b>=s && oranges[i]+b<=t) {
    			orangeCount++;
    		}
    	}System.out.println(orangeCount);
    }

    

    public static void main(String[] args) {
        

        int s = 7;

        int t = 10;

        int a = 4;

        int b = 12;

       
        int m = 3;

        int n = 3;

        int[] apples = new int[m];

        int[] applesItems = {2,3,-4};

        for (int i = 0; i < m; i++) {
            int applesItem =applesItems[i];
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        int[] orangesItems = {3,-2,-4};

        for (int i = 0; i < n; i++) {
            int orangesItem = orangesItems[i];
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        
    }
}
