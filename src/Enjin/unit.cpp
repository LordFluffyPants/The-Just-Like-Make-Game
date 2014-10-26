/*
 * unit.cpp
 *
 *  Created on: Oct 15, 2014
 *  Author: Jake Hayhurst
 *  Version: 0.0
 */

#include "unit.h"
using namespace std;
using namespace unit;


/**
* calculates the units name based on the unit type and the race of the unit
* passed in and returns that name.
*
*/
string unit::createUnitName(enum UNIT_TYPE unittype, enum RACE race){
    if (unittype == STANDARD_INFANTRY){
        if (race == HUMAN){
            return "Infanterie";
        }
        else if (race == ORC){

        }
        else if (race == ELF){

        }
        else if (race == DRYAD){

        }
        else if (race == LIZARD_FOLK){

        }
        else if (race == GOBLIN){

        }
    }
    else if (unittype == HEAVY_INFANTRY){
        if(race == HUMAN){
            return "Pekhota";
        }
        else if (race == ORC){

        }
        else if (race == ELF){

        }
        else if (race == DRYAD){

        }
        else if (race == LIZARD_FOLK){

        }
        else if (race == GOBLIN){

        }
    }
    else if (unittype == INFANTRY_RACE_UNIT){
        if(race == HUMAN){
            return "Battalion";
        }
        else if (race == ORC){
            return "Berserkers";
        }
        else if (race == ELF){
            return "Mana Addict";
        }
        else if (race == DRYAD){
            return "Fel Touched";
        }
        else if (race == LIZARD_FOLK){
            return "Chameleon Assassins";
        }
        else if (race == GOBLIN){
            return "Techies";
        }
    }
    else if (unittype == SMALL_VEHICLE){
        if(race == HUMAN){

        }
        else if (race == ORC){

        }
        else if (race == ELF){

        }
        else if (race == DRYAD){

        }
        else if (race == LIZARD_FOLK){

        }
        else if (race == GOBLIN){

        }
    }
    else if (unittype == MEDIUM_VEHICLE){
        if(race == HUMAN){

        }
        else if (race == ORC){

        }
        else if (race == ELF){

        }
        else if (race == DRYAD){

        }
        else if (race == LIZARD_FOLK){

        }
        else if (race == GOBLIN){

        }
    }
    else if (unittype == LARGE_VEHICLE){
        if(race == HUMAN){

        }
        else if (race == ORC){

        }
        else if (race == ELF){

        }
        else if (race == DRYAD){

        }
        else if (race == LIZARD_FOLK){

        }
        else if (race == GOBLIN){

        }
    }
    else if (unittype == RACE_VEHICLE){
        if(race == HUMAN){

        }
        else if (race == ORC){

        }
        else if (race == ELF){

        }
        else if (race == DRYAD){

        }
        else if (race == LIZARD_FOLK){

        }
        else if (race == GOBLIN){

        }
    }
    else if (unittype == SMALL_AIR){
        if(race == HUMAN){

        }
        else if (race == ORC){

        }
        else if (race == ELF){

        }
        else if (race == DRYAD){

        }
        else if (race == LIZARD_FOLK){

        }
        else if (race == GOBLIN){

        }
    }
    else if (unittype == MEDIUM_AIR){
        if(race == HUMAN){

        }
        else if (race == ORC){

        }
        else if (race == ELF){

        }
        else if (race == DRYAD){

        }
        else if (race == LIZARD_FOLK){

        }
        else if (race == GOBLIN){

        }
    }
    else if (unittype == LARGE_AIR){
        if(race == HUMAN){

        }
        else if (race == ORC){

        }
        else if (race == ELF){

        }
        else if (race == DRYAD){

        }
        else if (race == LIZARD_FOLK){

        }
        else if (race == GOBLIN){

        }
    }
    else if (unittype == RACE_AIR){
        if(race == HUMAN){

        }
        else if (race == ORC){

        }
        else if (race == ELF){

        }
        else if (race == DRYAD){

        }
        else if (race == LIZARD_FOLK){

        }
        else if (race == GOBLIN){

        }
    }
    else if (unittype == ULTIMATE_RACE_UNIT){
        if(race == HUMAN){
            return "Humanity's Last Hope";
        }
        else if (race == ORC){
            return "The War Machine";
        }
        else if (race == ELF){
            return "Fel Deamon";
        }
        else if (race == DRYAD){
            return "Treant of War";
        }
        else if (race == LIZARD_FOLK){
            return "Dragon";
        }
        else if (race == GOBLIN){
            return "Crystalline Construct ";
        }
    }
}

/**
* Calculates the health values initially for when a new unit is created
*/
int unit::calculateHealthValues (enum UNIT_TYPE unit_type,enum RACE race1) {
    if (unit_type == STANDARD_INFANTRY){

    }
    else if (unit_type == HEAVY_INFANTRY){

    }
    else if (unit_type == INFANTRY_RACE_UNIT){

    }
    else if (unit_type == SMALL_VEHICLE){

    }
    else if (unit_type == MEDIUM_VEHICLE){

    }
    else if (unit_type == LARGE_VEHICLE){

    }
    else if (unit_type == RACE_VEHICLE){

    }
    else if (unit_type == SMALL_AIR){

    }
    else if (unit_type == MEDIUM_AIR){

    }
    else if(unit_type == LARGE_AIR){

    }
    else if (unit_type == RACE_AIR){

    }
    else if (unit_type == ULTIMATE_RACE_UNIT){

    }
}

/**
* Calculates if the unit created can fly or not
*/
bool unit::calculateFlying(enum UNIT_TYPE unit_type,enum RACE race1) {
    if (unit_type == SMALL_AIR || unit_type == MEDIUM_AIR || unit_type == LARGE_AIR || unit_type == RACE_AIR){
        return true;
    }
    else if (unit_type == ULTIMATE_RACE_UNIT && (race1 == LIZARD_FOLK || race1 == HUMAN)){
        return true;
    }
    else{
        return false;
    }

}

/**
* The constructor for the unit calculating all values for when a unit is created
*/
unit::unit(enum UNIT_TYPE unittype, enum RACE Race){
	unitType  = unittype;
	race = Race;
	name = createUnitName(unitType,race);
    resourceCost;
    health = calculateHealthValues(unitType, race);
    movementMax;
    attackValue;
    armor;
    flying = calculateFlying(unitType, race);
    additionalArmor;

}

