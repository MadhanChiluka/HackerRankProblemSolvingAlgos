import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class GridChallenge {

    // Complete the gridChallenge function below.
    static String gridChallenge(String[] grid) {
    	int count = 0;
    	String result = "";
    	for(int i = 0; i<grid.length; i++) {
    		char[] ch = grid[i].toCharArray();
    		for(int j=0; j<ch.length-1; j++) {
    			for(int k=j+1; k<ch.length; k++) {
    				if((int)ch[j]>(int)ch[k]) {
    					char temp = ch[j];
    					ch[j]=ch[k];
    					ch[k]=temp;
    				}
    			}	
    		}
    		grid[i]=""; 
    		for(int k=0; k<ch.length; k++) {
    			grid[i]+=ch[k];
    		}
    		for(int j=0; j<ch.length; j++) {
    				if((int)ch[i]>(int)ch[j]) {
    					count++;
    					char temp = ch[j];
    					ch[j]=ch[i];
    					ch[i]=temp;
    				}
    				System.out.println(grid[j]);
    			}
    		
    		}
    	if(count==0) {
    		result = "Yes";
    	}
    	else
    		result = "No";
    	
    	return result;

    }


    public static void main(String[] args) throws IOException {

        int t = 1;
        
        for (int tItr = 0; tItr < t; tItr++) {
            int n = 5;

            String[] grid = {"ebacd", "fghij", "olmkn", "trpqs", "xywuv"};

            String result = gridChallenge(grid);

            System.out.println(result);
        }
    }
       
}
