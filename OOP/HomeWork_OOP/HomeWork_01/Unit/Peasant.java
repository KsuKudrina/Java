package OOP.HomeWork_OOP.HomeWork_01.Unit;

public class Peasant extends Minor_characters{
    /**Фермер */

    /**кормить (+10 hp) */
    int feed;
    /**принести оружие */
    int supply;
    /**
     * 
     * @param hp
     * @param maxHp
     * @param protection
     * @param damage
     * @param hide
     */

    /**конструктор */
    public Peasant(int hp, int maxHp, int protection, int damage, Object hide, int feed, int supply) {
        
        super(hp, maxHp, protection, damage, hide);
        this.feed = feed;
        this.supply = supply;
    }
}
