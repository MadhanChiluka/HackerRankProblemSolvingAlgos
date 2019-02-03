import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BonAppetit {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
    	int totBill=0;
    	for(int i=0; i<bill.size(); i++) {
    		totBill+=bill.get(i);
    		}
    	totBill-=bill.get(k);
    	if(totBill/2==b) {
    		System.out.println("Bon Appetit");
    	}
    	else {
    		System.out.println(b-(totBill/2));
    	}
    }

    public static void main(String[] args) throws IOException {
        String[] nk = {"10", "6"};
        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] billItems = {"72", "53", "60", "66", "90", "62", "12", "31", "36", "94"};

        List<Integer> bill = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int billItem = Integer.parseInt(billItems[i]);
            bill.add(billItem);
        }

        int b =288;

        bonAppetit(bill, k, b);

    }
}
