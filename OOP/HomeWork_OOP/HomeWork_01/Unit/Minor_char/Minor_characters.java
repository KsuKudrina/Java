package OOP.HomeWork_OOP.HomeWork_01.Unit.Minor_char;

import OOP.HomeWork_OOP.HomeWork_01.Unit.Characters;

public abstract class Minor_characters extends Characters {
    /**Второстепенные персонажи */
    
    /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     */
    /**прятаться */
    Object hide;

    /**удар */
    int hit;

    String name;

    public Minor_characters(int hp, int maxHp, int def, int damage, Object hide, int hit) {
        
        super(hp, maxHp, def, damage);
        this.hide = hide;
        this.hit = hit;
    }
    
}
