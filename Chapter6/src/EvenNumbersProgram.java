import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//@author Usman
//Output not exactly the same as described in book
public class EvenNumbersProgram {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scann = new Scanner(new File("evenNumbers.txt"));
		evenNumbers(scann);
	}
	public static void evenNumbers(Scanner console){
		int evenNumbers = 0;
		int numOfNumbers = 0;
		int sumOfNumbers = 0;
		while (console.hasNextInt() == true) {
			int storeNumber = console.nextInt();
			if (storeNumber%2 == 1){
				numOfNumbers++;
				sumOfNumbers += storeNumber;
			} if (storeNumber%2 == 0) {
				evenNumbers++;
				numOfNumbers++;
				sumOfNumbers += storeNumber;
			}
		}
		System.out.println(numOfNumbers + " numbers, sum = " + sumOfNumbers);
		System.out.println(evenNumbers + " evens (" + ((double)evenNumbers/numOfNumbers * 100) + "%)");
	}

}
