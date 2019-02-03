import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class T_Shaped {

    // Complete the solve function below.
    static String solve(List<List<Integer>> grid) {
    	int count1 = 0;
    	int count2 = 0;
    	String result = "";
    	for(int i=0; i<grid.size()-1; i++) {
    		for(int j=i; j<grid.size(); j++){
    			System.out.print("Grid["+i+","+j+"] "+grid.get(i)+" "+grid.get(j));
    			System.out.println();
    			System.out.print("Grid_index["+i+","+j+"] "+grid.indexOf(grid.get(i))+" "+grid.indexOf(grid.get(j)));
    			System.out.println();
    			if(grid.get(i)==grid.get(j)) {
        			count1++;
        		}
    			if(grid.indexOf(i)==grid.indexOf(j)) {
    				count2++;
    			}
    			if(count1==3 && count2==3) {
    				result = "Yes";
    			}
    			else 
    				result = "No";
    			count1 = 0;
    			count2 = 0;
    		}
    		
    	}
    	return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            List<List<Integer>> points = new ArrayList<>();

                IntStream.range(0, 5).forEach(i -> {
                    try {
                        points.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                String result = solve(points);

                System.out.println(result);
        });

        bufferedReader.close();
        
    }
}
