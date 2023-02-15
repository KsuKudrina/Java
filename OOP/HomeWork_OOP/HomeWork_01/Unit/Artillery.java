package OOP.HomeWork_OOP.HomeWork_01.Unit;

public class Artillery extends Main_characters {
    /**Артиллерия */

     /**
     * 
     * @param hp
     * @param maxHp
     * @param protection
     * @param damage
     */

    /**доспехи */
    int armor;
    /**оружие */
    int weapon;
    /**меткость */
    int accuracy;
    /**ловкость */
    int dexterity;
    
    /**конструктор */ 
    public Artillery(int hp, int maxHp, int protection, int damage, int attack, int take, 
            int armor, int weapon, int accuracy, int dexterity) {
                
        super(hp, maxHp, protection, damage, attack, take);
        this.armor = armor;
        this.weapon = weapon;
        this.accuracy = accuracy;
        this.dexterity = dexterity;
    }
    
    
    

    
}
