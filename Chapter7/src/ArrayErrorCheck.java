import java.util.*;
public class ArrayErrorCheck {
	public static void main(String[] args) {
		int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int[] makeitbigger = Arrays.copyOf(test, 12);
		System.out.println(Arrays.toString(makeitbigger));
		
		boolean arrayTester = Arrays.equals(test, makeitbigger);
		System.out.println(arrayTester);
		int sum = 0;
		for (int n: test) {
			sum += n;
		}
		System.out.println(sum);
		
		int[] young1 = {1,2,3};
		int[] young2 = young1;
		
		Arrays.fill(young1, 3);
		
		System.out.println(Arrays.toString(young1));
		
		System.out.println(Arrays.toString(young2));
		
		
		
		
	}

}
