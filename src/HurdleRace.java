import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HurdleRace {

    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
    	int hght=0;
    	int maxHeight=0;
    	int doseReq = 0;
    	for(int i=0; i<height.length; i++) {
    		hght=height[i];
    		if(maxHeight<hght) {
    			maxHeight=hght;
    		}
    	}
    	
    	doseReq = maxHeight-k;
    	if(maxHeight<k)
    		return 0;
    	return doseReq;
    }

   
    public static void main(String[] args) throws IOException {
       

        int[] nk = {5, 4};
        int n = (nk[0]);

        int k = (nk[1]);

        int[] height = new int[n];

        int[] heightItems = {1, 6, 3, 5, 2};

        for (int i = 0; i < n; i++) {
            int heightItem = (heightItems[i]);
            height[i] = heightItem;
        }

        int result = hurdleRace(k, height);
        
        System.out.println(result);

    }
}
