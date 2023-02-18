package OOP.HomeWork_OOP.HomeWork_01;

import java.util.ArrayList;
import java.util.Random;

import OOP.HomeWork_OOP.HomeWork_01.Unit.Characters;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Names;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Minor_char.Peasant;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Main_char.Artillery.Crossbowman;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Main_char.Artillery.Sniper;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Main_char.Esoterics.Magician;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Main_char.Esoterics.Monk;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Minor_char.Outlaw;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Minor_char.Spearman;

public class Main {
    public static void main(String[] args) {
        
        Peasant peasant = new Peasant(getName());
        // System.out.println(peasant.getInfo());
        // System.out.println(getName());
        
        Outlaw outlaw = new Outlaw(getName());
        // System.out.println(outlaw.getInfo());
        // System.out.println(getName());
        
        Spearman spearman = new Spearman(getName());
        // System.out.println(spearman.getInfo());
        // System.out.println(getName());
        
        
        Sniper sniper = new Sniper(getName());
        // System.out.println(sniper.getInfo());
        // System.out.println(getName());
        
        Crossbowman XBowMan = new Crossbowman(getName());
        // System.out.println(XBowMan.getInfo());
        // System.out.println(getName());
        
        Magician magician = new Magician(getName());
        // System.out.println(magician.getInfo());
        // System.out.println(getName());
        
        Monk monk = new Monk(getName());
        // System.out.println(monk.getInfo());
        // System.out.println(getName());

        Random rnd = new Random();

        ArrayList <Characters> Char = new ArrayList<>();
        

        for (int i = 0; i < 10; i++) {
            int c = rnd.nextInt(7);
            if (c == 0) {Char.add(peasant);}
            if (c == 1) {Char.add(outlaw);}
            if (c == 2) {Char.add(spearman);}
            if (c == 3) {Char.add(XBowMan);} 
            if (c == 4) {Char.add(sniper);}
            if (c == 5) {Char.add(magician);}
            if (c == 6) {Char.add(monk);}            
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Char.get(i).getInfo());
        }
        
    }

    private static String getName() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length -1)]);
        return name;
    }

    
    
}
