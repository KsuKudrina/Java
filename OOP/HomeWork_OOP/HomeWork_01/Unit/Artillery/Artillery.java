package OOP.HomeWork_OOP.HomeWork_01.Unit.Artillery;

import OOP.HomeWork_OOP.HomeWork_01.Unit.Characters;

public abstract class Artillery extends Characters {
    /**Артиллерия */

     /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param attack
     */

    /**выстрелы */ 
    protected int shots;

    /**максимальное кол-во выстрелов */
    protected int maxShots;

    // /**доспехи */
    // protected int armor;  //метод добавляет + 2 к защите
    
    // /**меткость */
    // protected int accuracy;

    protected String name;
    
    
    /**конструктор */ 
    public Artillery(int hp, int maxHp, int def, int damage, int attack, int speed, int shots, int maxShots) {
                
        super(hp, maxHp, def, damage, attack, speed);
        this.shots = shots;
        this.maxShots = maxShots;
    }
    
    // public int getArmor() {
    //     return armor;
    // }
    
    

    
}
