/*
* This is the Tortoise Class code that inherits from class Animal.
*
* @author  D Jeffrey
* @version 1.0
* @since   2025-11-28
*/


public class Tortoise extends Animal {
   /**
    * Create shellDurability variable.
    */
   private int shellDurability;


   /**
    * Create shellColor variable.
    */
   private String shellColor;


   /**
    * Creates Tortoise constructor that sets all starting variables.
    *
    * @param newName
    * @param newColor
    * @param newMaxSpeed
    * @param newNumberOfLegs
    * @param newAnimalSound
    * @param newShellDurability
    * @param newShellColor
    */
   public Tortoise(final String newName, final String newColor,
   final int newMaxSpeed, final int newNumberOfLegs,
   final String newAnimalSound, final int newShellDurability) {
       super(newName, newColor, newMaxSpeed, newNumberOfLegs, newAnimalSound);
       this.shellDurability = newShellDurability;
   }

   /**
    * Creates specialAbility method.
    *
    * @param abilityModifier
    */
   @Override
   public void specialAbility(final int abilityModifier) {
        this.shellDurability = abilityModifier;
        setColor("Rainbow");
       }


   /**
    * Creates abstract accelerate method.
    *
    * @param accelerationPower
    * @param accelerationTime
    * @param accelerationModifier
    */
   @Override
   public void accelerate(final int accelerationPower,
   final int accelerationTime) {
       super.setSpeed(super.getSpeed()
       + (accelerationPower * accelerationTime / 2));
   }


   /**
    * Creates brake method.
    *
    * @param brakePower
    * @param brakeTime
    */
   @Override
   public void brake(final int brakePower, final int brakeTime) {
       super.setSpeed(super.getSpeed() - brakePower * brakeTime / 2);
       if (super.getSpeed() < 0) {
           super.setSpeed(0);
       }
   }

   /**
    * This function gets the shell durability.
    *
    * @return shellDurability returns the shell durability
    */
   public int getShellDurability() {
       return shellDurability;
   }
}



