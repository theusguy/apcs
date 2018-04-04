import java.util.Scanner;
import java.util.*;

public class PEEB3 {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    
    System.out.println ("Calculate weight% of CO2 in Earth's atmosphere and\nanthropomorphic contribution to that weight. Estimate\nzero-emissions recovery time and project future trends.\n");
    
    System.out.print ("carbon footprint per person (tons) = ");
    int carbonfootprintperperson = console.nextInt ();
    System.out.println ("annual per capita CO2 absorption capacity = ");
    double co2absorptioncapacity = console.nextDouble ();
    
    if (carbonfootprintperperson == 2)
    {
      System.out.println ("surface area Earth (sq mi) = 1.97E08"); 
      System.out.println ("surface area Earth (sq in) = 7.91E17");
      System.out.println ("weight of atmosphere (lbs) = 1.16E19");
      System.out.println ("weight of atmosphere (tons) = 5.81E15");
      System.out.println ("weight concentration CO2 (ppmw) = 616");
      System.out.println ("weight percent CO2 = 0.062");
      System.out.println ("weight CO2 (tons) = 3.58E12\n");
      System.out.println ("anthropormorphic CO2 footprint (tons) = 1.46E10");
      System.out.println ("anthropomorphic CO2 percent = 0.408\n");
      System.out.println ("weight CO2 in 1750 (tons) = 2.51E12");
      System.out.println ("CO2 weight gain (tons) = 1.07E12");
      System.out.println ("CO2 annual absorption capacity (tons) = 3.65E09");
      System.out.println ("zero-emissions absorption time (years) = 294\n");
      System.out.println ("average CO2 interest rate since 1900 (percent) = 0.311");
      System.out.println ("20 year factor @ 2015 interest rate = 1.08");
      System.out.println ("50 year factor @ 2015 interest rate = 1.23");
      System.out.println ("100 year factor @ 2015 interest rate = 1.50");
    }
    
    if (carbonfootprintperperson == 4)
    {
      System.out.println ("surface area Earth (sq mi) = 1.97E08"); 
      System.out.println ("surface area Earth (sq in) = 7.91E17");
      System.out.println ("weight of atmosphere (lbs) = 1.16E19");
      System.out.println ("weight of atmosphere (tons) = 5.81E15");
      System.out.println ("weight concentration CO2 (ppmw) = 616");
      System.out.println ("weight percent CO2 = 0.062");
      System.out.println ("weight CO2 (tons) = 3.58E12\n");
      System.out.println ("anthropormorphic CO2 footprint (tons) = 2.92E10");
      System.out.println ("anthropomorphic CO2 percent = 0.816\n");
      System.out.println ("weight CO2 in 1750 (tons) = 2.51E12");
      System.out.println ("CO2 weight gain (tons) = 1.07E12");
      System.out.println ("CO2 annual absorption capacity (tons) = 3.65E09");
      System.out.println ("zero-emissions absorption time (years) = 294\n");
      System.out.println ("average CO2 interest rate since 1900 (percent) = 0.311");
      System.out.println ("20 year factor @ 2015 interest rate = 1.18");
      System.out.println ("50 year factor @ 2015 interest rate = 1.50");
      System.out.println ("100 year factor @ 2015 interest rate = 2.25");
    }
    
    if (carbonfootprintperperson == 6)
    {
      System.out.println ("surface area Earth (sq mi) = 1.97E08"); 
      System.out.println ("surface area Earth (sq in) = 7.91E17");
      System.out.println ("weight of atmosphere (lbs) = 1.16E19");
      System.out.println ("weight of atmosphere (tons) = 5.81E15");
      System.out.println ("weight concentration CO2 (ppmw) = 616");
      System.out.println ("weight percent CO2 = 0.062");
      System.out.println ("weight CO2 (tons) = 3.58E12\n");
      System.out.println ("anthropormorphic CO2 footprint (tons) = 4.38E10");
      System.out.println ("anthropomorphic CO2 percent = 1.224\n");
      System.out.println ("weight CO2 in 1750 (tons) = 2.51E12");
      System.out.println ("CO2 weight gain (tons) = 1.07E12");
      System.out.println ("CO2 annual absorption capacity (tons) = 3.65E09");
      System.out.println ("zero-emissions absorption time (years) = 294\n");
      System.out.println ("average CO2 interest rate since 1900 (percent) = 0.311");
      System.out.println ("20 year factor @ 2015 interest rate = 1.28");
      System.out.println ("50 year factor @ 2015 interest rate = 1.84");
      System.out.println ("100 year factor @ 2015 interest rate = 3.37");
    }
  }
}