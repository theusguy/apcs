  import java.util.Scanner;
  class RandomNumber {
  public static void main (String[] args)
{

    Scanner stdIn = new Scanner(System.in);

    String entry;           
    String yn;
    int guesses = 1;
    String hl;
    int guess = 5;                   
    int lower_bound = 1;               //lowest number
    int upper_bound = 10;            //higher number




    System.out.println("Welcome to the guessing game!");                            //starting dialogue
    System.out.println("");
    System.out.println("Think of a number between 1 and 1000");
    System.out.println("and I'll guess it within 10 tries.");

    do
    {
        System.out.println("Press enter when ready...");                          //by pressing enter the game begins
        entry = stdIn.nextLine();
    } while (!(entry.equals("")));







    do
    {
        System.out.println("Guessing between " + lower_bound + " and " + upper_bound);     //updated lower and upper bounds
        System.out.println("My guess is " + guess);                                        //updated guess is asked
        System.out.println("is that it (y/n)");
        yn = stdIn.nextLine();


        if (yn.equals("n")) 
        {
            guesses++;

            do
            {
                System.out.println("Is it higher or lower than " + guess + " (h/l)");          //updated guess is put in and asks for h/l
                hl = stdIn.nextLine();
            } while (!(hl=="l") && (hl=="h"));

            if (hl.equals("h"))                                                            //if higher it goes here
            {
                lower_bound=guess;          
                lower_bound++;
            }

            if (hl.equals("l"))                                                           //if lower it goes here
            {
                upper_bound=guess;
                upper_bound--;
            }

            guess=(lower_bound+upper_bound)/2;
        } 





    } while (!(yn.equals("y")));

    if (yn.equals("y"));                                                             //if I find the right answer!
    {
        System.out.println("I got it in " + guesses + " guesses!");
    }

    if (guesses == 10)                                                             
    {
        System.out.print("I don't work if you lie to me");
    }


}
}