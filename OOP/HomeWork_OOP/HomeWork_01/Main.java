package OOP.HomeWork_OOP.HomeWork_01;

import OOP.HomeWork_OOP.HomeWork_01.Unit.Crossbowman;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Magician;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Monk;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Outlaw;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Peasant;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Sniper;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Spearman;

public class Main {
    public static void main(String[] args) {
        // Characters characters = new Characters(89, 100, 50, 10, 10, 100);
        Peasant peasant = new Peasant(30, 30, 10, 0, 0, 10, 10);
        
        Outlaw outlaw = new Outlaw(50, 50, 20, 0, 0, 10);
        
        Spearman spearman = new Spearman(0, 0, 0, 0, 0, 0);
        
        Sniper sniper = new Sniper(100, 100, 60, 0, 20, 
            0, 10, 20, 100, 70, 0, 0);
        
        Crossbowman crossbowman = new Crossbowman(100, 100, 60, 0, 10, 
            0, 10, 10, 70, 70);
        
        Magician magician = new Magician(100, 100, 90, 0, 20, 
            0, 20, 10);
        
        Monk monk = new Monk(100, 100, 90, 0, 10, 0, 10);
        
    }
}
