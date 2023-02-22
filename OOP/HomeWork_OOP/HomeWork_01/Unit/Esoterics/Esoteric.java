package OOP.HomeWork_OOP.HomeWork_01.Unit.Esoterics;

import OOP.HomeWork_OOP.HomeWork_01.Unit.Characters;

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
    // /**лечение */
    // int treatment;
    
    /**Удар магией */
    int magic;

    String name;


    /**конструктор */
    public Esoteric(int hp, int maxHp, int def, int damage, int attack, int speed, int magic) {
        
        super(hp, maxHp, def, damage, attack, speed);
        // this.treatment = treatment;
        this.magic = magic;
    }
    
    
    
    
}
