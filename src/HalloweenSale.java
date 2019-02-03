import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HalloweenSale {

    // Complete the howManyGames function below.
    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
    	int gamesCount = 1;
    	int costOfFirst=p;
    	int subCost = p-d;
    	int totalCost = p;
   while(totalCost<=s) {
   if(subCost>=m) {
    		totalCost = totalCost+subCost;	
    		gamesCount++;
    		//System.out.print(gamesCount+" ");
    		subCost = subCost-d;
    		//System.out.println("Total Cost -"+totalCost);
    	}
   			
   else if(totalCost<=s) {
	   totalCost = totalCost+m;
	   if(totalCost<=s) {
    		gamesCount++;
    		//System.out.print(gamesCount+" ");
    		//System.out.println("Total Cost -"+totalCost);
	   }
    }
   }
    	return gamesCount;
    	

    }

    
    public static void main(String[] args) throws IOException {
       

        String[] pdms = {"16", "2", "1", "9981"};

        int p = Integer.parseInt(pdms[0]);

        int d = Integer.parseInt(pdms[1]);

        int m = Integer.parseInt(pdms[2]);

        int s = Integer.parseInt(pdms[3]);

        int answer = howManyGames(p, d, m, s);
        
       System.out.println(answer);//9917

    }
}
