/*
 * unit.cpp
 *
 *  Created on: Mar 23, 2015
 *      Author: jake
 */
#include "unit.h"
#include <iostream>
#include <string>


/** sets the values of the units based on the race and unit type it was given */
void unit::initUnitValues(){
    //set up unit types to be the same except with the race units.
    if (type == standardGunner){
        if (race == human){

	}
        else if(race == elven){

	}
        else if (race == orc){

	}
	else if (race == dryad){

	}
        else if (race == lizardFolk){

	}
	else{
	    //This is for the goblin race
    	}
    }
    else if (type == heavyGunner){
        if (race == human){

	}
	else if(race == elven){

	}
        else if (race == orc){

	}
        else if (race == dryad){

	}
        else if (race == lizardFolk){

	}
	else{
	    //This is for the goblin race
	}
    }
    else if (type == specRaceGunner){
        //These Race type units will have different stats
	if (race == human){

	}
        else if(race == elven){
	    name = "Mana Addict";
	}
        else if (race == orc){
	    name = "Berserkers";
	}
        else if (race == dryad){
	    name = "Fel Touched";
	}
        else if (race == lizardFolk){
	    name = "Chameleon Assassins";
	}
	else{
	    //This is for the goblin race
	    name = "Techies";
	}	
    }
    else if (type == smallVehUnit){
        if (race == human){

	}
        else if(race == elven){

	}
        else if (race == orc){

	}
        else if (race == dryad){

	}
        else if (race == lizardFolk){

	}
	else{
	    //This is for the goblin race
	}
    }
    else if (type == mediumVehUnit){
        if (race == human){

	}
        else if(race == elven){

	}
        else if (race == orc){

	}
        else if (race == dryad){

	}
        else if (race == lizardFolk){

	}
	else{
	    //This is for the goblin race
	}
    }
    else if (type == largeVehUnit){
        if (race == human){

	}
        else if(race == elven){

	}
        else if (race == orc){

	}
        else if (race == dryad){

	}
        else if (race == lizardFolk){

	}
	else{
	    //This is for the goblin race
	}
    }
    else if (type == raceVehUnit){
        //These Race type units will have different stats
        if (race == human){

	}
        else if(race == elven){

	}
        else if (race == orc){

	}
        else if (race == dryad){

	}
        else if (race == lizardFolk){
	    name = "Dinosaur Construct";
	}
	else{
            name = "Minecart Bombers";
	    //This is for the goblin race
	}
    }
    else if (type == smallAirUnit){
        if (race == human){
            flying = true;
	}
        else if(race == elven){
            flying = true;
	}
        else if (race == orc){
            flying = true;
	}
        else if (race == dryad){
            flying = true;
	}
        else if (race == lizardFolk){
            flying = true;
	}
	else{
	    //This is for the goblin race
            flying = true;
	}
    }
    else if (type == mediumAirUnit){
        if (race == human){
            flying = true;
	}
	else if(race == elven){
            flying = true;
	}
	else if (race == orc){
            flying = true;
        }
	else if (race == dryad){
            flying = true;
	}
	else if (race == lizardFolk){
            flying = true;
	}
	else{
	    //This is for the goblin race
            flying = true;
	}
    }
    else if (type == largeAirUnit){
        if (race == human){
	    flying = true;
	}
	else if(race == elven){
	    flying = true;
	}
	else if (race == orc){
	    flying = true;
	}
	else if (race == dryad){
	    flying = true;
	}
	else if (race == lizardFolk){
            flying = true;
	}
	else{
	    //This is for the goblin race
            flying = true;
	}
    }
    else if (type == raceAirUnit){
	//These Race type units will have different stats
	if (race== human){
	    flying = true;
	}
	else if(race == elven){
	    flying = true;
	}
	else if (race == orc){
	    flying = true;
	}
	else if (race == dryad){
            flying = true;
	    name = "Aurai Bombers";
	}
	else if (race == lizardFolk){
	    flying = true;
	    name = "Dragon Hawk Riders";
	}
	else{
	    flying = true;
            name = "Suicide Gunners";
	    //This is for the goblin race
	}
    }
    else{
        // inits the values for the ultimate race unit
	//These Race type units will have different stats
    	if (race == human){

	}
	else if(race == elven){
	    name = "Fel Deamon";
	}
	else if (race == orc){
	    name = "War Machine";
	}
	else if (race == dryad){
	    name = "Treant of War";
	}
	else if (race == lizardFolk){
	    flying = true;
	    name = "Dragon Construct";
	}
	else{
	    //This is for the goblin race
	    name = "Crystalline construct";
	}
    }
}

/** Gets the name of the unit */
string unit::getName(){
    return name;
}

/** Gets the Units Health */
int unit::getHealth(){
    return health;
}

/** sets the units health to the passes in health */
void unit::setHealth(int pHealth){
    health = pHealth;
}

/** Gets the max movement that the unit has */
int unit::getMovementMax(){
    return movementMax;
}

/** Sets the max movement the unit can make to the passed in value */
void unit::setMovementMax(int mMax){
    movementMax = mMax;
}

/** Gets the units attack value */
double unit::getAttackValue(){
    return attackValue;
}

/** Gets the units armor value */
int unit::getArmor(){
    return armor;
}

//TODO implement the update armor method
void unit::updateArmor(){

}

/** returns true or false depending if the unit is flying or not */
bool unit::isFlying(){
    return flying;
}

/** returns the race of the unit */
unit::unitRace unit::getRace(){
    return race;
}

/** returns the resource cost of the unit */
int unit::getResourceCost(){
    return resourceCost;
}

//TODO implement the update attack value method */
void unit::updateAttackValue(){

}

unit::unit(enum unitType pUnitType, enum unitRace pRace){
    resourceCost = 0;
    type = pUnitType;
    name = "";
    health = 0;
    movementMax = 0;
    attackValue = 0;
    armor = 0;
    flying = false;
    additionalArmor = 0;
    race = pRace;
    initUnitValues();

}


