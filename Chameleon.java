/*
* This is the Chameleon Class code that inherits from class Animal.
*
* @author  D Jeffrey
* @version 1.0
* @since   2025-11-28
*/


public class Chameleon extends Animal {


   /**
    * Creates Chameleon constructor that sets all starting variables.
    *
    * @param newName
    * @param newColor
    * @param newMaxSpeed
    * @param newNumberOfLegs
    * @param newAnimalSound
    */
   public Chameleon(final String newName, final String newColor,
   final int newMaxSpeed, final int newNumberOfLegs,
   final String newAnimalSound) {
       super(newName, newColor, newMaxSpeed, newNumberOfLegs, newAnimalSound);


   }


   /**
    * Creates specialAbility method.
    *
    * @param abilityModifier
    */
   @Override
   public void specialAbility(final int abilityModifier) {
        setColor("Camoflauged");
        setNumberOfLegs(abilityModifier);

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
}



