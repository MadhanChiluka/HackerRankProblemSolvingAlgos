import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AngryProfessor {

    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
    	int attdOnTime = 0;
    	int attendees=0;
    	for(int i=0; i<a.length; i++) {
    		attendees=a[i];
    		if(attendees<=0) {
    			attdOnTime++;
    		}
    	}
    	if(attdOnTime>=k)
    		return "NO";
    	else 
    		return "YES";
    
    }

   
    public static void main(String[] args) throws IOException {
       
        int t = 1;

        for (int tItr = 0; tItr < t; tItr++) {
            int[] nk = {4,3};

            int n = (nk[0]);

            int k = (nk[1]);

            int[] a = new int[n];

            int[] aItems = {-1, -3, 4, 2};
            for (int i = 0; i < n; i++) {
                int aItem = (aItems[i]);
                a[i] = aItem;
            }

            String result = angryProfessor(k, a);

            System.out.println(result);
        }

      
    }
}
