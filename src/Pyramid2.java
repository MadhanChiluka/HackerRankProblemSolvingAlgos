import java.util.Scanner;

public class Pyramid2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int numRows = scanner.nextInt();
	for(int i=1; i<=numRows; i++) {
		for(int j=i; j<numRows; j++) {
			System.out.print(" ");
		}
		for(int k=1; k<2*i; k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}
}
