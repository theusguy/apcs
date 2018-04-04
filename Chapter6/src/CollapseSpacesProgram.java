import java.util.*;
import java.io.*;

//@author Usman
//Programs works perfectly. Congrats!

public class CollapseSpacesProgram {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("collapseSpaces.txt"));
		collapseSpaces(scan);
		
	}
	public static void collapseSpaces(Scanner console) {
		String storeWord = "";
		while (console.hasNext() == true) {
			storeWord += console.next();
			storeWord += " ";
		}
		System.out.println(storeWord);
	}

}
