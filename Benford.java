import java.io.*;
import java.util.*;


public class apcsprojectpiazza {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		System.out.println("Let's count those leading digits...");
		System.out.print("input file name? ");
     
		String consoleinput = console.nextLine();
		Scanner console = new Scanner(new File(consoleinput));
		int[] arrayofint = intArrayCounter(console);
		resultOutputter(arrayofint);
	}


 
	public static int[] intArrayCounter(Scanner console) {
		int[] array1 = new int[10];
		while (console.hasNextInt()) {
			int popop = console.nextInt();
			array1[lastMethod(popop)]++;
		}
		return array1;
	}

	public static void resultOutputter(int[] random) {
		System.out.println();
		if (random[0] > 0) {
			System.out.println("excluding " + random[0] + " zeros");
		}
		int timemeasure = measurement(random) - random[0]
		System.out.println("Digit Count Percent");
			for (int i = 1; i < random.length; i++) {
				double resultdouble = random[i] * 100.0 / timemeasure;
         System.out.printf("%5d %5d %6.2f\n", i, random[i], resultdouble);
     }
     System.out.printf("Total %5d %6.2f\n", timemeasure, 100.0);
 }

	public static int measurement(int[] data)  {
		int measurement = 0;
		for (int j : data) {
         measurement += j;
		}
		return measurement;
	}

	public static int lastMethod(int n) {
		int intn = Math.abs(n);
		while (intn >= 10) {
			intn = intn / 10;
		}
		return intn;
	}
}