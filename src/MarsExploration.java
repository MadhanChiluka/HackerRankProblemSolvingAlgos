import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MarsExploration {

    // Complete the marsExploration function below.
    static int marsExploration(String s) {
    	String str[] = s.split("");
    	String strng = "";
    	int count = 0;
    	int result = 0;
    	
    	for(int i=0; i<s.length(); i=i+3) {
    		strng+="SOS";
    	}
    	
    	String[] strng1 = strng.split("");
    	
    	for(int i=0; i<strng1.length; i++) {
    		if(str[i].equals(strng1[i])) {
    			count++;
    		}
    	}
    	result = s.length()-count;
    	return result;
    }


    public static void main(String[] args) throws IOException {

        String s = "SOSOOSOSOSOSOSSOSOSOSOSOSOS";

        int result = marsExploration(s);

        System.out.println(result);
    }
}
