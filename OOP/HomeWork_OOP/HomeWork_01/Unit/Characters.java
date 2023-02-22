package OOP.HomeWork_OOP.HomeWork_01.Unit;

import java.util.Vector;

public class Characters implements GameInterface {
    /**здоровье персонажа */
    protected int hp;
    /**максимальное здоровье */
    protected int maxHp;
    /**защита */
    protected int def;
    /**урон */
    protected int damage;
    /**атака */
    protected int attack;
    /**скорость */
    protected int speed;

    String name;

    /**конструктор */
   
    public Characters(int hp, int maxHp, int def, int damage, int attack, int speed){
        this.hp = hp;
        this.maxHp = maxHp;
        this.def = def;
        this.damage = damage;
        this.attack = attack;
        this.speed = speed;
    }

    public void setHp(int hp) {
        if (hp >= 0)
            this.hp = hp;
    }

    public int getHp() {
        return hp;
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

    @Override
    public void step() {   
    }

    @Override
    public String getInfo() {
        return "Я человек!";
    }

    public int getSpeed() {
        return speed;
    }
    @Override
    public String toString() {
        
        return String.format("%s",getInfo());
    }

}
