package OOP.HomeWork_OOP.HomeWork_01.Unit;

public class Spearman extends Characters {
    /**Копейщик */

    /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param attack
     * @param speed
     */

    public Spearman (String name, int x, int y){
        super(1, 1, 10, 10, 5, 4, 4);
        super.name = name;
        this.damage = new int[]{1, 3};
    }

    @Override
    public String getInfo() {
        return String.format("Я Копейщик" + " %s  / Hp: %d  Speed: %d ", name, hp, speed);
    }
}
