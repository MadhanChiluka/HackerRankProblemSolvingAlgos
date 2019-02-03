import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DayOfProgrammer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
    	if(year<1918 && year%4==0 ) {
    		return "12.09."+year;
    	}
    	if(year==1918) {
    		return "26.09."+year;
    	}
    	if(year%400==0) {
    		return "12.09."+year;
    	}
    	if(year>1918 && year%4==0 && year%100!=0) {
    		return "12.09."+year;
    	}
    	else {
    		return "13.09."+year;
    	}

    } 

    public static void main(String[] args) throws IOException {
       
        int year = 2016;

        String result = dayOfProgrammer(year);

        System.out.println(result);
    }
}
