package OOP.HomeWork_OOP.HomeWork_01.Unit.Main_char.Artillery;

import OOP.HomeWork_OOP.HomeWork_01.Unit.Main_char.Main_characters;

public abstract class Artillery extends Main_characters {
    /**Артиллерия */

     /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param attack
     */

    /**боеприпасы(патроны, стрелы) */ 
    protected int shots;

    /**максимальное кол-во боеприпасов */
    protected int maxShots;

    /**доспехи */
    protected int armor;  //метод добавляет + 2 к защите
    
    /**меткость */
    protected int accuracy;

    protected String name;
    
    
    /**конструктор */ 
    public Artillery(int hp, int maxHp, int def, int damage, int attack, int shots, int maxShots, int accuracy) {
                
        super(hp, maxHp, def, damage, attack);
        this.shots = shots;
        this.maxShots = maxShots;
        this.accuracy = accuracy;
    }
    
    // public int getArmor() {
    //     return armor;
    // }
    
    

    
}
