import java.io.*;
import java.util.*;


public class Benford
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner con = new Scanner(System.in);
     
		System.out.println("Let's count those leading digits...");
     
		System.out.print("input file name? ");
     
		String name = con.nextLine();
		Scanner scn = new Scanner(new File(name));
		int[] count = countDigits(scn);
		reportResults(count);
	}

 // Reads integers from input txt file
 //getting the occurances of each leading digit 0-9
 
	public static int[] countDigits(Scanner scn)
	{
		int[] ba = new int[10];
		while (scn.hasNextInt())
		{
			int n = scn.nextInt();
			ba[great(n)]++;
		}
		return ba;
	}

	
	
	public static void reportResults(int[] count) {
		System.out.println();
		if (count[0] > 0) {
			System.out.println("excluding " + count[0] + " zeros");
		}
		int t = muss(count) - count[0];
		System.out.println("Digit Count Percent");
			for (int i = 1; i < count.length; i++) {
				double trap = count[i] * 100.0 / t;
         System.out.printf("%5d %5d %6.2f\n", i, count[i], trap);
     }
     System.out.printf("===================\nTotal %5d %6.2f\n", t, 100.0);
 }
	
	

	public static int muss(int[] data) 
	{
		int muss = 0;
		for (int n : data) 
		{
         muss += n;
		}
		return muss;
	}
	
	

	public static int great(int n) 
	{
		int last = Math.abs(n);
		while (last >= 10)
		{
			last = last / 10;
		}
		return last;
	}
}