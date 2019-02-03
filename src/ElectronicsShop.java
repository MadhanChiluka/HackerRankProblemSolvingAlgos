import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ElectronicsShop {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max=0;
        int add=0;
        for(int i=0; i<keyboards.length; i++) {
        	for(int j=0; j<drives.length; j++) {
        		add = keyboards[i]+drives[j];
        		if(add<=b && add>max)
            		max=add;
        		}
        	
        }
        if(max==0)
        	return -1;
        return max;
    }

  

    public static void main(String[] args) throws IOException {
       
        int b = 10;
        int n = 4;

        int m = 3;

        int[] keyboards = new int[n];

        int[] keyboardsItems = {3,1,2,4};

        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = (keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        int[] drives = new int[m];

        int[] drivesItems = {5, 2, 8};

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = (drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        }

        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */

        int moneySpent = getMoneySpent(keyboards, drives, b);
        System.out.println(moneySpent);
    }
}
