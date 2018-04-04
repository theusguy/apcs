public class VictoryIsMine {
	public static void main (String[] args) {
		String banner =  " Victory is Mine! ";
		for (int i=-2; i <=banner.length() + 2; i++){
			System.out.print("/");
			if (i == banner.length() + 2) {
				System.out.println();
			}
		}
		System.out.println("||" + banner + "||");
		for (int i=-2; i <=banner.length() + 2; i++){
			System.out.print("\\");
			if (i == banner.length() + 2) {
				System.out.println();
			}
		}

	}
}