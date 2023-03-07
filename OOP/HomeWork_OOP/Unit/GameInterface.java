package OOP.HomeWork_OOP.Unit;

import java.util.ArrayList;

public interface GameInterface {
    void step(ArrayList<Human> DarkSide, ArrayList<Human> BrightSide);
    
    String getInfo();
}
