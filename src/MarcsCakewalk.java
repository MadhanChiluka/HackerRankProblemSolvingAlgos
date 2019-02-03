import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MarcsCakewalk {

	// Complete the marcsCakewalk function below.
	static long marcsCakewalk(int[] calorie) {
		long powRes = 1;
		long result = 0;
		Arrays.sort(calorie);
		for(int i=0; i<calorie.length; i++) {
			for(int j=calorie.length-1; j>i; j--) {
				powRes = powRes * 2;
			}
			result+= powRes*calorie[i];
			powRes = 1;
		}
		return result;
	}

	public static void main(String[] args) throws IOException {

		int n = 4;

		int[] calorie = { 7, 4, 9, 6 };

		

		long result = marcsCakewalk(calorie);

		System.out.println(result);
	}
}
