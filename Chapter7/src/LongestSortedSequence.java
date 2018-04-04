import java.util.Arrays;

//@author Usman
public class LongestSortedSequence {
	public static void main(String[] args) {
		Integer[] antidote = {3,8,10,1,9,14,-3,0,14,207,56,98,12};
		System.out.println(longestSortedSequence(antidote, antidote));
		
	}
	public static int longestSortedSequence(Integer[] firstArray, Integer[] secondArray) {
		 Arrays.sort(secondArray);
		 int biggestShiftedElement = -0;
		 double realDiff = 0;
		 double constantDiff;
		 for (int n: firstArray) {
			 int num1 = Arrays.asList(firstArray).indexOf(n);
			 System.out.println(num1);
			 int num2 = Arrays.asList(secondArray).indexOf(n);
			 System.out.println(num2);
			 constantDiff = Math.abs(num1 - num2);
			 if (num1 == 0){
				 realDiff = constantDiff;
				 biggestShiftedElement = n;
			 }
			 if (constantDiff > realDiff) {
				 realDiff = constantDiff;
				 biggestShiftedElement = n;
			 }
		 }
		 return biggestShiftedElement;
	 }
		
}


