import java.util.*;
import java.io.*;
public class NegativeSumProgram {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner consolee = new Scanner(new File("negativeSum.txt"));
		negativeSum(consolee);
	}
	public static void negativeSum(Scanner consolee) {
		int sum = 0;
		int numberCount = 0;
		while (consolee.hasNextInt() == true) {
			numberCount++;
			sum += consolee.nextInt();
			if (sum < 0) {
				System.out.println("Sum of " + sum + " after " + numberCount + " steps");
			}
		}
		System.out.println("no negative sum");
	}
}
