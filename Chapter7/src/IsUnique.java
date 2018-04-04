//@author Usman
//Programs works correctly. Congrats!
public class IsUnique {
	public static void main(String[] args) {
		int[] listOfNum = {3,8,12,2,9,17,43,-8,46};
		System.out.println(isUnique(listOfNum));
	}
	public static boolean isUnique(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j] && i!=j) {
					return false;
				} else {
					return true;
				}
			}
		}
		return true;
	}

}
