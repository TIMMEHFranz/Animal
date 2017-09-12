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
public class EagleClass extends BirdClass implements IFly,IMakeSound,ISwim,IWalk {
    private String BirdName;
    private double wingSpan;
    
    public EagleClass(String BirdName, double wingSpan) {
        this.BirdName = BirdName;
        this.wingSpan = wingSpan;
    }
    
    @Override
    public void canFly() {
        System.out.println(BirdName + " the eagle can fly.");
    }

    @Override
    public void canWalk() {
        System.out.println(BirdName + "the eagle walks across the ground."); 
    }

    @Override
    public void canSwim() {
        System.out.println(BirdName + "the eagle can swim."); 
    }
    
    @Override
    public void makeSound() {
        System.out.println(BirdName + "the eagle makes cawing sound"); 
    }
}
