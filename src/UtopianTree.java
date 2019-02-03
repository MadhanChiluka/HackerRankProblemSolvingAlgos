import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class UtopianTree {

    // Complete the utopianTree function below.
    static int utopianTree(int n) {
    	int hght=1;
    	int maxHght=0;
    	for(int i=0; i<=n; i++) {
    		if(i==0) {
    			hght=1;
    		}
    		else if(i%2==1) {
    			hght=hght*2;
    		}
    		else if(i%2==0) {
    			hght=hght+1;
    		}
    		maxHght=hght;
    		
    	}
    	return maxHght;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        
        int t[]= {3,0,1,4};

        for (int tItr = 1; tItr < t.length; tItr++) {
            int n = t[tItr];
            int result = utopianTree(n);
            System.out.println(result);
        }

        
    }
}
