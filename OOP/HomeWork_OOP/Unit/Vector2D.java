package OOP.HomeWork_OOP.Unit;

import java.lang.Math;
import java.util.ArrayList;

public class Vector2D {
    protected int x;
    protected int y;

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**расстояние */
    public double getDistans(Vector2D coord){
        return Math.sqrt((Math.pow(x - coord.x, 2)) + Math.pow(y - coord.y, 2));
    }

    public boolean getLeft(Vector2D coord) {
        return coord.x < x;
    }

    public boolean getDown(Vector2D coord) {
        return coord.y < y;
    }

    public boolean getEmpty(ArrayList<Human> team, int x, int y) {
        boolean bool = true;
        for (Human human : team) {
            if (human.pos.x == x & human.pos.y == y){
            bool = false;
            break;
            }
        }
        return bool;
    }
}
