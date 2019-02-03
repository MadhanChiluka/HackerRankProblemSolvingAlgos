import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRankString {

    // Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {
    	String targetStr = "hackerrank";
    	String[] target = targetStr.split("");
    	String str[] = s.split("");
    	String result ="";
    	int k = 0;
    	for(int i=0; i<target.length; i++) {
    		for(int j=k; j<str.length; j++) {
    			if(str[j].equals(target[i])) {
    				result+=str[j];
    				k=1+j;
    				break;
    			}
    		}
    		
    	}
    	if(targetStr.equals(result)) {
    		result="YES";
    	}
    	else
    		result = "NO";
    	return result;
    }


    public static void main(String[] args) throws IOException {

        int q = 2;

        for (int qItr = 0; qItr < q; qItr++) {
            String s = "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";

            String result = hackerrankInString(s);

           System.out.println(result);
        }

    }
}
