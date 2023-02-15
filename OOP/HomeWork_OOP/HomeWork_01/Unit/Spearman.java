package OOP.HomeWork_OOP.HomeWork_01.Unit;

public class Spearman extends Minor_characters {
    /**Копейщик */

    /**
     * 
     * @param hp
     * @param maxHp
     * @param protection
     * @param damage
     * @param hide
     */
    
    /**удар */
    int hit;

    public Spearman(int hp, int maxHp, int protection, int damage, Object hide, int hit) {

        super(hp, maxHp, protection, damage, hide);
        this.hit = hit;
    }
    
}
