import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrongPassword {
	

    /*
    
    It's length is at least 6.
    It contains at least one digit.
    It contains at least one lowercase English character.
    It contains at least one uppercase English character.
    It contains at least one special character. The special characters are: !@#$%^&*()-+
    
    */


    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
    	int count=0;
    	int resCount = 0;
    	if(password.length()>=6) {
    		if(password.matches("[a-zA-z0-9!@#$%^&*()-+]+")) {
    		System.out.println("Matched");
    		count=0;
    		}
    		else if(password.matches("[a-z]+")) {
        		count=1;
        	}
        	else if(password.matches("[A-Z]+")) {
        		count=1;
        	}
        	else if(password.matches("[0-9]+")) {
        		count=1;
        	}
        	else if(password.matches("[!@#$%^&*()-+]+")) {
        		count=1;
        	}
        	else if(password.matches("[a-zA-Z]+")) {
        		count=2;
        	}
        	else if(password.matches("[a-zA-Z0-9]+")){
        		count=3;
        	}
        	else if(password.matches("[a-zA-Z0-9!@#$%^&*()-+]+")){
        		count=4;
        	}
    	}
    	else if(password.matches("[a-z]+")) {
    		count=1;
    	}
    	else if(password.matches("[A-Z]+")) {
    		count=1;
    	}
    	else if(password.matches("[0-9]+")) {
    		count=1;
    	}
    	else if(password.matches("[!@#$%^&*()-+]+")) {
    		count=1;
    	}
    	else if(password.matches("[a-zA-Z]+")) {
    		count=2;
    	}
    	else if(password.matches("[a-zA-Z0-9]+")){
    		count=3;
    	}
    	else if(password.matches("[a-zA-Z0-9!@#$%^&*()-+]+")){
    		count=4;
    	}
    	
    	System.out.println("count "+count);
    	resCount = 6-count;
    	
    	return resCount;
    }


    public static void main(String[] args) throws IOException {

        int n = 3;

        String password = "ABCDef";

        int answer = minimumNumber(n, password);

        System.out.println(answer);
    }
}
