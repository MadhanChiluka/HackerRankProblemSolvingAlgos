import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class KangarooesJump {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
    	String atSamePoint="";
    	for(int i=1; i<=10000; i++) {
    		if(x1+(v1*i)==x2+(v2*i)) {
    			atSamePoint="YES";
    			break;
    		}
    		else if(x1>x2 && v1>v2){
                atSamePoint="NO";
            }
            else {
                atSamePoint= "NO";
            }
    	}
    	return atSamePoint;

    }

   

    public static void main(String[] args) throws IOException {
        

        int x1 = 5;

        int v1 = 5;
        
        int x2 = 0;

        int v2 = 3;
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);

       
    }
}
