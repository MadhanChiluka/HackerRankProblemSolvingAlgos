import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SavePrisoners {

    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {
    	int result=0;
    	
    	if((m+s-1)%n==0) {
    	result = n;
    	}
    	else 
    		result = (m+s-1)%n;
    	
    	return result;

    }

    
    public static void main(String[] args) throws IOException {
       
        int t = 2;

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nms = {"499999999", "999999997", "2"};

            int n = Integer.parseInt(nms[0]);

            int m = Integer.parseInt(nms[1]);

            int s = Integer.parseInt(nms[2]);

            int result = saveThePrisoner(n, m, s);
            System.out.println(result);

        }
    }
}
