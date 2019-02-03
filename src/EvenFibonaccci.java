import java.util.Scanner;

public class EvenFibonaccci {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < 2; a0++){
            long n = in.nextLong();
            
            long first = 1;
            long second = 2;
            int counter = 0;
            long sum = 0;
            long evenSum = 2;
            while(counter < 10) {
                sum = first + second;
                
                if(sum>0 && sum%2==0) {
                    evenSum = evenSum+sum;
                }
                first = second;
                second = sum;
                sum = 0;
                counter++;
                
            }
            System.out.println(evenSum);
        }
    }
}
