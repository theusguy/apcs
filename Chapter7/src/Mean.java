import java.util.Arrays;
//@author Usman
//
public class Mean {
	public static void main(String[] args){
		int[] sampleArray = {5,2,4,17,55,4,3,26,18,2,17};
		mean(sampleArray);
	}
	public static void mean(int[] array) {
		int medianNum;
		Arrays.sort(array);
		double middle = array.length / 2;
		if (middle % 1 != 0){
			int firstNum = (int)(middle - 0.5);
			int secondNum = (int)(middle + 0.5);
			medianNum = (array[firstNum] + array[secondNum]) / 2;
		} else {
			medianNum = array[(int)middle];
		}
		System.out.println(medianNum);
	}

}
