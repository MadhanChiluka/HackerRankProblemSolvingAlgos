import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	String[] str2= new String[(int)n];
    	long count = 0;
    	String[] str1 = s.split("");
    	
    	int i=0;
    	while(i<n) {
    		for(int j=0; j<s.length(); j++) {
    			if(i==n) {
    				break;
    			}
    			str2[i]=str1[j];
    			i++;
    		}
    	}
    	for(int j=0; j<n; j++) {
    		if(str2[j].equals("a")){
    			count++;
    		}
    	}
    	return count;
    }

   

    public static void main(String[] args) throws IOException {
       
        String s = "a";
        long n = 1000000000;
 
        long result = repeatedString(s, n);

        System.out.println(result);
    }
}
