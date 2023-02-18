package OOP.HomeWork_OOP.HomeWork_01.Unit.Main_char.Artillery;

public class Crossbowman extends Artillery {
    /**Арбалетчик */
    /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param attack
     * @param shots
     * @param maxShots
     * @param accuracy
     */
    
    
    public Crossbowman(int hp, int maxHp, int def, int damage, int attack, int shots, int maxShots, int accuracy) {
        super(hp, maxHp, def, damage, attack, shots, maxShots, accuracy);
    }

    public Crossbowman(String name){
        super(150, 150, 3, 12, 5, 30,  30, 3);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Я Арбалетчик" + " %s  / Hp: %d Shots: %d", name, hp, shots);
    }
    
    @Override
    public void step() {
        super.step();
    }
}
