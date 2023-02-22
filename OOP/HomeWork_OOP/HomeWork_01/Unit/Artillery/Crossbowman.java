package OOP.HomeWork_OOP.HomeWork_01.Unit.Artillery;

public class Crossbowman extends Artillery {
    /**Арбалетчик */
    /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param attack
     * @param speed
     * @param shots
     * @param maxShots
     */
    
    
    public Crossbowman(int hp, int maxHp, int def, int damage, int attack,int speed, int shots, int maxShots) {
        super(hp, maxHp, def, damage, attack, speed, shots, maxShots);
    }

    public Crossbowman(String name){
        super(10, 10, 3, 2, 6, 4, 16, 16);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Я Арбалетчик" + " %s  / Hp: %d Speed: %d", name, hp, speed);
    }
    
    @Override
    public void step() {
        super.step();
    }
}
