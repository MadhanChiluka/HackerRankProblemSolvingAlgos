import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FunnyString {

    // Complete the funnyString function below.
    static String funnyString(String s) {
    	char[] ch = s.toCharArray();
    	int[] svalue = new int[s.length()];
    	int[] rvalue = new int[s.length()];
    	int[] str = new int[s.length()];
    	int[] strrev =  new int[s.length()];
    	int count=0;
    	
    	for(int i=0,j=s.length()-1; i<s.length()&&j>=0; i++,j--) {
    		svalue[i]=(int)ch[i];
    		rvalue[i]=(int)ch[j];
    	}
    	for(int i=0; i<s.length()-1; i++) {
    		str[i]=Math.abs(svalue[i]-svalue[i+1]);
    		strrev[i]=Math.abs(rvalue[i]-rvalue[i+1]);
    		if(str[i]==strrev[i]) {
    			count++;
    		}
    	}
    	System.out.println(count);
    	return count+1==s.length()?"Funny":"Not Funny";
    }
    public static void main(String[] args) throws IOException {

        int q = 2;
        for (int qItr = 0; qItr < q; qItr++) {
            String s = "acxz";

            String result = funnyString(s);
            
            System.out.println(result);
            
        }
    }
}
