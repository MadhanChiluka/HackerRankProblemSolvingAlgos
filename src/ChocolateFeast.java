import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ChocolateFeast {

    // Complete the chocolateFeast function below.
    static int chocolateFeast(int n, int c, int m) {
    	int chocos = n/c;
    	int wrappers = chocos;
    	int remain = 0;
    	int extraWrap = 0;
    	int reWrap = 0;
    	int totalWrap = 0;
    	if(wrappers/m>0) {
    		remain=wrappers/m;
    		chocos = chocos +remain;
    	}
    	if(wrappers%m>0) {
    		extraWrap = wrappers%m;
    	}
    	totalWrap = extraWrap + remain;
    	if(totalWrap>=m) {
    		chocos = chocos +totalWrap/m;
    	}
return chocos;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        

    	int t = 1;

        for (int tItr = 0; tItr < t; tItr++) {
            int[] ncm = {14440, 3, 275};

            int n = (ncm[0]);

            int c = (ncm[1]);

            int m = (ncm[2]);

            int result = chocolateFeast(n, c, m);
            	System.out.print(+result+" ");
//4830
        }
        scanner.close();
    }
}