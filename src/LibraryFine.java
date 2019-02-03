import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LibraryFine {

    // Complete the libraryFine function below.
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    	int fine = 0;
    	if(y1>y2) {
    		fine = 10000;
    	}
    	else if(y1<y2) {
    		return 0;
    	}
    	else if(m1>m2) {
    		int mnthCount = m1-m2;
    			fine = 500*mnthCount;
    	}
    	else if(m1<m2) {
    		return 0;
    	}
    	else if(d1>d2) {
    		int daysCount = d1-d2;
    		fine = 15* daysCount;
    	}
    	return fine;


    }


    public static void main(String[] args) throws IOException {

        String[] d1M1Y1 = {"2", "7", "1014"};

        int d1 = Integer.parseInt(d1M1Y1[0]);

        int m1 = Integer.parseInt(d1M1Y1[1]);

        int y1 = Integer.parseInt(d1M1Y1[2]);

        String[] d2M2Y2 = {"1", "1", "1015"};

        int d2 = Integer.parseInt(d2M2Y2[0]);

        int m2 = Integer.parseInt(d2M2Y2[1]);

        int y2 = Integer.parseInt(d2M2Y2[2]);

        int result = libraryFine(d1, m1, y1, d2, m2, y2);

        System.out.println(result);
    }
}
