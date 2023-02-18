package OOP.HomeWork_OOP.HomeWork_01.Unit.Main_char;

import OOP.HomeWork_OOP.HomeWork_01.Unit.Characters;

public abstract class Main_characters extends Characters{
    /**Главные герои */
    
    /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     */

    /**атака */
    int attack;

    /**взять оружие */
    Object take; //метод

    public int treatment;
    
    public Main_characters(int hp, int maxHp, int def, int damage, int attack) {
        
        super(hp, maxHp, def, damage);
        this.attack = attack;
    }
    
    // public Object getTake() {
    //     return take;
    // }

    
}
