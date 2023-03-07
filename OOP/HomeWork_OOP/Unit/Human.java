package OOP.HomeWork_OOP.Unit;

import java.util.ArrayList;

public class Human implements GameInterface {
    /**здоровье персонажа */
    protected int hp;
    /**максимальное здоровье */
    protected int maxHp;
    /**защита */
    public int def;
    /**урон */
    protected int[] damage;
    /**атака */
    protected int attack;
    /**скорость */
    protected int speed;

    protected Vector2D pos;

    protected String state;

    protected String name;

    protected static int heroCnt;

    public int[] getCoords() {return new int[]{pos.x, pos.y};}

    /**конструктор */

    public Human(int x, int y, int hp, int maxHp, int def, int attack, int speed) {
        pos = new Vector2D(x, y);
        this.hp = hp;
        this.maxHp = maxHp;
        this.def = def;
        this.attack = attack;
        this.speed = speed;
        state = "Stand";
        heroCnt++;
    }

    public void setHp(int hp) {
        if (hp >= 0)
            this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    /**найти ближайшего */
    protected int Nearest(ArrayList<Human> side){
        double min = 100;
        int index = 0;
        for (int i = 0; i < side.size(); i++) {
            if (min > pos.getDistans(side.get(i).pos) & !side.get(i).state.equals("Die") ) {
                index = i;
                min = pos.getDistans(side.get(i).pos);
            }
        }
        return index;
    }


    public void getDamage(int damage) {
       hp -= damage;
       if (hp > maxHp) hp = maxHp;
       if (hp <= 0){
        hp = 0;
        state = "Die";
       } 
    }
   
    /**
     * @param DarkSide
     * @param BrightSide
     */
    @Override
    public void step(ArrayList<Human> DarkSide, ArrayList<Human> BrightSide) {}

    @Override
    public String getInfo() {
        return "Я человек!";
    }

    public int getSpeed() {
        return speed;
    }
    // @Override
    // public String toString() {
    //     return String.format("%s",getInfo());
    // }

    @Override
    public String toString() {
        return  getInfo() + " " + 
                name +
                " H:" + Math.round(hp) +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damage[0] + damage[1])/2)) +
                " " + state;
    }
    public String getS() {
        return String.format("%s %s  Hp: %d  State: %s",
                this.getInfo(), this.name, this.hp, this.state);
    }
    
    
      // public int Attack(){
    //     this.hp -= (int)(damage * 0.8);
    //     if (hp < 0) return 0;
    //     else return damage;
    // }

    // public void Heal(int Hp){
    //     this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    // }

    // public void GetDamage(int damage) {
    //     if (this.hp - damage > 0) {
    //         this.hp -= damage;
    //     }
    // }

}
