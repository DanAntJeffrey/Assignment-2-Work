/*
* This is the Crow Class code that inherits from class Animal.
*
* @author  D Jeffrey
* @version 1.0
* @since   2025-12-4
*/

public final class Crow extends Animal {
   /**
    * Create height variable.
    */
   private int height;

   /**
    * Creates Hare constructor that sets all starting variables.
    *
    * @param newName
    * @param newColor
    * @param newMaxSpeed
    * @param newNumberOfLegs
    * @param newAnimalSound
    */

   public Crow(final String newName, final String newColor,
   final int newMaxSpeed, final int newNumberOfLegs,
   final String newAnimalSound, final int newHeight) {
       super(newName, newColor, newMaxSpeed, newNumberOfLegs, newAnimalSound);
       this.height = newHeight;
   }


   /**
    * Creates specialAbility method.
    *
    * @param powerLevel
    */
   @Override
   public void specialAbility(final int abilityModifier) {
       this.height = abilityModifier;
   }

   /**
    * Creates accelerate method.
    *
    * @param accelerationPower
    * @param accelerationTime
    */
   public void accelerate(final int accelerationPower,
   final int accelerationTime) {
       super.setSpeed(getSpeed() + 2 * accelerationPower * accelerationTime);
       if (super.getSpeed() > super.getMaxSpeed()) {
           super.setSpeed(super.getMaxSpeed());
       }
   }


   /**
    * Creates brake method.
    *
    * @param brakePower
    * @param brakeTime
    */
   public void brake(final int brakePower, final int brakeTime) {
       super.setSpeed(getSpeed() - brakePower * brakeTime);
       if (super.getSpeed() < 0) {
           super.setSpeed(0);
       }
   }

   /**
    * This function gets the height.
    *
    * @return height returns the height
    */
   public int getHeight() {
       return height;
   }
}