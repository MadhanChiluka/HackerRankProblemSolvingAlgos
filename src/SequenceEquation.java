import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SequenceEquation {

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
    	int newP[] = new int[p.length];
    	int temp = 0;
    	for(int i=1; i<=p.length; i++) {
    		for(int j=0; j<p.length; j++) {
    			if(i==p[j]) {
    				temp = j+1;
    			}
    		}
    		for(int j=0; j<p.length; j++) {
    			if(temp==p[j])
    				newP[i-1] = j+1;
    		}
    	}
    	return newP;

    }

    

    public static void main(String[] args) throws IOException {
        
        int n = 5;
        int[] p = new int[n];

        int[] pItems = {4, 3, 5, 1, 2};

        for (int i = 0; i < n; i++) {
            int pItem = (pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);

        for (int i = 0; i < result.length; i++) {
        	System.out.println(result[i]);
            }
    }
}
