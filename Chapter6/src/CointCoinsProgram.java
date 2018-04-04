import java.util.*;
import java.io.*;
//@author Usman
//programs works almost perfectly except for some possible "rounding-off" error
public class CointCoinsProgram {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("countCoins.txt"));
		countCoins(scan);
	}
	public static void countCoins (Scanner scan) {
		double multiplier = 0;
		double sum = 0;
		while (scan.hasNextInt() == true) {
			int coinNumber = scan.nextInt();
			if (scan.hasNext() == true) {
				String coinType = scan.next();
				if (coinType.equalsIgnoreCase("pennies")) {
					multiplier = 0.01;
					sum += (multiplier*coinNumber);
				} else if (coinType.equalsIgnoreCase("nickels")) {
					multiplier = 0.05;
					sum += (multiplier*coinNumber);
				} else if (coinType.equalsIgnoreCase("dimes")) {
					multiplier = 0.1;
					sum += (multiplier*coinNumber);
				} else if (coinType.equalsIgnoreCase("quarters")) {
					multiplier = 0.25;
					sum += (multiplier*coinNumber);
				}
			}
		}
		System.out.println("Total money: $" + sum);
	}
}
