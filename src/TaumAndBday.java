import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TaumAndBday {

    // Complete the taumBday function below.
    static long taumBday(long b, long w, long bc, long wc, long z) {
    	long result = 0;
    	if(wc<bc && z<bc && wc+z<=bc) {
    		result = wc*w+(wc+z)*b;
    	}
    	else if(bc<wc && z<wc && bc+z<=wc) {
    		result  = bc*b+(bc+z)*w;
    	}
    	else {
    		result = b*bc+w*wc;
    	}
    	return result;
    }


    public static void main(String[] args) throws IOException {

        int t = 1;

        for (int tItr = 0; tItr < t; tItr++) {

            long b = 27984;

            long w = 1402;
            
            long bc = 619246;
            
            long wc = 615589;
            
            long z = 247954;

            long result = taumBday(b, w, bc, wc, z);
            System.out.println(result);

        }
    }
}
