import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class BetweenTwoSets {

    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
    	int [] factors = new int[10];
    	int factor = 0;
        for(int i=0; i<a.length-1; i++) {
        	factors[i] = a[i]*a[i+1];
        }
        	for(int j=0; j<factors.length; j++) {
        		System.out.print(factors[j]+" ");
        
        }
       System.out.println(factor);
       return  0 ;
    }


    public static void main(String[] args) throws IOException {

        int[] nm = {2,3};

        int n =nm[0];

        int m =nm[1];


        int[] a = {2, 4};


        int[] b = {16, 32, 96};

        int total = getTotalX(a, b);

        System.out.println(total);
    }
}
