package BackEnd.Character.calculators;

import BackEnd.Character.*;
import BackEnd.Character.enums.Class;
import BackEnd.Character.enums.Armor;
import BackEnd.Data.ImportManager;
import BackEnd.Dice;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

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
        health += Dice.getInstance().rollD20();
        stamina += Dice.getInstance().rollD20();
        strength += Dice.getInstance().rollD20();
        intellect += Dice.getInstance().rollD20();
        dex += Dice.getInstance().rollD20();
        //We dont do bonus rolls on speed
        will += Dice.getInstance().rollD6();
        wisdom += Dice.getInstance().rollD6();
        fortitude += Dice.getInstance().rollD6();

        //Starting armor generation switch


        //Starting additional race values
        switch (race)
        {
            case "Human":
                CharacterValueElement human = characterValueList.get(0);
                health += human.getHealth();
                stamina += human.getStamina();
                strength += human.getStrength();
                intellect += human.getIntellect();
                dex += human.getDex();
                will += human.getWill();
                wisdom += human.getWisdom();
                fortitude += human.getFortitude();
                break;

            case "Elven":
                CharacterValueElement elven = characterValueList.get(1);
                health += elven.getHealth();
                stamina += elven.getStamina();
                strength += elven.getStrength();
                intellect += elven.getIntellect();
                dex += elven.getDex();
                will += elven.getWill();
                wisdom += elven.getWisdom();
                fortitude += elven.getFortitude();
                break;

            case "Orc":
                CharacterValueElement orc = characterValueList.get(2);
                health += orc.getHealth();
                stamina += orc.getStamina();
                strength += orc.getStrength();
                intellect += orc.getIntellect();
                dex += orc.getDex();
                will += orc.getWill();
                wisdom += orc.getWisdom();
                fortitude += orc.getFortitude();
                break;

            case "Dryads":
                CharacterValueElement dryad = characterValueList.get(3);
                health += dryad.getHealth();
                stamina += dryad.getStamina();
                strength += dryad.getStrength();
                intellect += dryad.getIntellect();
                dex += dryad.getDex();
                will += dryad.getWill();
                wisdom += dryad.getWisdom();
                fortitude += dryad.getFortitude();
                break;

            case "Lizard Folk":
                CharacterValueElement lizardFolk = characterValueList.get(4);
                health += lizardFolk.getHealth();
                stamina += lizardFolk.getStamina();
                strength += lizardFolk.getStrength();
                intellect += lizardFolk.getIntellect();
                dex += lizardFolk.getDex();
                will += lizardFolk.getWill();
                wisdom += lizardFolk.getWisdom();
                fortitude += lizardFolk.getFortitude();
                break;

            case "Goblin":
                CharacterValueElement goblin = characterValueList.get(5);
                health += goblin.getHealth();
                stamina += goblin.getStamina();
                strength += goblin.getStrength();
                intellect += goblin.getIntellect();
                dex += goblin.getDex();
                will += goblin.getWill();
                wisdom += goblin.getWisdom();
                fortitude += goblin.getFortitude();
                break;
        }

        //starting the additional class values
        switch (aClass)
        {
            //TODO implement class values
        }

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
