import java.util.Scanner;
import java.util.*;
import java.awt.*;
public class GreenUnda {
	public static void main(String[] args) throws FileNotFoundException {
		File greenunda = new File(GreenEggs.txt);
		Scanner scan = new Scanner(GreenEggs.txt);
		int test = 0;
		while (scan.hasNext()) {
			test++;
		}
		String[] compilation = new String[test];
		System.out.println("Number of words: " + test);
		for (int i=0; i<compilation.length; i++) {
			int sameWords = 0;
			for (int j=0; j<compilation.length; j++) {
				compilation[i].equalsIgnoreCase(compilation[j]);
				sameWords++;
				System.out.println("Amount of times the word \"" + compilation[i] + "\" is used.");
			}
		}
		
	}

}
