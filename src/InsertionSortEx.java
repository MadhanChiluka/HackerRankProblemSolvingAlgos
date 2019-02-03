import java.io.*;
import java.util.*;

public class InsertionSortEx {

    public static void insertionSort(int[] A){
        /*for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while(j > 0 && A[j] > value){
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }*/

        int temp=0;
        
        for(int i=0; i<A.length-1; i++) {
        	for(int j=i+1; j<A.length; j++) {
        		if(A[i]>A[j]) {
        			temp = A[i];
        			A[i]=A[j];
        			A[j]= temp;
        			
        		}
        		
        	}
        }
        printArray(A);
        
    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        int[] ar = {7, 4, 3, 5, 6, 2};
        insertionSort(ar);
    }
}