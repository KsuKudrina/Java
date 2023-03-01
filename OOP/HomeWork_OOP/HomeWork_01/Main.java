package OOP.HomeWork_OOP.HomeWork_01;

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

        Random rnd = new Random();

        ArrayList<Characters> DarkSide = new ArrayList<>();
        System.out.println("------------Темная сторона------------");

        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(4);
            switch (val) {
                case 0:
                    DarkSide.add(new Peasant(getName(), 1, 1));
                    break;
                case 1:
                    DarkSide.add(new Sniper(getName(), 1, 1));
                    break;
                case 2:
                    DarkSide.add(new Magician(getName(), 1, 1));
                    break;
                case 3:
                    DarkSide.add(new Outlaw(getName(), 1, 1));
                    break;
                default:
                    break;
            }
            System.out.println(DarkSide.get(i).getInfo());
        }
        
        ArrayList<Characters> BrightSide = new ArrayList<>();
        System.out.println("------------Светлая сторона------------");
        
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(4);
            switch (val) {
                case 0:
                    BrightSide.add(new Peasant(getName(), 1, 1));
                    break;
                case 1:
                    BrightSide.add(new Crossbowman(getName(), 1, 1));
                    break;
                case 2:
                    BrightSide.add(new Monk(getName(), 1, 1));
                    break;
                case 3:
                    BrightSide.add(new Spearman(getName(), 1, 1));
                    break;
                default:
                    break;
            }
            System.out.println(BrightSide.get(i).getInfo());
        }

        ArrayList<Characters> list = new ArrayList<>(DarkSide);
        for (int i = 0; i < BrightSide.size(); i++) {
            list.add(BrightSide.get(i));
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
        // System.out.println(list.toString()); 

        for (Characters hero : list) {
            if (DarkSide.contains(hero)) hero.step(DarkSide, BrightSide);
            else hero.step(BrightSide, DarkSide);
        }
    }

    private static String getName() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length -1)]);
        return name;
    }
}
