package OOP.HomeWork_OOP.HomeWork_01.Unit;

public class Magician extends Esoteric {
    /**Колдун */

    /**
     * 
     * @param hp
     * @param maxHp
     * @param protection
     * @param damage
     * @param attack
     * @param take
     * @param treatment
     */

    /**заколдовать */
    int magic;

    public Magician(int hp, int maxHp, int protection, int damage, int attack, int take, 
            int treatment, int magic) {

        super(hp, maxHp, protection, damage, attack, take, treatment);
        this.magic = magic;
    }
    
}
