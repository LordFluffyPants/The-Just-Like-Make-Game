package BackEnd.Character.calculators;

import BackEnd.Character.enums.Class;
import BackEnd.Character.enums.Armor;

/**
 * Created by Jake on 6/19/2015.
 */
public class CalculateValues {

    private int health, stamina, strength,intellect,dex, speed, will, wisdom, fortitude, armor;

    public CalculateValues()
    {
        health = 10;
        stamina = 15;
        strength = 3;
        intellect = 3;
        dex = 3;
        speed = 0;
        will = 0;
        wisdom = 0;
        fortitude = 0;
        armor = 0;

    }

    public int getHealth()
    {
        return health;
    }

    public int getArmor() {
        return armor;
    }

    public int getDex() {
        return dex;
    }

    public int getFortitude() {
        return fortitude;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStamina() {
        return stamina;
    }

    public int getStrength() {
        return strength;
    }

    public int getWill() {
        return will;
    }

    public int getWisdom() {
        return wisdom;
    }

}
