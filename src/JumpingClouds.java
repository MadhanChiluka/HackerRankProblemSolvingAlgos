import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
    	int jumpCount =0;
    	int tempRes = 0;
    	int energyCount = 100;
    	for(int i=0; i<c.length; i=i+k) {
    		if(c[i]==1) {
    			energyCount = energyCount-1-2;
    		}
    		else energyCount = energyCount-1;
    	}
    	return energyCount;

    }

    
    public static void main(String[] args) throws IOException {
        
        String[] nk = {"10", "3"};
        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        int[] cItems = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};

        for (int i = 0; i < n; i++) {
            int cItem = (cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c, k);

        System.out.println(result);
    }
}
