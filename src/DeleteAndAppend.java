import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DeleteAndAppend {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
    	int count=0;
    	int min = 0;
    	if(s.length()<t.length())
    		min=s.length();
    	else 
    		min=t.length();
		String result="";
		String[] str1 = s.split("");
		String[] str2 = t.split("");
		int i=0;
    	while(i<min){
    		if(str1[i].equals(str2[i])) {
    			i=i+1;
    			continue;
    		}
    		if(!str1[i].equals(str2[i])) {
    			break;
    		}		
    	}
    	
    	for(int j=i; j<s.length(); j++) {
    		if(!str1[j].equals(null)) {
    			count++;
    		}
    	}
    	for(int j=i; j<t.length(); j++) {
    		if(!str2[j].equals("")) {
    			count++;
    		}
    	}
    	
    	if(k>=count) {
    		result = "Yes";
    	}
    	else 
    		result = "No";
    		
    return result;

    }

    

    public static void main(String[] args) throws IOException {
        

        String s = "ashley";

        String t = "ash";

        int k = 2;

        String result = appendAndDelete(s, t, k);
        System.out.println(result);

       
    }
}
