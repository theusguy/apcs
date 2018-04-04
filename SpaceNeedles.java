public class SpaceNeedles {
 public static final int SIZE = 6;
 public static void drawHead(){
   for (int line = 1; line <= SIZE; line++){
     for (int spaces = 1; spaces <= (3 * SIZE); spaces++) {
       System.out.print(" ");
     }
     System.out.println("||");
   }
 } 
 public static void drawSlashesAndColons() {
   for (int line = 1; line <= SIZE; line ++) {
     for (int spaces = 1; spaces <= (-3 * line + (SIZE * 3)); spaces++) {
       System.out.print(" ");
     }
     System.out.print("__/");
     dots(line);
     System.out.print("||");
     dots(line);
     System.out.println("\\__");
   }
   drawLine();
 }
 public static void dots(int line) {
   for (int dots = 1; dots <= (line * 3 - 3); dots++) {
     System.out.print(":");
   }
 }
 public static void drawLine(){
   System.out.print("|");
   for (int dQuotes = 1; dQuotes <= SIZE * 6; dQuotes++) {
     System.out.print("\"");
   }
   System.out.println("|");
 }
 public static void drawLowerCone() {
   for (int line = 1; line <= SIZE; line++) {
     for (int spaces = 1; spaces <= (2 * line - 2); spaces++) {
       System.out.print(" ");
     }
     System.out.print("\\_");
     for (int slashes = 1; slashes <= (-2 * line + (3 * SIZE + 1)); slashes++) {
       System.out.print("/\\");
     }
     System.out.println("_/");
   }
 }
 public static void drawPercent() {
   for (int line = 1; line <= 3 * SIZE; line ++) {
     for (int spaces = 1; spaces <= (3 * SIZE -3); spaces++) {
       System.out.print(" ");
     }
     System.out.println("|%%||%%|");
   }
 }
 public static void main(String[] args) {
   drawHead();
   drawSlashesAndColons();
   drawLowerCone();
   drawHead();
   drawPercent();
   drawSlashesAndColons();
 }
}