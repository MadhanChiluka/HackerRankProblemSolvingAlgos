import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ACMICPC {

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {
    	int result[] = new int[2];
    	int count = 0;
    	int maxCount = 0;
    	int teamCount = 0;
    	int highest = 0;
    	for(int m=0; m<topic.length-1; m++) {
    		for(int i=m+1; i<topic.length; i++) {
    			String[] str1 = topic[m].split("");
    			String[] str2 = topic[i].split("");
    				for(int j=0; j<str1.length; j++) {
    					if(str1[j].equals("1") || str2[j].equals("1")) {
    					count++;
    					}
    				}
    				// System.out.print(count+" ");
    				if(maxCount<=count) {
    					maxCount=count;
    					}
    				count=0;
    			}
    	}
    	
    	for(int m=0; m<topic.length-1; m++) {
    		for(int i=m+1; i<topic.length; i++) {
    			String[] str1 = topic[m].split("");
    			String[] str2 = topic[i].split("");
    				for(int j=0; j<str1.length; j++) {
    					if(str1[j].equals("1") || str2[j].equals("1")) {
    					count++;
    					}
    				}
    				//System.out.print(count+" ");
    				if(maxCount==count) {
    					teamCount++;
    					}
    				count=0;
    			}
    	}
    		
    		result[0]=maxCount;
    		result[1]=teamCount;
    	return result;
    }

    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Madhan\\Downloads\\acminput.txt"));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
