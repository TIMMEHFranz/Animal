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
public class LionClass extends MammalClass implements IFly,IMakeSound,ISwim,IWalk {
    
    private String MammalName;
    private double bodyTemp;
    
    public LionClass(String MammalName, double bodyTemp) {
        this.MammalName = MammalName;
        this.bodyTemp = bodyTemp;
    }
    @Override
    public void canFly() {
        System.out.println(MammalName +" the Lion cannot fly.");
    }

    @Override
    public void makeSound() {
        System.out.println(MammalName +"the lion makes a roaring sound.");
    }

    @Override
    public void canSwim() {
        System.out.println(MammalName +"the lion cannot swim.");
    }

    @Override
    public void canWalk() {
        System.out.println(MammalName +"the lion walks on all fours.");
    }    
}
