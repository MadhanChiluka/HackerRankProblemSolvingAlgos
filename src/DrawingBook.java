import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DrawingBook {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
    	 int result1 = 0;
         int result2 = 0;
         float minTurn=0;
         int finalRes=0;
         int result=0;
         if(p==1 || p==n) {
             return  0;
         }
         if(n%2!=0 && p==n-1) {
             return 0;
         }
         
         for(int i=0;i<p;i++) {
             result1++;
         }
         for(int i=n;i>p;i--) {
             result2++;
         }
         if(result1>result2)
             minTurn=result2;
         else
             minTurn=result1;
         
         if(p%2==0) {
             finalRes= (int)minTurn/2;
         }
         else if(p%2!=0) {
             
             finalRes= (int)(minTurn-1)/2;
         }
         
             return finalRes;
   }

   

    public static void main(String[] args) throws IOException {
        
        int n = 7;//86619;
        int p = 3;//28906;
        int result = pageCount(n, p);

        System.out.println(result);//14453
    }
}
