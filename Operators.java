import java.util.*;
 
import java.io.*;
 
public class Operators
{
        public static void main(String[] args)
        {
                Scanner console = new Scanner(System.in);
                System.out.println("Enter two integers to be added:");
                int x = console.nextInt();
                int y = console.nextInt();
                               
                int sum = add(x,y);
                int subtraction = subtract(x,y);
                int quotient = quotient(x,y);
                int remainder = remainder(x,y);
                               
                System.out.println("The sum is " + sum);
                System.out.println("The difference is " + subtraction);
                System.out.println("The quotient is " + quotient);
                System.out.println("The remainder is " + remainder);
        }
                       
       
                public static int add(int x, int y)
                {
                        for(int i=0; i<y; i++)
                        {
                                x++;
                        }
                                return x;
                }
               
               
                public static int subtract(int x, int y)
                {
                        for(int i=0; i<y; i++)
                        {
                                x--;
                        }
                                return x;
                }
                       
               
                public static int quotient(int x, int y)
                {
                        int count = 0;
                        if (x>y)
                        {
                                do
                                {
                                        x = subtract(x,y);
                                        count ++;
                                }
                                while(x>=y);
                                        return count;
                                       
                                }
                                else if(x==y)
                                {
                                        return 1;
                                       
                                }else
                                {
                                        return 0;
                                }
                        }
                        public static int remainder(int x, int y)
                        {
                               
                                if (x>y)
                                {
                                        do
                                        {
                                                x = subtract(x,y);
                                       
                                        }
                                        while (x>=y);
                                        return x;
                               
                                }
                                else if (x==y)
                                {
                                        return 0;
                                       
                                }
                                else
                                {
                                        return x;
                                }
                        }
                }