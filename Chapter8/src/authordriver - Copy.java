import java.util.Scanner;
public class authordriver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		char gender = scan.next().charAt(0);
		int prodYears = scan.nextInt();
		int lazyYears = scan.nextInt();
		Author author = new Author(input, gender);
		author.changeEmail(author.getName() + ".2015@gmail.com");
		System.out.println(author.toString());
	}

}
