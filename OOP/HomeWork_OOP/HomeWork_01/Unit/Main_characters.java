package OOP.HomeWork_OOP.HomeWork_01.Unit;

public class Main_characters extends Characters{
    /**Главные герои */
    
    /**
     * 
     * @param hp
     * @param maxHp
     * @param protection
     * @param damage
     */

    /**атака */
    int attack;
    /**взять оружие */
    Object take;
    
    public Main_characters(int hp, int maxHp, int protection, int damage, int attack, int take) {
        
        super(hp, maxHp, protection, damage);
        this.attack = attack;
        this.take = take;
    }
    

    
}
