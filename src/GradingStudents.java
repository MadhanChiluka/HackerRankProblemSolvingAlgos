import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GradingStudents {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
    	int result[] = new int[grades.length];
        for(int i=0; i<grades.length; i++) {
        	if(grades[i]<38) {
        		result[i]=grades[i];
        		
        	}
        	else if((((grades[i])/5)+1)*5-grades[i]<3) {
        		 result[i]= (((grades[i])/5)+1)*5;
        		 
        	}
        	else if((((grades[i])/5)+1)*5-grades[i]>=3) {
        		result[i]=grades[i];
        		
        	}
        }
        return result;
    }

 

    public static void main(String[] args) throws IOException {
       
       int grades[] = {73,67,38,33};

        for (int gradesItr = 0; gradesItr < 4; gradesItr++) {
            int gradesItem = grades[gradesItr];
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            System.out.println(result[resultItr]);
            }
        }

       

        
    
}
