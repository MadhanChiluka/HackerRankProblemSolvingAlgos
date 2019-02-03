import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumDistances {

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
    	int minDist=a.length+1;
    	int dist = 0;
    	boolean flag = false;
    	for(int i=0; i<a.length-1; i++) {
    		for(int j=i+1; j<a.length; j++) {
    			if(a[i]==a[j]) {
    				dist = j-i;
    				flag = true;
    			}
    		}if(dist<minDist) {
    			minDist = dist;
    		}
    	}
    	if(!flag)
    		return -1;
    	return minDist;
    	
    	/*HashMap<Integer,Integer> distances = new HashMap<>();
        
        int minDistance = -1;
      
        for(int i = 0; i < a.length; i++)
        {
            if(distances.containsKey(a[i]))
            {
                //Calculate distance between like numbers
                int distance = Math.abs(distances.get(a[i]) - i);
                
                if( distance < minDistance || minDistance == -1)
                {
                    minDistance = distance;
                }
                
                //Set start point to the old end point
                distances.put(a[i], i);
            }
            else
            {
                //Add a new starting point
                distances.put(a[i], i);
            }
        }
        return minDistance;*/
    }
    public static void main(String[] args) throws IOException {

    	int n = 1000;

        int[] a = {92020, 81760, 74143, 79550, 78365, 22559, 31539, 75299, 73160, 16955, 83706, 88462, 89329, 61786, 82989, 75867, 18047, 70648, 27171, 3369,12625, 22975, 42538, 96532, 55973, 25025, 18515, 66395, 7724};
        int result = minimumDistances(a);
        
        System.out.println(result);

        
    }
}