import java.util.*;
public class Pascal{ 
	public static void main(String[] args) {
		int raow = getInt();
		writeChars(raow);
		writeRow();

		String spaces = "";
		

	}
	
	public static void writeChars(int num) {
		for(int row = 0; row < raow; row++){
			secnum = 1;
			for(int space = 1; space < (((2*raow)-1)-2*row); space++){
				System.out.printf("%1s", " ");
			}
		} 	
	}

	public static void writeRow() {
		int secnum = 1;
		for(int num = 0; num<=row; num++) {
			if (num == 0){
				System.out.print(secnum);
			} else {
				System.out.printf("%4d", secnum);
			}
			secnum = secnum	* (row - num) /(num+1);
				//System.out.print(secnum);
		}
		System.out.println();
	}
	public static int getInt() {
		Scanner sc = new Scanner(System.in);
		int raow = sc.nextInt();
		return raow;
	}
}
