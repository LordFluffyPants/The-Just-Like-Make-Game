package BackEnd.Character;

import BackEnd.Character.calculators.CalculateValues;

/**
 * Created by Jake on 6/27/2015.
 */
public class Character {

    private int health, stamina, strength,intellect,dex, speed, will, wisdom, fortitude, armorValue;
    private String race, aClass, armor;

    public Character(String race, String aClass, String armor)
    {
        this.race = race;
        this.aClass = aClass;
        this.armor = armor;
        calculateValues();
    }

    public Character()
    {
        race = "Human";
        aClass = "Berserker";
        armor = "Simple Armor";
        calculateValues();

    }

    private void calculateValues()
    {
        CalculateValues calculator = new CalculateValues(race,aClass,armor);
        health = calculator.getHealth();
        stamina = calculator.getStamina();
        strength = calculator.getStrength();
        intellect = calculator.getIntellect();
        dex = calculator.getDex();
        speed = calculator.getSpeed();
        will = calculator.getWill();
        wisdom = calculator.getWisdom();
        fortitude = calculator.getFortitude();
        armorValue = calculator.getArmor();
    }

    public void reCalculateValues()
    {
        calculateValues();
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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

    public String getaClass() {
        return aClass;
    }

    public void setaClass(String aClass) {
        this.aClass = aClass;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }
}
