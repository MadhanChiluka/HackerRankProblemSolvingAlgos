import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BreakingRecords {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
    	int leastScore = scores[0];
    	int highScore = scores[0];
    	int highCount=0;
    	int leastCount=0;
    	int[] result = new int[2];
    	for(int  i=0; i<scores.length; i++) {
    		
    		if(scores[i]>highScore) {
    			highScore=scores[i];
    			highCount++;
    		
    		}
    		else if(scores[i]<leastScore) {
    			leastScore=scores[i];
    			leastCount++;
    		}
    	}
    	result[0]=highCount;
    	result[1]=leastCount;
    	return result;

    }

   

    public static void main(String[] args) throws IOException {
       

        int n = 10;
        int[] scores = new int[n];
        
        int[] scoreItems= {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        
        for (int i = 0; i < n; i++) {
            int scoresItem = scoreItems[i];
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
           System.out.print(result[i]+" ");

        }

       
    }
}
