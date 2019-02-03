import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CatsMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
    	String result="";
    	if(Math.abs(z-x)==Math.abs(z-y)) {
    		 result="Mouse C";
    	}
    	else if(Math.abs(z-x)>Math.abs(z-y)) {
    		result="Cat B";
    	}
    	else 
    		result="Cat A";
    	
    	return result;
    }

   

    public static void main(String[] args) throws IOException {
      
        int q = 2;

        for (int qItr = 0; qItr < q; qItr++) {
            int[] xyz = {1, 3, 2};
            int x = (xyz[0]);

            int y =(xyz[1]);

            int z = (xyz[2]);

            String result = catAndMouse(x, y, z);
            
            System.out.println(result);
           
        }

       
    }
}