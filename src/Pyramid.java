
public class Pyramid {
public static void main(String args[]) {
	
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	int noOfRows = scanner.nextInt();
	for(int i=0; i<noOfRows; i++) {
		for(int j=0; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}
}
