/*
* This is the Hare Class code that inherits from class Animal.
*
* @author  D Jeffrey
* @version 1.0
* @since   2025-12-1
*/


public final class Hare extends Animal {
   /**
    * Create legPower variable.
    */
   private int legPower;



   /**
    * Creates Hare constructor that sets all starting variables.
    *
    * @param newName
    * @param newColor
    * @param newMaxSpeed
    * @param newNumberOfLegs
    * @param newAnimalSound
    * @param newLegPower
    */


   public Hare(final String newName, final String newColor,
   final int newMaxSpeed, final int newNumberOfLegs,
   final String newAnimalSound, final int newLegPower) {
       super(newName, newColor, newMaxSpeed, newNumberOfLegs, newAnimalSound);
       this.legPower = newLegPower;
   }


   /**
    * Creates specialAbility method.
    *
    * @param powerLevel
    */
   @Override
   public void specialAbility(final int abilityModifier) {
       super.setMaxSpeed(abilityModifier);
       super.setSpeed(abilityModifier);
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
    * This function gets the number of legs.
    *
    * @return legPower returns the legPower
    */
   public int getLegPower() {
       return legPower;
   }
}



