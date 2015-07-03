package BackEnd.Character;

import BackEnd.Character.enums.*;
import BackEnd.Character.enums.Class;

/**
 * Created by Jake on 6/27/2015.
 */
public class Character {

    private int health, stamina, strength,intellect,dex, speed, will, wisdom, fortitude, armorValue;

    private String race;
    private Subrace subrace;
    private BackEnd.Character.enums.Class aClass;
    private Armor armor; //May not need an armor enum but would need an armor class

    public Character(String race, Subrace subrace, Class aClass, Armor armor)
    {
        this.race = race;
        this.subrace = subrace;
        this.aClass = aClass;
        this.armor = armor;
        health = 10;
        stamina = 15;
        strength = 3;
        intellect = 3;
        dex = 3;
        speed = 0;
        will = 0;
        wisdom = 0;
        fortitude = 0;
        armorValue = 0;


    }

    public void calculateValues()
    {

    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWill() {
        return will;
    }

    public void setWill(int will) {
        this.will = will;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getFortitude() {
        return fortitude;
    }

    public void setFortitude(int fortitude) {
        this.fortitude = fortitude;
    }

    public int getArmorValue() {
        return armorValue;
    }

    public void setArmorValue(int armorValue) {
        this.armorValue = armorValue;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Subrace getSubrace() {
        return subrace;
    }

    public void setSubrace(Subrace subrace) {
        this.subrace = subrace;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
