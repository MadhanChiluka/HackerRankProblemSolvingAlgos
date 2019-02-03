import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SortingIntroTutorial {

    // Complete the introTutorial function below.
    static int introTutorial(int V, int[] arr) {
    	int result = 0;
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i]==V) {
    			result=i;
    		}
    	}
    	return result;
    }


    public static void main(String[] args) throws IOException {

        int V = 4;

        int n = 6;

        int[] arr = new int[n];

        String[] arrItems = {"1", "4", "5", "7", "9", "12"};

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = introTutorial(V, arr);
        System.out.println(result);
    }
}
