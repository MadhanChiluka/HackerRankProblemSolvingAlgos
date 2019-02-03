import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ModifiedKaprekarNum {

    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q) {
    	/*long n =0;
    	long ntemp = 0;
    	long sqNumCount = 0;
    	long sum = 0;
    	long digitCount = 0;
    	long div=1;
    	int temp =0 ;
    	
    	for(int i=p; i<=q; i++) {
    		n=i*i;
    		ntemp=n;
    		while(n>0) {
    			n = n/10;
    			digitCount++;
    		} 
    		if(digitCount==1) {
    			sqNumCount=0;
    		}
    		else if(digitCount%2==1) {
    			digitCount=digitCount+1;
    			sqNumCount=digitCount/2;
    		}
    		else
    			sqNumCount = digitCount/2;
    		digitCount=0;
    		long[] result =  new long[2];
    		for(int j=0; j<sqNumCount; j++) {
    			div=div*10;
    		}
    		if(sqNumCount==0)
    			sum=ntemp/div;
    		
    		else {
    			result[0]=ntemp%div;
    			result[1]=(ntemp-result[0])/div;
    			sum=(result[0]+result[1]);
    		}
    		div=1;
    		if(sum==i) {
    			temp=1;
    			System.out.print(i+ " ");
    		}
    		sum=0;
    	}
    if(temp==0) {
		System.out.println("INVALID RANGE");
    }
  }*/
boolean flag = false;//Denotes if a Kaprekar number has been found
        
        if(p == 1)//Handle the one case where a 1 digit square is a Kaprekar
        {
            System.out.print(1+" ");
            flag = true;
        }
        
        
        for(long i = p; i <= q; i++)
        {
            long squareLong = i * i;
            String squareStr = String.valueOf(squareLong);
            
            if(squareStr.length() > 1)
            {
                long left = Long.parseLong(squareStr.substring(0,(int)Math.ceil(squareStr.length()/2)));
                long right = Long.parseLong(squareStr.substring((int)Math.ceil(squareStr.length()/2), squareStr.length()));
                if(left+right == i)
                {
                    System.out.print(i+" ");
                    flag = true;
                }
            }
        }
        if(!flag)
        {
            System.out.println("INVALID RANGE");
        }
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = 1;
        int q = 99999;
        //System.out.println(25%100);
        kaprekarNumbers(p, q);

    }
}
