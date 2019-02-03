import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BirthdayChocolate {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
    	int count=0;
    	int result=0;
    	//System.out.println(m);
    	
    	for(int i=0; i<s.size()-m+1; i++) {
    		for(int j=i; j<i+m; j++) {
    			result+=s.get(j);
    		}
    			if(result==d) {
    			count++;		
    		}
    		result=0;
    	}
    
    	return count;
    }

    public static void main(String[] args) throws IOException {

        int n = 21;

        int[] sItems = {5, 1, 4, 1, 5, 4, 5, 1, 3, 5, 1, 1, 5, 1, 4, 2, 1, 1, 1, 2, 5};

        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sItem = sItems[i];
            s.add(sItem);
        }

        int[] dm = {15, 7};

        int d = dm[0];

        int m = dm[1];

        int count = birthday(s, d, m);
        
        System.out.println(count);
    }
}