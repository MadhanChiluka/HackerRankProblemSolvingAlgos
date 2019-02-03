import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeautifulDays {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
    	int revNum=0;
    	int remainder=0;
    	int count=0;
    	int result=0;
    	
    	for(int m=i; m<=j; m++) {
    		int n=m;
    		while(n>0) {
    			remainder = n%10;
    			revNum=remainder+revNum*10;
    			n=n/10;
    		}
    		int diff = m-revNum;
    		if(diff<0) {
    			diff = -(diff);
    		}
    		if(diff%k==0)
    			count++;
    		revNum = 0;
    		
    	}
    	
    	return count;
    	}

    


    public static void main(String[] args) throws IOException {
        
        int[] ijk = {20, 23, 6};
        
        int i = (ijk[0]);

        int j = (ijk[1]);

        int k = (ijk[2]);

        int result = beautifulDays(i, j, k);

        System.out.println(result);
    }
}
