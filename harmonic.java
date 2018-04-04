import java.util.*;
public class harmonic 
{
    private static double sum = 0, limit;
    private static int terms= 1;

    public static void getNumber(Scanner in, String prompt) 
    {
    	//scanner, gets the number
        System.out.print(prompt);
        limit = in.nextDouble();
    }
    
    public static void fractionSum() 
    {
    	//takes the fraction sum
        while(sum <= limit) {
            sum += 1.0/(terms);
            terms++;
        }
        System.out.printf("Actual sum = %.5f\n", sum);
        System.out.println("Number of terms required: " + (terms-1)); 
    }
    
    public static void getSumLimit() 
    {
		//check the user input
        getNumber(new Scanner(System.in), "Enter a sum limit: ");
        
        if(limit >= 1) {
            fractionSum();
        }
        else {
            System.out.println("Sum limit must be greater than or equal to one.\n");
            getSumLimit();
        }
    }
    
    public static void main(String args[])
    {
		//put it all in one
        getSumLimit();
    }
   
    
}