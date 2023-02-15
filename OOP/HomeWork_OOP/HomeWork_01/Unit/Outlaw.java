package OOP.HomeWork_OOP.HomeWork_01.Unit;

public class Outlaw extends Minor_characters {
    /**Разбойник */
    
    /**
     * 
     * @param hp
     * @param maxHp
     * @param protection
     * @param damage
     * @param hide
     */

    /**украсть */
    int steal;

    public Outlaw(int hp, int maxHp, int protection, int damage, Object hide, int steal) {
        
        super(hp, maxHp, protection, damage, hide);
        this.steal = steal;
    }
    
}
