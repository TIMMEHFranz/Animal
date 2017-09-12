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
public class OstrichClass extends BirdClass implements IFly,IMakeSound,ISwim,IWalk {
    private String OstrichClass;
    private double wingSpan;
    
    public OstrichClass(String EagleName,double wingSpan) {
        this.OstrichClass = EagleName;
        this.wingSpan = wingSpan;
    }
    
    @Override
    public void canFly() {
        System.out.println(OstrichClass + " the ostrich cannot fly.");
    }

    @Override
    public void canWalk() {
        System.out.println(OstrichClass + "the ostrich walks across the ground."); 
    }

    @Override
    public void canSwim() {
        System.out.println(OstrichClass + "the ostrich cannot swim."); 
    }
    
    @Override
    public void makeSound() {
        System.out.println(OstrichClass + "the ostrich makes a honking sound"); 
    }
}
