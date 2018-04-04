import java.util.Scanner;
public class GradeOfStudent {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int grade =  scan.nextInt();
	System.out.println(whatGrade(grade));

	}
	public static char whatGrade (int grade) {
		if (grade > 100 || grade < 0) {
			return 'z';
		} else if (grade >= 90) {
			return 'A';
		} else if (grade >= 80) {
			return 'B';
		} else if (grade >= 70) {
			return 'C';
		} else if (grade >= 60) {
			return 'D';
			
		} else {
			return 'F';
			
		}


	}
}
