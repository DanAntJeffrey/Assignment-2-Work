/*
* This is the code for the Animal Class, the abstract superclass that is
* inherited by the following classes.
*
* @author  D Jeffrey
* @version 1.0
* @since   2025-11-28
*/


public abstract class Animal {
   /**
    * Create name variable.
    */
   private String name;


   /**
    * Create color variable.
    */
   private String color;


   /**
    * Create speed variable.
    */
   private int speed;


   /**
    * Create maxSpeed variable.
    */
   private int maxSpeed;


   /**
    * Create numberOfLegs variable.
    */
   private int numberOfLegs;


   /**
    * Create animalSound variable.
    */
   private String animalSound;


   /**
    * Creates Animal constructor that sets all starting variables.
    *
    * @param newName
    * @param newColor
    * @param newMaxSpeed
    * @param newNumberOfLegs
    * @param newAnimalSound
    */
   public Animal(final String newName, final String newColor,
   final int newMaxSpeed, final int newNumberOfLegs,
   final String newAnimalSound) {
       this.name = newName;
       this.color = newColor;
       this.maxSpeed = newMaxSpeed;
       this.numberOfLegs = newNumberOfLegs;
       this.animalSound = newAnimalSound;
       this.speed = 0;
   }


   /**
    * Creates abstract specialAbility method to be declared in each inherited
    * class.
    */
   public abstract void specialAbility(final int abilityModifier);


   /**
    * Creates abstract accelerate method to be declared in each inherited
    * class.
    */
   public abstract void accelerate(final int accelerationPower,
   final int accelerationTime);


   /**
    * Creates abstract brake method to be declared in each inherited
    * class.
    */
   public abstract void brake(final int brakePower, final int brakeTime);


   /**
    * This function sets a new speed.
    *
    * @param newSpeed is a new speed
    */
   public void setSpeed(final int newSpeed) {
       speed = newSpeed;
   }


   /**
    * This function gets the speed.
    *
    * @return speed returns the speed
    */
   public int getSpeed() {
       return speed;
   }


   /**
    * This function sets a new max speed.
    *
    * @param newMaxSpeed is a new max speed
    */
   public void setMaxSpeed(final int newMaxSpeed) {
       maxSpeed = newMaxSpeed;
   }


   /**
    * This function gets the Max speed.
    *
    * @return speed returns the speed
    */
   public int getMaxSpeed() {
       return maxSpeed;
   }

   /**
    * This function gets the animalSound.
    *
    * @return animalSound returns the animalSound
    */
   public String getAnimalSound() {
       return animalSound;
   }


   /**
    * This function gets the name.
    *
    * @return name returns the name
    */
   public String getName() {
       return name;
   }


   /**
    * This function sets a new color.
    *
    * @param newColor is a new color
    */
   public void setColor(final String newColor) {
       color = newColor;
   }


   /**
    * This function gets the color.
    *
    * @return color returns the color
    */
   public String getColor() {
       return color;
   }


   /**
    * This function sets a number of legs.
    *
    * @param newNumberOfLegs is a new number of legs
    */
   public void setNumberOfLegs(final int newNumberOfLegs) {
       numberOfLegs = newNumberOfLegs;
   }


   /**
    * This function gets the number of legs.
    *
    * @return numberOfLegs returns the legs
    */
   public int getNumberOfLegs() {
       return numberOfLegs;
   }
}





