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
public class FlyFishClass extends FishClass implements IFly,IMakeSound,ISwim,IWalk {
    private String FishName;
    private boolean isSaltWater;  
    
    public FlyFishClass(String FishName, boolean isSaltWater) {
        this.FishName = FishName;
        this.isSaltWater = isSaltWater;
    }
    
    @Override
    public void canFly() {
         System.out.println(FishName + "the flying fish can fly.");
    }

    @Override
    public void makeSound() {
        System.out.println(FishName + "the flying fish makes a splashing sound when it swims.");
    }

    @Override
    public void canSwim() {
         System.out.println(FishName + "the flying fish can swim.");
    }

    @Override
    public void canWalk() {
         System.out.println(FishName + "the flying fish cannot walk.");
    }
}
