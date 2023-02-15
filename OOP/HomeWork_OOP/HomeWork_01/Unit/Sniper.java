package OOP.HomeWork_OOP.HomeWork_01.Unit;

public class Sniper extends Artillery {
    /**Снайпер */

    /**
     * @param hp
     * @param maxHp
     * @param protection
     * @param damage
     * @param attack
     * @param take
     * @param armor
     * @param weapon
     * @param accuracy
     * @param dexterity
     */

    /**замирание */
    Object motionless;
    /**приблизить цель */
    Object aim;
    
    public Sniper(int hp, int maxHp, int protection, int damage, int attack, int take,
            int armor, int weapon, int accuracy, int dexterity, int motionless, int aim) {
                
        super(hp, maxHp, protection, damage, attack, take, armor, weapon, accuracy, dexterity);
        this.motionless = motionless;
        this.aim = aim;
    }

    

}
