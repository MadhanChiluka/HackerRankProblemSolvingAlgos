import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaxPeriTriangle {

    // Complete the maximumPerimeterTriangle function below.
    static int[] maximumPerimeterTriangle(int[] sticks) {
    	Arrays.sort(sticks);
    	long max = 0;
    	long result = 0;
    	long lower = 0;
    	long middle = 0;
    	long higher = 0;
    	int flag=0;
    	for(int i=0; i<sticks.length-2; i++) {
    		for(int j=i+1; j<sticks.length-1; j++) {
    			for(int k=j+1; k<sticks.length ; k++) {
    					if(sticks[i]+sticks[j]>sticks[k]) {
    						result = sticks[i]+sticks[j]+sticks[k];
    						//System.out.println(result);
    							if(result>max) {
    								System.out.println(result);
    								max = result;
    								lower = sticks[i];
    								middle = sticks[j];
    								higher = sticks[k];
    								System.out.println("lower "+lower+" middle "+middle+" higher "+higher);
    							}//1000000000 419000000
    						}
    					}	
    				}
    			}
		if(lower+middle<=higher) {
			int res[] = new int[1];
			res[0]=-1;
			return res;
		}
		else {
			int res[] = new int[3];
			res[0]=(int)lower;
			res[1]=(int)middle;
			res[2]=(int)higher;
			
			return res;
		}
			
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        int n = 50;
        //int result1 = 1000000000+1000000000+1000000000;
        //System.out.println("Result "+result1);
        //int[] sticks = {1, 1, 1, 3, 3};
        
        int[] sticks = {1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000};
       

       int[] result = maximumPerimeterTriangle(sticks);

        for (int i = 0; i < result.length; i++) {
           System.out.println(result[i]);
            }
       
    }
}
