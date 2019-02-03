import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ViralAdvertising {

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
    	int shared = 5;
    	int liked = 0;
    	int temp = 0;
    	int cummulative = 0;
    	for(int i=0; i<n; i++) {
    		liked = shared/2;
    		shared = liked*3;
    		cummulative = cummulative+liked;
    	}
    	return cummulative;
    	
    }
    public static void main(String[] args) throws IOException {
       
        int n = 3;

        int result = viralAdvertising(n);
        System.out.println(result);

    }
}
