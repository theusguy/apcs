import java.util.*;

public class climbing {
	public static void main (String[] arg) {
		int counter = 0;
		System.out.println("Please input the number of steps.");
		Scanner input = new Scanner (System.in);
		waysToClimb(input.nextInt(), "", counter);
	}
	
	public static void waysToClimb(int steps, String text, int counter) {
		counter++;
		if (steps == 0) {
			System.out.println("[" + text + "]");
		} else {
			for (int i = 1; i <= steps; i++) {
				if (counter == 1) {
					waysToClimb(steps-i, text + i, counter);
				} else {
					waysToClimb(steps-i, text + ", " + i, counter);
				}
			}
		}
	}
}