import java.util.Scanner;
public class Mountain{
	public static void main(String[] args) {
		System.out.println("Enter your string below:");
		getInput();

	}
	public static boolean getInput () {
		Scanner scan = new Scanner(System.in);
		String parenthesis = scan.nextLine();
		int stringLength = parenthesis.length();
		int beginMountain = 0;
		int closeMountain = 0;
		for (int i = 0; i <= stringLength; i++) {
			if (parenthesis.charAt(i) == '(') {
				beginMountain++;
			} 
			if (parenthesis.charAt(i) == ')') {
				closeMountain++;
			}

		}
		if (parenthesis.charAt(0) == ')') {
			return false;
		} else if (beginMountain == closeMountain){
			return true;
		} else {
			return false;
		}

	
	}
	
}