import java.util.Arrays;
//@author Usman
//FINALLY FUCKING YES. It works. Congrats!
public class Mode {
	public static void main(String[] args) {
		int[] array = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,4,5,6,6,6,7,7,7,7,7,7,7,7,7,7,8,8,8,9};
		System.out.println(mode(array));
		
	}
	public static int mode(int[] array) {
		Arrays.sort(array);
		int first = array[0];
		int count = 0;
		int num = 0;
		int maxCountYet = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i+1]) {
				//System.out.println("array " + array[i]);
				//System.out.println("Count " + count);
				//System.out.println("num " + num);
				//System.out.println("max " + maxCountYet);
				//System.out.println();
				if (count > maxCountYet){
					maxCountYet = count;
					num = array[i];
				}
				count++;
			} else if (array[i] != array[i+1]) {
				count = 0;
				//System.out.println("array " + array[i]);
				//System.out.println("Count " + count);
				//System.out.println("num " + num);
				//System.out.println("max " + maxCountYet);
				//System.out.println();
			}
		}
		return num;
	}

}
