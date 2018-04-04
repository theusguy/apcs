import java.util.*;
import java.io.*;
//@author Usman
//Good Job. This works perfectly. Congrats!
public class ReadEntireFile {
	public static void main(String[] args)throws FileNotFoundException {
		Scanner scan = new Scanner(new File("readEntireFile.txt"));
		readEntireFile(scan);

	}
	public static void readEntireFile(Scanner scan) {
		while(scan.hasNextLine() == true) {
			String lines = scan.nextLine();
			lines += "\n";
			System.out.println(lines);
		}
	}

}
