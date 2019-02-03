import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BiggerIsGreater {

	// Complete the biggerIsGreater function below.
	static String biggerIsGreater(String w) {
		String[] letters = w.split("");
		String str = "";
		String temp = "";
		int tempPoint = 0;
		boolean isChanged = false;
		boolean change = false;

		for (int i = w.length() - 1; i > 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				String s1 = letters[i];
				String s2 = letters[j];
				if (letters[i].compareTo(letters[j]) == 0) {
					str = "no answer";
				} else if (letters[i].compareTo(letters[j]) > 0) {
					temp = letters[i];
					letters[i] = letters[j];
					letters[j] = temp;
					tempPoint = j;
					isChanged = true;
				} else if (letters[i].compareTo(letters[j]) < 0) {
					continue;
				}if (isChanged == true) {
					break;
				}
			}
				if (isChanged == true) {
				break;
			}
		}

		if (isChanged == true) {
			for (int i = tempPoint + 1; i < w.length() - 1; i++) {
				for (int j = i + 1; j < w.length(); j++) {
					String s1 = letters[i];
					String s2 = letters[j];
					if (letters[i].compareTo(letters[j]) > 0) {
						temp = letters[i];
						letters[i] = letters[j];
						letters[j] = temp;
						change = true;
						isChanged = true;

					} else if (letters[i].compareTo(letters[j]) < 0) {
						continue;
					}
					if (change == true && i != tempPoint + 1) {
						i = i - 1;
					}
				}
			}

		}
		for (int i = 0; i < letters.length; i++) {
			if (str == "no answer" || isChanged==false) {
				return str = "no answer";
			}
			str = str + letters[i];
		}
		return str;

	}

	public static void main(String[] args) throws IOException {

		int T = 100000;

		for (int TItr = 0; TItr < T; TItr++) {
			String w = "zedawdvyyfumwpupuinbdbfndyehircmylb";

			String result = biggerIsGreater(w);

			System.out.println(result);
		}

	}
}
