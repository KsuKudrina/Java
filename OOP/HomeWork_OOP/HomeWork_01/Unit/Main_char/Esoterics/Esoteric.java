package OOP.HomeWork_OOP.HomeWork_01.Unit.Main_char.Esoterics;

import OOP.HomeWork_OOP.HomeWork_01.Unit.Main_char.Main_characters;

public abstract class Esoteric extends Main_characters {
    /**Эзотерики */

    /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param attack
     */

    /**лечение */
    int treatment;
    
    /**Удар магией */
    int magic;

    String name;


    /**конструктор */
    public Esoteric(int hp, int maxHp, int def, int damage, int attack, int treatment, int magic) {
        
        super(hp, maxHp, def, damage, attack);
        super.treatment = treatment;
        this.magic = magic;
    }
    
    
    
    
}
