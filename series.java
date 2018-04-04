import java.util.Scanner;
public class series{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.print("Please input the limit: ");
		double userInput = sc.nextDouble();
		double tryNum = 1;
		double i;
		for (i = 1; tryNum <= userInput; i ++) {
			tryNum += (1 / (i + 1));
		}
		System.out.print("Actual sum = ");
		System.out.printf("%.5f", tryNum);
		System.out.println("\nNumber of terms required: " + (int)(i));
	}
}