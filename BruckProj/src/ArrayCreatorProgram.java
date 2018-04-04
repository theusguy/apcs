import java.util.*;
import java.io.*;

public class ArrayCreatorProgram {
	public static void main(String[] args) {
		Scanner arraySizee = new Scanner(System.in);
		System.out.println("Enter the amount of numbers being entered");
		int arraySize = arraySizee.nextInt();
		Scanner arrayFiller = new Scanner(System.in);
		int[] arrayFinal = new int[arraySize];
		
		System.out.println("Enter the actual numbers to be in the array");
		String arrayNumbers =  arrayFiller.nextLine();
		String[] numbers1 = arrayNumbers.split(" ");
		//code extra
		int[] resultsNumber = new int[numbers1.length];

		for (int i = 0; i < numbers1.length; i++) {
		    try {
		        resultsNumber[i] = Integer.parseInt(numbers1[i]);
		    } catch (NumberFormatException nfe) {};
		}
		//code extra
		System.out.println("Enter the index order");
		Scanner arrayIndex = new Scanner(System.in);
		String arrayIndexx = arrayIndex.nextLine();
		String[] numbers2 = arrayNumbers.split(" ");
		//code extra
		int[] resultsIndex = new int[numbers2.length];

		for (int i = 0; i < numbers2.length; i++) {
		    try {
		        resultsIndex[i] = Integer.parseInt(numbers2[i]);
		    } catch (NumberFormatException nfe) {};
		}
		//code extra
		System.out.println(numbers2.length);
		 for (int i = 0; i < arraySize - 1; i++) {
			arrayFinal[i] = resultsNumber[resultsIndex[i]];
			 System.out.print(resultsIndex[i] + " ");
			 //System.out.println(resultsNumber[i]);
		} 
		 
		
		
	
	}
}
