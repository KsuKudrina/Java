package OOP.HomeWork_OOP.HomeWork_01.Unit;

public class Minor_characters extends Characters {
    /**Второстепенные персонажи */
    
    /**
     * 
     * @param hp
     * @param maxHp
     * @param protection
     * @param damage
     */
    /**прятаться */
    Object hide;

    public Minor_characters(int hp, int maxHp, int protection, int damage, Object hide) {
        
        super(hp, maxHp, protection, damage);
        this.hide = hide;
    }
    
}
