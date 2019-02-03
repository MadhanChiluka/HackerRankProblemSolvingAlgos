import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingClouds20 {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int count = 0;
        for(int i=0; i<c.length; i++) {
        	if(i<c.length-2 && c[i+2]!=1 ) {
        		i=i+1;
        		count++;
        	}
        	else if(c[i]==0)
        		count++;
        }
        return count-1;

    }

    

    public static void main(String[] args) throws IOException {
       
        int n = 7;

        int[] c = new int[n];

        int[] cItems = {0, 0, 1, 0, 0, 1, 0};

        for (int i = 0; i < n; i++) {
            int cItem = (cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        System.out.println(result);
    }
}
