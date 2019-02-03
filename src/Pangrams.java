import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Pangrams {

    // Complete the pangrams function below.
    static String pangrams(String s) {
    	String strng ="";
    	String[] str = s.toLowerCase().split(" ");
    	for(int i=0; i<str.length; i++) {
    		strng+=str[i];
    	}
    	
    	
    	Set<Character> alpSet = new HashSet<Character>();
        for(int i=0; i<strng.length(); i++){
            alpSet.add(strng.charAt(i));
        }
        return (alpSet.size() == 26) ? "pangram" : "not pangram";
    	
    }

    
    public static void main(String[] args) throws IOException {
       
        String s = "The  brown fox jumps over the lazy dog";

        String result = pangrams(s);
        
        System.out.println(result);
    }
}
