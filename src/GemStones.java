import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class GemStones {

    // Complete the gemstones function below.
    static int gemstones(String[] arr) {
    	String[] intial  = arr[0].split("");
    	int count = 0;
    	//System.out.println(arr[1].toCharArray());
    	
    	for(int i=1; i<intial.length; i++) {
    		char[] ch = arr[i].toCharArray();
    		//System.out.print("ch value "+ch[i]+" ");
    		for(int j = 0; j<ch.length; j++) {
    			//System.out.println("in loop "+ch[i]+" ");
    			if(intial[0].equals(ch[j])) {
    				
    				count++;
    				break;
    			}
    		}
    	}
    	return count;
    }

    
    public static void main(String[] args) throws IOException {

        int n = 3;

        String[] arr = {"abcdde", "baccd", "eeabg"};

        int result = gemstones(arr);
        System.out.println(result);

    }
}
