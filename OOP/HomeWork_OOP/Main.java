package OOP.HomeWork_OOP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import OOP.HomeWork_OOP.Unit.Names;
import OOP.HomeWork_OOP.Unit.Outlaw;
import OOP.HomeWork_OOP.Unit.Peasant;
import OOP.HomeWork_OOP.Unit.Sniper;
import OOP.HomeWork_OOP.Unit.Spearman;
import OOP.HomeWork_OOP.Unit.Vector2D;
import OOP.HomeWork_OOP.Unit.Crossbowman;
import OOP.HomeWork_OOP.Unit.Human;
import OOP.HomeWork_OOP.Unit.Magician;
import OOP.HomeWork_OOP.Unit.Monk;

public class Main {
    static final int UNITS = 10;
    public static ArrayList<Human> DarkSide = new ArrayList<>();
    public static ArrayList<Human> BrightSide = new ArrayList<>();
    public static ArrayList<Human> Team = new ArrayList<>();
    public static void main(String[] args) { 
        
        createDark(DarkSide);
        createBright(BrightSide);
        Team.addAll(DarkSide);
        Team.addAll(BrightSide);

        Team.sort(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2){
                if (o2.getSpeed() == o1.getSpeed()){
                    return (o2.getHp() - o1.getHp());
                }
                return o2.getSpeed() - o1.getSpeed();
            }
        }); 

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Press Enter to begin. ");
        sc.nextLine();
        while (true){
            View.view();
            sc.nextLine();
            for (Human hero : Team) {
                if (BrightSide.contains(hero)) hero.step(BrightSide, DarkSide);
                else hero.step(DarkSide, BrightSide);
                
            }
        }
        
    }
    static void createDark (ArrayList<Human> team){
        Random rnd = new Random();
        for (int i = 1; i <= UNITS; i++) {
            int val = rnd.nextInt(1, 5);
            switch (val) {
                case 1:
                    DarkSide.add(new Peasant(getName(), new Vector2D(i, 1)));
                    break;
                case 2:
                    DarkSide.add(new Sniper(getName(), new Vector2D(i, 1)));
                    break;
                case 3:
                    DarkSide.add(new Magician(getName(), new Vector2D(i, 1)));
                    break;
                case 4:
                    DarkSide.add(new Outlaw(getName(), new Vector2D(i, 1)));
                    break;
                default:
                    break;
            }
        }
    }
    static void createBright (ArrayList<Human> team){
        Random rnd = new Random();

        for (int i = 1; i <= UNITS; i++) {
            int val = rnd.nextInt(5, 9);
            switch (val) {
                case 5:
                    BrightSide.add(new Peasant(getName(), new Vector2D(i, 10)));
                    break;
                case 6:
                    BrightSide.add(new Crossbowman(getName(), new Vector2D(i, 10)));
                    break;
                case 7:
                    BrightSide.add(new Monk(getName(), new Vector2D(i, 10)));
                    break;
                case 8:
                    BrightSide.add(new Spearman(getName(), new Vector2D(i, 10)));
                    break;
                default:
                    break;
            }
        }
    }

    private static String getName() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length -1)]);
        return name;
    }
}
