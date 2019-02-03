import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String time) {
    	int a[]= new int[5];
    	String items[];
    	
    	
    		for(int i=0; i<time.length(); i++) {
    			items=(time.split(":"));
    			 a[i] = Integer.parseInt(items[i]);
    			 if(time.endsWith("PM")) {
    				 a[0]=a[0]+12;
    				 System.out.println(a[i]);
    			 }
    			
    		}
    	
    	return time;
       
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        String time = "07:05:45PM";

        String result = timeConversion(time);

        System.out.println(result);
    }
}