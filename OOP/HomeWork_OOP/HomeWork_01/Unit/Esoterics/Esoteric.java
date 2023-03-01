package OOP.HomeWork_OOP.HomeWork_01.Unit.Esoterics;

import java.util.ArrayList;

import OOP.HomeWork_OOP.HomeWork_01.Unit.Characters;
import OOP.HomeWork_OOP.HomeWork_01.Unit.Vector2D;

public abstract class Esoteric extends Characters {
    /**Эзотерики */

    /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param attack
     * @param speed
     */

    // /**лечение */
    // int treatment;
    
    /**Удар магией */
    int magic;

    /**конструктор */

    public Esoteric(int x, int y, int hp, int maxHp, int def, int attack, int speed, int magic) {
        super(x, y, hp, maxHp, def, attack, speed);
        this.magic = magic;
    }

    @Override
    public void step(ArrayList<Characters> team1, ArrayList<Characters> team2) {
        if(state.equals("Die")) return;
        int index = super.Wounded(team1);
        team1.get(index).getDamage(damage[0]);
    }
}
