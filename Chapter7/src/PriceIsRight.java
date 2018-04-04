import java.util.Scanner;
//@author Usman
//Program is misinterpreted from actual book problem but the point has been made clear. Congrats?
public class PriceIsRight {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] actualPrice = {200, 300, 250, 1, 950, 40};
		System.out.print("name a price: ");
		int bid = scan.nextInt();
		System.out.println(priceIsRight(actualPrice, bid));
		
	}
	public static int priceIsRight(int[] array, int input) {
		int constantDiff = 0;
		int realDiff = 300;
		int trueNum = -1;
		for (int n: array) {
			constantDiff = input - n;
			if (n < input && constantDiff < realDiff) {
				realDiff = constantDiff;
				trueNum = n;
			} 
		}
		return trueNum;
	}

}
