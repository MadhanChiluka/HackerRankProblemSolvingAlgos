import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MigratoryBirds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
    	Object[] arr1 = arr.toArray();
    	int arrItem;
    	int count=0;
    	int maxRepeatNum=0;
    	int arr2[] = new int[arr1.length];
    	
    	for(int i=0; i<arr1.length; i++) {
    		arrItem = (int)arr1[i];
    		arr2[i] = arrItem;
    	}
    	
    	for(int i=0; i<arr2.length; i++) {
    		for(int j=i+1; j<arr2.length; j++) {
    			if(arr2[i]==arr2[j]) {
    				count++;
    				System.out.println(arr2[i]+" "+arr2[j]);
    			}
    			maxRepeatNum=count;
    		}count=0;
    	}
    	return count;
    }

    public static void main(String[] args) throws IOException {
        int arrCount = 11;

        int[] arrItems = {1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = arrItems[i];
            arr.add(arrItem);
        }

        int result = migratoryBirds(arr);
        System.out.println(result);
    }
}
