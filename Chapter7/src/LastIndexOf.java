import java.util.*;
//@author Usman

public class LastIndexOf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] simpleArray = {74, 85, 102, 99, 101, 85, 56};
		int number = scan.nextInt();
		lastIndexOf(simpleArray, number);
	}
	public static void lastIndexOf (int[] array, int number){
		int index = -1;
		for (int i= array.length-1; i >= 0; i--) {
			if (array[i] == number) {
				index = i;
				System.out.println(index);
				break;
			}
		} 
	}
}


