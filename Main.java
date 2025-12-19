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
           "\u001B[32m" + "THE TORTOISE AND THE HARE"
           + "\u001B[0m" + ": A SHORT STORY");
       System.out.println("______________________________________");
       // create Hare object, use methods
       Hare hare = new Hare("Hare", "brown", hareMaxSpeed, hareLegs,
       "Gloink", hareLegPower);


       //create Tortoise object
       Tortoise tortoise = new Tortoise(
           "Tortoise", "dark green", tortoiseMaxSpeed, tortoiseLegs, "...",
           tortoiseShellDurability, "brown");


       // this is the main story, using all methods and
       System.out.println("Take a seat and listen well,"
           + " as I tell the story of a turt in his shell...");
  
       System.out.println("You might be in for quite a scare,"
       + " as you learn of a villain by the name of " + hare.getName() + "!");


       System.out.println("You see, " + hare.getName() + " asked "
       + tortoise.getName() + " to compete in a race, all so "
       + hare.getName() + " could laugh in his face!\n");


       System.out.println(hare.getName() + " was confident he'd win in a jiffy"
       + ", since he could run " + hare.getMaxSpeed() + " m/s, very quick(ly)!");






       System.out.println(hare.getName() + "'s hair was a deep " + hare.getColor()
       + " in the sun, while " + tortoise.getName() + "'s scales were "
       + tortoise.getColor() + ", he knew there'd be no fun.\n");


        System.out.println("As the pair stepped up to the line, "
        + tortoise.getName() + " realized they weren't alone!");

        Crow crow = new Crow(
           "Crow", "black", crowMaxSpeed, crowLegs, "CAWWWWWWW", crowHeight);
        System.out.println("'" + crow.getAnimalSound() + "!' went " + crow.getName() + ", with " + crow.getColor() + " wings spread aglown.\n");

        System.out.println("The racers set their marks, and the forest watched as the racers begun to show sparks!");
        hare.accelerate(hareLegPower, 5);
        tortoise.accelerate(1, 5);
        crow.accelerate(2, 5);
        System.out.println(hare.getName() + " shot forward with all his might, a blazing " + hare.getSpeed() + " m/s, what a sight!");
        System.out.println(tortoise.getName() + " plodded on, steady and slow, at " + tortoise.getSpeed() + " m/s, taking it low.");
        System.out.println(crow.getName() + " flapped its wings and took to the sky, soaring at " + crow.getSpeed() + " m/s, though not very high.\n");

        System.out.println("Then came the first obstacle, a wide stream to cross, though not hard for " + hare.getName() + ", he was the boss!");
        hare.brake(10, 2);
        tortoise.accelerate(10, 2);
        System.out.println(hare.getName() + " had to brake to get over the stream, while " + crow.getName() + " flew like a beam, and " + tortoise.getName() + " swam with ease.");
        System.out.println("After the stream, " + hare.getName() + " sped off again, leaving " + tortoise.getName() + " behind, feeling the pain.");
        System.out.println(hare.getAnimalSound() + "! he shouted, as he raced ahead, thinking of victory and the glory to be had.");
        System.out.println(tortoise.getAnimalSound() + "! responded " + tortoise.getName() + " (for Tortoise was quiet), knowing that winning was his purpose.\n");

        System.out.println("By a stroke of luck, the three animals came upon the next obstacle all at once, a tall mountain to make them grunt!");
        System.out.println("'No problem', thought " + hare.getName() + ", 'I'll show them my skill and reach the top of this uphill.'");
        hare.specialAbility(2000);
        System.out.println(hare.getName() + "'s special ability activated, his speed increased to " + hare.getMaxSpeed() + " m/s, he was elated!"); 
       System.out.println("\nDone.");
   }
}



