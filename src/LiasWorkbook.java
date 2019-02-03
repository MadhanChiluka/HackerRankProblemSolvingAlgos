import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LiasWorkbook {

    // Complete the workbook function below.
    static int workbook(int n, int k, int[] arr) {
    	int pageNum = 1;
    	int problems = 0;
    	int pageInc = 0;
    	int especialProblem = 0;
    	int matchFound = 0 ;
    	int pageStrt = 0;
    	for(int i = 0; i<arr.length; i++) {
    		problems = arr[i];
    		System.out.println("array "+i+" " +arr[i]);
    		//System.out.println("problems "+problems);
    		pageStrt = pageNum;
    		//System.out.println("pageNum "+pageNum);
    		//System.out.println("Problems/k - " +problems/k+" k - "+k);
    		if(problems/k>0) {
    			//System.out.println("problems "+problems);
    			
    		
    		for(int j=pageStrt; j<=pageNum; j++) {
    			System.out.println("pageNum "+pageStrt);
    				for(int m=1; m<=k; m++) {
    				if(m==j) {
    					especialProblem++;
    					matchFound= 1;
    					//System.out.println("PAgeStart "+pageStrt);
    					System.out.println("pageNum - "+j+" problem No - "+m);
    				}
    				if(m<pageNum) {
    					m=m+k;
    					k=k+k;
    				}
    				}
    				
    			
    		}k=5;
    		if(matchFound==1) {
				pageNum++;
				matchFound=0;
			}
    		}
    		pageStrt = pageNum;
    		if(problems%k>0) {
    			int remain = problems%k;
    			for(int j=pageStrt;j<=pageNum; j++) {
    				for(int m=1; m<=remain; m++) {
    					if(m==j) {
    						matchFound = 1;
    						especialProblem++;
    						//System.out.println("pageNum - "+pageNum+" problem no - "+m);
    					}
    				}
    			}
    			if(matchFound==1) {
    				pageNum++;
    				matchFound=0;
    			}
    		}
    		
    		}	
    return especialProblem;
    }

    public static void main(String[] args) throws IOException {

        int[] nk = {10, 5};
        int n = (nk[0]);

        int k = (nk[1]);

        int[] arr = {3, 8, 15, 11, 14, 1, 9, 2, 24, 31};
        
        int result = workbook(n, k, arr);

        System.out.println(result);
    }
}