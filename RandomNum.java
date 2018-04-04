import java.util.Scanner;
public class RandomNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 10");
        int randomNumbr = 1 + (int)(Math.random()*10);
        System.out.print("Is it " + randomNumbr + "?");
        String choice = scan.next();
        int counter = 1;
        while (choice.equals("n")) {
            randomNumbr = 1 + (int)(Math.random()*10);
            System.out.print("Is it " + randomNumbr + "?");
            choice = scan.next();
            counter++;
        }
        System.out.println("I got your number of " + randomNumbr + "in " + counter + " guesses");
    }
}