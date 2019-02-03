import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	int down = 0;
    	int up = 0;
    	int valleyCount = 0;
    	int variance = 0;
    	String str[]= new String[n];
    	String s1[] = s.split("");
    	
    	for(int i=0; i<n; i++) {
    		String st=s1[i];
    		str[i] = st;
    	}
    	for(int i=0; i<n; i++) {
    		if(down>0 && str[i].equals("U")) {
    			up++;
    		}
    		else if(down==0 && str[i].equals("U")) {
    			variance++;
    		}
    		else if(str[i].equals("D")) {
    			down++;		
    		}
    		down-=variance;
    		
    		if( down>0 && down == up) {
    			valleyCount++;
    			down=0;
    			up=0;
    			
    		} 
    		variance=0;
    	}
    	System.out.println(up);
    	System.out.println(down);
    	System.out.println(variance);
    	return valleyCount;
    }

    public static void main(String[] args) throws IOException {
        
        int n = 8;
       
        String s = "DUUDDUDU";

        int result = countingValleys(n, s);

       System.out.println(result);
    }
}
