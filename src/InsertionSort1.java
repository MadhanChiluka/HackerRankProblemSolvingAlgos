import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class InsertionSort1 {

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
        int temp=0;
        for(int i=arr.length-1; i>0; i--) {
            for(int j=i-1; j>=0; j--) {
                if(arr[i]<arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    for(int k=0; k<arr.length; k++) {
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                    arr[j]=temp;
                    
                }
            }
        }
        for(int k=0; k<arr.length; k++) {
			System.out.print(arr[k]+" ");
		}
    }
    


    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];

        String[] arrItems = {"2", "4", "6", "8", "3"};

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort1(n, arr);

    }
}
