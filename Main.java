/*
* This is the main code that runs with the Animal and other classes.
*
* @author  D Jeffrey
* @version 1.0
* @since   20240-01-01
*/


/**
* This is the Main program.
*/
public final class Main {
   /**
   * Prevent instantiation
   * Throw an exception IllegalStateException.
   * if this ever is called
   *
   * @throws IllegalStateException if instantiation is attempted
   */
   private Main() {
       throw new IllegalStateException("Cannot be instantiated");
   }


   /**
   * The starting main() function.
   *
   * @param args No args will be used
   */
   public static void main(final String[] args) {
       // MultipleStringLiterals & MagicNumbers
       final int hareMaxSpeed = 100;
       final int hareLegs = 2;
       final int hareLegPower = 10;
       final int tortoiseMaxSpeed = 10;
       final int tortoiseLegs = 4;
       final int tortoiseShellDurability = 100;
       final int crowMaxSpeed = 20;
       final int crowLegs = 2;
       final int crowHeight = 2;


       System.out.println(
           "_____________________________________________________");
       System.out.println(
           "\u001B[32m" + "THE TORTOISE AND THE HARE (AND OTHERS)"
           + "\u001B[0m" + ": A SHORT STORY");
       System.out.println("______________________________________");
       // create Hare object, use methods
       Hare hare = new Hare("Hare", "brown", hareMaxSpeed, hareLegs,
       "Gloink", hareLegPower, "Logan");


       //create Tortoise object
       Tortoise tortoise = new Tortoise(
           "Tortoise", "dark green", tortoiseMaxSpeed, tortoiseLegs, "...",
           tortoiseShellDurability, "brown");


       // this is the main story, using all methods and
       System.out.println("Take a seat and listen well,"
           + " as I tell the story of a turt in his shell...");
  
       System.out.println("\nYou might be in for quite a scare,"
       + " as you learn of a villain by the name of " + hare.getName() + "!");


       System.out.println("\nYou see, " + hare.getName() + " asked "
       + tortoise.getName() + " to compete in a race, all so "
       + hare.getName() + " could laugh in his face!");


       System.out.println(hare.getName() + " was confident he'd win in a jiffy"
       + ", since he could run " + hare.getMaxSpeed() + " m/s, very quick(ly)!");






       System.out.println(hare.getName() + "'s hair was a deep " + hare.getColor()
       + " in the sun, while " + tortoise.getName() + "'s scales were "
       + tortoise.getColor() + ", he knew there'd be no fun.");


       System.out.println("As the pair stepped up to the line, "
       + tortoise.getName() + "realized they weren't alone!");


       Crow crow = new Crow(
           "Crow", "black", crowMaxSpeed, crowLegs, "CAWWWWWWW", crowHeight);




       System.out.println("\nDone.");
   }
}



