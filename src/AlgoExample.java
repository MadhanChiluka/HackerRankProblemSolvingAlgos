import java.nio.charset.MalformedInputException;

public class AlgoExample {
	public void a(int n) {
		if(n>=1) {
			a(n-1);
			System.out.print(n);
			a(n-1);
		}
	}
	public static void main(String args[]) {
		AlgoExample algo = new AlgoExample();
		algo.a(3);
	}
}
