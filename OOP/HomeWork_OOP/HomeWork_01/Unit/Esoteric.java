package OOP.HomeWork_OOP.HomeWork_01.Unit;

public class Esoteric extends Main_characters {
    /**Эзотерики */

    /**
     * 
     * @param hp
     * @param maxHp
     * @param protection
     * @param damage
     * @param attack
     * @param take
     */

    /**лечение */
    int treatment;

    /**конструктор */
    public Esoteric(int hp, int maxHp, int protection, int damage, int attack, int take, int treatment) {
        
        super(hp, maxHp, protection, damage, attack, take);
        this.treatment = treatment;
    }
    
    
    
    
}
