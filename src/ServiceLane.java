import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ServiceLane {

    // Complete the serviceLane function below.
    static int[] serviceLane(int width[], int[][] cases) {
    	for(int i=0; i<width.length; i++) {
    		for(int j = 0; j<cases[0].length; j++) {
    			for(int k =0; k<cases[1].length; k++) {
    				System.out.println(cases[j][k]+" "+cases[k][j]+" j is"+j+" k is"+k);
    			}
    		}
    		
    	}
    	return width;
    }


    public static void main(String[] args) throws IOException {
        int[] nt = {8, 5};

        int n = (nt[0]);

        int t = (nt[1]);

        int[] width= {2, 3, 1, 2, 3, 2, 3, 3};

        int[][] cases = new int[t][2];

        for (int i = 0; i < 1; i++) {
            String[] casesRowItems = {"0", "3"};

            for (int j = 0; j < 2; j++) {
                int casesItem = Integer.parseInt(casesRowItems[j]);
                cases[i][j] = casesItem;
            }
        }

        int[] result = serviceLane(width, cases);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}