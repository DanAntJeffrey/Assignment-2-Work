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
           tortoiseShellDurability);


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
        System.out.println("'" + crow.getAnimalSound() + "!' went " + crow.getName() + ", with " + crow.getColor() + " wings spread aglown.");

        Chameleon chameleon = new Chameleon("Chameleon", "green", tortoiseMaxSpeed, tortoiseLegs, "Hehehehe");
        System.out.println(chameleon.getAnimalSound() + " went " + chameleon.getName() + " with " + chameleon.getColor() + " skin, and a silly grin.\n");
        chameleon.specialAbility(2);

        System.out.println("The racers set their marks, and the forest watched as the racers begun to show sparks!");
        hare.accelerate(hareLegPower, 5);
        tortoise.accelerate(1, 5);
        crow.accelerate(2, 5);
        chameleon.accelerate(1, 5);
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
        System.out.println("'No problem', thought " + hare.getName() + ", 'I'll show them my skill and reach the top of this uphill'.");
        hare.specialAbility(200);
        System.out.println(hare.getName() + "'s special ability activated, his speed increased to " + hare.getMaxSpeed() + " m/s, he was elated!");
        System.out.println(hare.getName() + "'s " + hare.getNumberOfLegs() + " legs carried him high, but knocked rocks off the mountain, big enough to make " + tortoise.getName() + " and " + crow.getName() + " say goodbye...");
        tortoise.specialAbility(200);
        System.out.println("Before they could get crushed, " + tortoise.getName() + " ran to protect " + crow.getName() + ", his shell grew to the strength of " + tortoise.getShellDurability() + " steel ingots.");
        System.out.println("As " + crow.getName() + " looked up, he saw " + tortoise.getName() + "'s shell shining " + tortoise.getColor() + " like a trinket\n");
        System.out.println("\n'You saved me!', " + crow.getName() + " exclaimed,'I'll help you win this race and get all the fame!'");
        crow.specialAbility(200);
        crow.accelerate(100, 2);
        tortoise.setSpeed(crow.getSpeed());
        System.out.println("Without a word, " + crow.getName() + "'s talons grabbed " + tortoise.getName() + "'s shell, and Crow soared higher than ever!");
        System.out.println("With " + crow.getName() + " and " + tortoise.getName() + " flying " + crow.getHeight() + "m high, " + hare.getName() + " was left far behind.\n");
        hare.brake(10, 2);
        System.out.println("Obstacles came and went as the three animals raced on, each with their own special abilities and strengths.");
        System.out.println("The race was neck and neck when the final obstacle came into view, the gorilla of the forest trained in Kung Fu!");
        hare.brake(100, 2);
        tortoise.brake(100, 2);
        crow.brake(100, 2);
        System.out.println("The race was now a stalemate, since " + hare.getName() + ", " + tortoise.getName() + ", and " + crow.getName() + " didn't want to get ate!");
        hare.specialAbility(200);
        System.out.println("As the gorilla approached with his mean face, " + hare.getName() + " ran far away, abandoning the race.\n");
        System.out.println("But " + tortoise.getName() + " stood his ground, even against the gorilla, probably 600 pounds!");
        chameleon.brake(1, 2);
        chameleon.setColor("green");
        System.out.println("Before his big arms could start the attack, gorilla heard a noise and decided to look back.\n");
        System.out.println("'" + chameleon.getAnimalSound() + "', went " + chameleon.getName() + ", her " + chameleon.getColor() + " scales now visible.");
        System.out.println("'I bet y'all didn't see me when I went invisible!");
        System.out.println("'While you were all fighting and battling, I kept my cool and ignored all the prattling'");
        System.out.println("As the all the animals in the forest began to cheer, " + tortoise.getName() + " and " + crow.getName() + " couldn't fight back the tears.");
        System.out.println("They cheered and applauded that " + hare.getName() + " was beat, for they knew that " + chameleon.getName() + " had accomplished no easy feat");
        System.out.println(chameleon.getName() + " taught the forest a lesson with her charming wit");
        System.out.println("Progress is still progress, even if others don't see it.");

        System.out.println("\n_____________________________________________________");
        System.out.println("THE END");

        System.out.println("\u001B[32m" + "                      _       _._");
        System.out.println("               _,,-''' ''-,_ }'._''.,_.=._");
        System.out.println("            ,-'      _ _    '        (  @)'-,");
        System.out.println("          ,'  _..==;;::_::'-     __..----'''}");
        System.out.println("         :  .'::_;==''       ,'',: : : '' '}");
        System.out.println("        }  '::-'            /   },: : : :_,");
        System.out.println("       :  :'     _..,,_    '., '._-,,,--'    _");
        System.out.println("      :  ;   .-'       :      '-, ';,__._.-'");
        System.out.println("     {   '  :    _,,,   :__,,--::',,}___}^}_.-'");
        System.out.println("     }        _,'__''',  ;_.-''_.-'");
        System.out.println("    :      ,':-''  ';, ;  ;_..-'");
        System.out.println("_.-' }    ,',' ,''',  : ^^");
        System.out.println("_.-''{    { ; ; ,', '  :");
        System.out.println("      }   } :  ;_,' ;  }");
        System.out.println("       {   ',',___,'   '");
        System.out.println("        ',           ,'");
        System.out.println("          '-,,__,,-'");

        System.out.println("\u001B[0m" + "\nDone.");

   }
}



