package OOP.HomeWork_OOP.HomeWork_01.Unit.Esoterics;

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

    // String name;

    /**конструктор */

    public Esoteric(int x, int y, int hp, int maxHp, int def, int attack, int speed, int magic) {
        super(x, y, hp, maxHp, def, attack, speed);
        this.magic = magic;
    }
        
}
