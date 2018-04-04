public class Egg {
	public static void main(String[] args) {
		borderEgg();
		System.out.println(" /      \\");
		System.out.println("/        \\");
		System.out.println("-\"-'-\"-'-\"-");
		System.out.println("\\        /");
		System.out.println(" \\      /");
		borderEgg();

	}
	public static void borderEgg () {
		for (int i = 1; i < 11; i++) {
			if (i > 2 && i < 9) {
				System.out.print("-");
			} else {
				System.out.print(" ");
			} 
		}
		System.out.println();
	}
}