package OOP.HomeWork_OOP.HomeWork_01.Unit.Artillery;

import java.util.ArrayList;

import OOP.HomeWork_OOP.HomeWork_01.Unit.Characters;

public class Crossbowman extends Artillery {
    /**Арбалетчик */
    /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param attack
     * @param speed
     * @param shots
     * @param maxShots
     */
    
    
    public Crossbowman(int x, int y, int hp, int maxHp, int def, int damage, int attack,int speed, int shots, int maxShots) {
        super(x, y, hp, maxHp, def,  attack, speed, shots, maxShots);
    }

    public Crossbowman(String name, int x, int y){
        super(1, 1, 10, 10, 3, 6, 4, 16, 16);
        super.name = name;
        this.damage = new int[]{2, 3};
    }

    @Override
    public String getInfo() {
        return String.format("Я Арбалетчик" + " %s  / Hp: %d Speed: %d", name, hp, speed);
    }

    // @Override
    // public void step(ArrayList<Characters> DarkSide, ArrayList<Characters> BrightSide) {
    //     if(hp == 0)
    // }
    
}
