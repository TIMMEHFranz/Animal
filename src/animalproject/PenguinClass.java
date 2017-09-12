/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalproject;

/**
 *
 * @author tfranz
 */
public class PenguinClass extends BirdClass implements IFly,IMakeSound,ISwim,IWalk {
    private String BirdName;
    private double wingSpan;
    
    public PenguinClass(String BirdName,double wingSpan) {
        this.BirdName = BirdName;
        this.wingSpan = wingSpan;
    }
    
    @Override
    public void canFly() {
        System.out.println(BirdName + " the penguin cannot fly.");
    }

    @Override
    public void canWalk() {
        System.out.println(BirdName + "the penguin waddles across the ground."); 
    }

    @Override
    public void canSwim() {
        System.out.println(BirdName + "the penguin can swim."); 
    }
    
    @Override
    public void makeSound() {
        System.out.println(BirdName + "the penguin makes a quacking sound"); 
    }
}
