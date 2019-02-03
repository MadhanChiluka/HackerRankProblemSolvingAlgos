import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class GameOfThrones {

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
    	/*int count=0;
    	String[] str = s.split("");
    	ArrayList list =  new ArrayList();
    	for(int i=0; i<str.length; i++) {
    		for(int j=i; j<str.length; j++) {
    			if(str[i].equals(str[j])) {
    				count++;
    			}
    		}list.add(count);
    		count=0;
    	}
    	for(int i=0; i<list.size(); i++) {
    		System.out.print(list.get(i)+" ");
    	}
    	return null;*/
    	/*ArrayList list =  new ArrayList();
    	int count = 0;
    	int[] res=new int[10];
    	s=s.toLowerCase();
    	for(char ch='a'; ch<='z'; ch++) {
    		count = 0;
    		
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    count++;
                    
                	}
            	}
            
            list.add(count);
    	}
    	for (int j = 0; j < list.size(); j++) {
			System.out.print(list.get(j)+" ");
		}return null;*/
    	
    	
    	for(int i=1;i<s.length();i++)
        { 
          if(s.charAt(i)==s.charAt(i-1))
          { 
             // s.delete(i-1, i+1);
               i=0;
          }
        }
      return s.length()==0?"Empty String":s;
    }

    public static void main(String[] args) throws IOException {

        String s = "cdcdcdcdeeeef";
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}
