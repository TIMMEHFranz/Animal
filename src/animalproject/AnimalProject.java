/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalproject;

import java.util.ArrayList;

/**
 *
 * @author tfranz
 */
public class AnimalProject  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
    BassClass blooper = new BassClass("Blooper", true );     
    BatClass batty = new BatClass("Batty",.5);
    DolphinClass sqeaky = new DolphinClass("Sqeaky", 96.8);
    EagleClass baldy = new EagleClass("Baldy", 7.5);
    FlyFishClass gloop = new FlyFishClass("Gloop", true);
    LionClass leo = new LionClass("Leo", 100.5);
    OstrichClass necky = new OstrichClass("Necky", 6.6);
    PenguinClass quacky = new PenguinClass("Quacky",.30);
    SharkClass nipper = new SharkClass("Nipper", true);
    
    ArrayList<AnimalClass> Animals = new ArrayList<>();
    Animals.add(blooper);
    Animals.add(batty);
    Animals.add(sqeaky);
    Animals.add(baldy);
    Animals.add(gloop);
    Animals.add(leo);
    Animals.add(necky);
    Animals.add(quacky);
    Animals.add(nipper);
    
    ArrayList<MammalClass> Mammals= new ArrayList<>();
    Mammals.add(leo);
    Mammals.add(sqeaky);
    Mammals.add(batty);
    
    ArrayList<BirdClass> Birds = new ArrayList<>();
    Birds.add(necky);
    Birds.add(baldy);
    Birds.add(necky);
    
    ArrayList<FishClass> Fish = new ArrayList<>();
    Fish.add(nipper);
    Fish.add(blooper);
    Fish.add(gloop);
    
    ArrayList<IFly> Flyers = new ArrayList<>();
    Flyers.add(batty);
    Flyers.add(baldy);
    Flyers.add(gloop);
    
    ArrayList<IWalk> Walkers = new ArrayList<>();
    Walkers.add(batty);
    Walkers.add(baldy);
    Walkers.add(leo);
    Walkers.add(necky);
    Walkers.add(quacky);

    ArrayList<ISwim> Swimmers = new ArrayList<>();
    Swimmers.add(blooper);
    Swimmers.add(sqeaky);
    Swimmers.add(gloop);
    Swimmers.add(nipper);
    
    ArrayList<IMakeSound> SoundMakers = new ArrayList<>();
    SoundMakers.add(blooper);
    SoundMakers.add(batty);
    SoundMakers.add(sqeaky);
    SoundMakers.add(baldy);
    SoundMakers.add(gloop);
    SoundMakers.add(leo);
    SoundMakers.add(necky);
    SoundMakers.add(quacky);
    SoundMakers.add(nipper);
    }
    
}
