import java.util.Scanner;
public class HarmonicSeries {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double sumInput = console.nextDouble();
		double sumOfN = 0.0;
		double loopN;
		for (loopN = 0; loopN <= sumInput; loopN++) {
			sumOfN += (1/loopN);
		}
		System.out.printf("%5.4f", harmonic(loopN) );

	}
	public static double harmonic(double n) {
    if(n == 1) {
        return 1.0;
    } else {
        return (1.0 / n) + harmonic(n - 1);
    }
}
}
