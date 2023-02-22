package OOP.HomeWork_OOP.HomeWork_01;

import java.lang.foreign.Addressable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import OOP.HomeWork_OOP.HomeWork_01.Unit.Characters;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Names;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Outlaw;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Peasant;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Spearman;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Artillery.Crossbowman;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Artillery.Sniper;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Esoterics.Magician;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Esoterics.Monk;

public class Main {
    public static void main(String[] args) {
        
        Peasant peasant = new Peasant(getName());

        Outlaw outlaw = new Outlaw(getName());
        
        Spearman spearman = new Spearman(getName());
        
        Sniper sniper = new Sniper(getName());
        
        Crossbowman XBowMan = new Crossbowman(getName());
        
        Magician magician = new Magician(getName());
        
        Monk monk = new Monk(getName());

        Random rnd = new Random();

        ArrayList<Characters> team1 = new ArrayList<>();
        System.out.println("Команда 1");
        

        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(4);
            switch (val) {
                case 0:
                    team1.add(new Peasant(getName()));
                    break;
                case 1:
                    team1.add(new Sniper(getName()));
                    break;
                case 2:
                    team1.add(new Magician(getName()));
                    break;
                case 3:
                    team1.add(new Outlaw(getName()));
                    break;
                default:
                    break;
            }
            // team1.sort(new Comparator<Characters>() {
            //     @Override
            //     public int compare(Characters o1, Characters o2){
            //         return o2.getSpeed() - o1.getSpeed();
            //     }
            // });
            System.out.println(team1.get(i).getInfo());
        }
        
        ArrayList<Characters> team2 = new ArrayList<>();
        System.out.println("Команда 2");
        
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(4);
            switch (val) {
                case 0:
                    team2.add(new Peasant(getName()));
                    break;
                case 1:
                    team2.add(new Crossbowman(getName()));
                    break;
                case 2:
                    team2.add(new Monk(getName()));
                    break;
                case 3:
                    team2.add(new Spearman(getName()));
                    break;
                default:
                    break;
            }
            // team2.sort(new Comparator<Characters>() {
            //     @Override
            //     public int compare(Characters o1, Characters o2){
            //         return o2.getSpeed() - o1.getSpeed();
            //     }
            // });
            System.out.println(team2.get(i).getInfo());
        }

        ArrayList<Characters> list = new ArrayList<>(team1);
        for (int i = 0; i < team2.size(); i++) {
            list.add(team2.get(i));
        }
        list.sort(new Comparator<Characters>() {
            @Override
            public int compare(Characters o1, Characters o2){
                if (o2.getSpeed() == o1.getSpeed()){
                    return (o2.getHp() - o1.getHp());
                }
                return o2.getSpeed() - o1.getSpeed();
            }
        });
        System.out.println(list.toString()); 

        // ArrayList <Characters> Char = new ArrayList<>();
        // for (int i = 0; i < 10; i++) {
        //     int c = rnd.nextInt(7);
        //     if (c == 0) {Char.add(peasant);}
        //     if (c == 1) {Char.add(outlaw);}
        //     if (c == 2) {Char.add(spearman);}
        //     if (c == 3) {Char.add(XBowMan);} 
        //     if (c == 4) {Char.add(sniper);}
        //     if (c == 5) {Char.add(magician);}
        //     if (c == 6) {Char.add(monk);}            
        // }
        // for (int i = 0; i < 10; i++) {
        //     System.out.println(Char.get(i).getInfo());
        // }
    }

    private static String getName() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length -1)]);
        return name;
    }

    
    
}
