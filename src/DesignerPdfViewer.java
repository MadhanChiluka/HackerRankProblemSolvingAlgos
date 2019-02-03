import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DesignerPdfViewer {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
    	char ch = 97;
    	int hght=0;
    	int maxHeight=0;
    	int rectArea = 0;
    	word.toLowerCase();
    	
    	Map<Character,Integer> map=new HashMap<Character,Integer>();  

    	for (int i=0; i<h.length; i++) {
    		map.put(ch, h[i]);	
    		ch++;
    	}  
    	 
    	 for(int i=0; i<word.length(); i++) {
    		char ch1= word.charAt(i);
    		hght = map.get(ch1);
    		if(hght>maxHeight) {
    			maxHeight = hght;
    		}
    	 }
    	 
    	 rectArea= maxHeight*word.length();
    	 

    	return rectArea;
    }

   
    public static void main(String[] args) throws IOException {
        

        int[] hItems = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};


        String word = "abc";
        int result = designerPdfViewer(hItems, word);
        System.out.println(result);
    }
}
