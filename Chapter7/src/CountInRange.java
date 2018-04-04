import java.util.*;

public class CountInRange {
	public static void main(String[] args) {
		int[] simpleArray = {14, 1, 22, 17, 36, 7, -43, 5};
		int result = countInRange(simpleArray, 4, 17);
		System.out.println(result);
	}
	public static int countInRange(int[] array, int min, int max) {
		int count = 0;
		for (int n: array) {
			if (n>=min && n<=max){
				count++;
			}
		}
		return count;
	}

}
