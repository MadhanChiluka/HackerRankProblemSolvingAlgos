import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CamelCase {

    // Complete the camelcase function below.
    static int camelcase(String s) {
    	int count = 1;
    	char ch[] = s.toCharArray();
    	for(int i=0; i<ch.length; i++) {
    		char ch1 = ch[i];
    		if((int)ch1>=65 && (int)ch1<=90) {
    			count++;
    		}
    	}
    	return count;

    }


    public static void main(String[] args) throws IOException {

        String s = "saveChangesInTheEditor";
        int result = camelcase(s);

        System.out.println(result);
    }
}
