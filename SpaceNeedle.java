Scanner consle = new Scanner (System.in);
public class SpaceNeedle {
	public static void main(String[] args){
		dLines();
		top();
		dLines();
		percentLine();
		top();
		static int CONSTANT = 2;
	}
	public static void dLines() {
		for (int i = 1; i <= 4; i++) {
		System.out.println("           ||");
		}
	}
	public static void top() {
		for (int line= 1; line <= 4; line++) {
			for (int i = 1; i <= (12) / (line * 3); i++) {
				System.out.print(" ");
				System.out.print("_/")
			}
			
		}
		System.out.println("         _/||\\_");
		System.out.println("      _/:::||:::\\_");
		System.out.println("   _/::::::||::::::\\_");
		System.out.println("_/:::::::::||:::::::::\\_");
		System.out.println("|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|");
	}
	public static void percentLine() {
		for (int d = 1; d <= 16; d++) {
		System.out.println("        |%%||%%|");
	}

	}
}