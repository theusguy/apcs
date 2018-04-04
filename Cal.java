import java.util.*;

public class Cal {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the number of days in the month");
        int numberDays = console.nextInt();
        System.out.println("Please enter the date of the first Sunday");
        int dateSunday = console.nextInt();
        int column = 1;
        int day = 1;
        
        System.out.println("  S  M  T  W Th  F Sa");
        
        for ( int i = 1; (i <= 8 - dateSunday) && (dateSunday != 1); i++) {
            System.out.print("   ");
            column++;
        }
        
        for (int i = 1; i <= (numberDays + 8 - dateSunday) / 7 + 1; i++) {
            for (int j = column; (day <= numberDays) && ( j <= 7); j++) {
                System.out.print(String.format("%3d", day));
                day++;
            }
            column = 1;
            System.out.println();
        }
    }   
}