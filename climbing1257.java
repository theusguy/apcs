import java.util.*;

public class climbing1257 {
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
			if (steps >= 1) {
				if (counter == 1) {
					waysToClimb(steps-1, text + 1, counter);
				} else {
					waysToClimb(steps-1, text + ", " + 1, counter);
				}
			}
			if (steps >= 2) {
				if (counter == 1) {
					waysToClimb(steps-2, text + 2, counter);
				} else {
					waysToClimb(steps-2, text + ", " + 2, counter);
				}
			}
			if (steps >= 5) {
				if (counter == 1) {
					waysToClimb(steps-5, text + 5, counter);
				} else {
					waysToClimb(steps-5, text + ", " + 5, counter);
				}
			}
			if (steps >= 7) {
				if (counter == 1) {
					waysToClimb(steps-7, text + 7, counter);
				} else {
					waysToClimb(steps-7, text + ", " + 7, counter);
				}
			}
		}
	}
}