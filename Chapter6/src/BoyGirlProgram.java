import java.util.*;
import java.io.*;
//@author Usman
//Program works exactly as book describes. Congrats!
public class BoyGirlProgram {
	public static void main (String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(new File("boyGirl.txt"));
		boyGirl(console);
		
	}
	public static void boyGirl (Scanner scan) {
		String gender = "boy";
		int boy = 0;
		int girl = 0;
		int boySum = 0;
		int girlSum = 0;
		while (scan.hasNext() == true){
			if (gender.equals("boy")) {
				boy++;
				scan.next();
				boySum += scan.nextInt();
				gender = "girl";
			} else if (gender.equals("girl")) {
				girl++;
				scan.next();
				girlSum += scan.nextInt();
				gender = "boy";
			}	
		}
		System.out.println("boySum is: " + boySum + "\ngirlSum is: " + girlSum);
		System.out.println("Difference between two sums is:" + (Math.abs(boySum-girlSum)));
		System.out.println("Boys: " + boy + " Girls: " + girl);
	}

}
