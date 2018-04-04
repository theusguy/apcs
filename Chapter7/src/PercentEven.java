//@author Usman
//Programs works correctly. Congrats!
public class PercentEven {
	public static void main(String[] args) {
		int[] numbers = {6,2,9,11,3};
		System.out.println(percentEven(numbers));
	}
	public static double percentEven(int[] num) {
		int numerator = 0;
		int denominator = num.length;
		for (int n: num) {
			if (n%2 == 0) {
				numerator++;
			}
		}
		return (double)numerator/denominator * 100;
	}
}
