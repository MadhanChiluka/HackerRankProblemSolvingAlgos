import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FindDigits {

    // Complete the findDigits function below.
    static int findDigits(int n) { 	
    	int temp1 = n;
    	int temp2 = n;
    	int count = 0;
    	int divCount = 0;
    	
    	while(temp1>0) {
    		temp1 = temp1/10;
    		count++;
    	}
    	
    	int digits[]= new int[count];
    	for(int i=0; i<count; i++) {
    		digits[i]=temp2%10;
    		temp2 = temp2/10;
  
    	}
    	for(int i=0; i<count; i++) {
    		if(digits[i]!=0 && n%digits[i]==0) {
    			divCount++;
    		}
    	}
    	return divCount;

    }

    

    public static void main(String[] args) throws IOException {
       
        int t = 2;

        for (int tItr = 0; tItr < t; tItr++) {
            int n = 12;
            int result = findDigits(n);
            
            System.out.println(result);
      
        }

        
    }
}
