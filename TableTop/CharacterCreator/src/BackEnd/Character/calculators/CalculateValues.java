package BackEnd.Character.calculators;

import BackEnd.Character.*;
import BackEnd.Data.ImportManager;
import BackEnd.Dice;

import java.util.List;

/**
 * Created by Jake on 6/19/2015.
 */
public class CalculateValues {

    private int health, stamina, strength,intellect,dex, speed, will, wisdom, fortitude, armor;
    private List<CharacterValueElement> characterValueList = ImportManager.getInstance().getCharacterList();
    private List<ClassValueElement> classValueList = ImportManager.getInstance().getClassList();
    private List<ArmorValueElement> armorValueList = ImportManager.getInstance().getArmorList();
    public CalculateValues(String race, String aClass, String armor)
    {
        //These are the base stats to calculate the dice roll values
        health = 10;
        stamina = 15;
        strength = 3;
        intellect = 3;
        dex = 3;
        speed = 0;
        will = 0;
        wisdom = 0;
        fortitude = 0;
        this.armor = 0;
        generateValues(race, aClass, armor);

    }

    private void generateValues(String race, String aClass, String armor)
    {
//        health += Dice.getInstance().rollD20();
//        stamina += Dice.getInstance().rollD20();
//        strength += Dice.getInstance().rollD20();
//        intellect += Dice.getInstance().rollD20();
//        dex += Dice.getInstance().rollD20();
//        //We dont do bonus rolls on speed
//        will += Dice.getInstance().rollD6();
//        wisdom += Dice.getInstance().rollD6();
//        fortitude += Dice.getInstance().rollD6();

        //Starting armor generation switch

        //Starting additional race values
        switch (race)
        {
            case "Human":
                calculateAllRaceStats(characterValueList.get(0));
                break;

            case "Elven":
                calculateAllRaceStats(characterValueList.get(1));
                break;

            case "Orc":
                calculateAllRaceStats(characterValueList.get(2));
                break;

            case "Dryads":
                calculateAllRaceStats(characterValueList.get(3));
                break;

            case "Lizard Folk":
                calculateAllRaceStats(characterValueList.get(4));
                break;

            case "Goblin":
                calculateAllRaceStats(characterValueList.get(5));
                break;
        }

        //starting the additional class values
        switch (aClass)
        {
            case "Berserker":
                calculateAllClassStats(classValueList.get(0));
                break;
            case "Inquisitor":
                calculateAllClassStats(classValueList.get(1));
                break;
            case "Engineer":
                calculateAllClassStats(classValueList.get(2));
                break;
            case "Cabalist":
                calculateAllClassStats(classValueList.get(3));
                break;
            case "Illusionist":
                calculateAllClassStats(classValueList.get(4));
                break;
            case "Fencer":
                calculateAllClassStats(classValueList.get(5));
                break;
            case "Shaman":
                calculateAllClassStats(classValueList.get(6));
                break;
            case "Vagabond":
                calculateAllClassStats(classValueList.get(7));
                break;
            case "Necromancer":
                calculateAllClassStats(classValueList.get(8));
                break;
            case "Scout":
                calculateAllClassStats(classValueList.get(9));
                break;
        }

    }

    public void calculateAllRaceStats(CharacterValueElement element)
    {
        health += element.getHealth();
        stamina += element.getStamina();
        strength += element.getStrength();
        intellect += element.getIntellect();
        dex += element.getDex();
        speed += element.getSpeed();
        will += element.getWill();
        wisdom += element.getWisdom();
        fortitude += element.getFortitude();
    }

    public void calculateAllClassStats(ClassValueElement element)
    {
        health += element.getHealth();
        stamina += element.getStamina();
        strength += element.getStrength();
        intellect += element.getIntellect();
        dex += element.getDex();
        speed += element.getSpeed();
        will += element.getWill();
        wisdom += element.getWisdom();
        fortitude += element.getFortitude();
    }

    public void calculateAllArmorStats(ArmorValueElement element)
    {
        armor += element.getArmorValue();
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
