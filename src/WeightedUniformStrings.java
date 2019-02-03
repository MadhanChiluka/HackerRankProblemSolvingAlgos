import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class WeightedUniformStrings {

    // Complete the weightedUniformStrings function below.
    static String[] weightedUniformStrings(String s, int[] queries) {
    //	String[] str = s.split("");
    	char[] ch = s.toCharArray();
    	//System.out.print("ch length " +ch.length);
    	boolean matchFound = false;
    	int resItem = 0;
    	int res= 1;
    	//int j=0;
    	int mediator[] = new int[s.length()];
    	String result[] =  new String[queries.length];
    	
    	for(int i=0; i<s.length(); i++) {
    		mediator[i] = (int)ch[i]-96;
    		//System.out.print(mediator[i]+" ");
    	}
    	
    	for(int i=0; i<mediator.length-1; i++) {
    		if(mediator[i]==mediator[i+1] && mediator[i+1]==mediator[i+2]) {
    			mediator[i+1]+=mediator[i];
    			mediator[i+2]+=mediator[i+1];
    			
    		}
    		System.out.print(mediator[i]+" ");
    		for(int j=0; j<queries.length; j++) {
    			
    		}
    	}
    	
    	System.out.println();
    	return result;
    	/*for(int i=0; i<s1.length; i++) {
    		
    		for(j=0; j<queries.length; j++) {
    			if((int)s1[i]-96==queries[j]) {
    				result[i]="Yes";
    				break;
    			}
    			else if((int)s1[i-1]-96==(int)s1[i]-96) {
    				res = (int)s1[i]-96 * (int)s1[i]-96;
    				if(res==queries[i]) {
    					result[i]="Yes";
    					break;
    				}
    			
    				for(int k=j; k<queries.length; k++) {
    				if(s1[j]==s1[k]) {
    					count++; 
    				}
    			}
    			for(int m=0; m<count; m++) {
    				res = res*(int)s1[m];
    				if(res==queries[i]) {
    					result[i]="Yes";
    					break;
    				}
    			}
    			
    				
    			}
    			else {
    				result[i]="No";
    			}
    			j=j+j;
    			
    		}
    		
    	}
    	return result;*/

    }


    public static void main(String[] args) throws IOException {
        String s = "abccddde";

        int queriesCount = 6;
        int[] queries = {1, 3, 12, 5, 9, 10};

        String[] result = weightedUniformStrings(s, queries);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
            }
        }
    }

