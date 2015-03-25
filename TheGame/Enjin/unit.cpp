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
			//This is for the goblin race
		}
	}
    else if (type == smallAirUnit){
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
    else if (type == mediumAirUnit){
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
    else if (type == largeAirUnit){
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
    else if (type == raceAirUnit){
		//These Race type units will have different stats
		if (race== human){

		}
		else if(race == elven){

		}
		else if (race == orc){

		}
		else if (race == dryad){
			name = "Aurai Bombers";
		}
		else if (race == lizardFolk){
			name = "Dragon Hawk Riders";
		}
		else{
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
			name = "Dragon Construct";
		}
		else{
			//This is for the goblin race
			name = "Crystalline construct";
		}
	}
}

string unit::getName(){
    return name;
}

int unit::getHealth(){
    return health;
}

int unit::getMovementMax(){
    return movementMax;
}

double unit::getAttackValue(){
    return attackValue;
}

int unit::getArmor(){
    return armor;
}

bool unit::getFlying(){
    return flying;
}

int unit::getResourceCost(){
    return resourceCost;
}

unit::unit(enum unitType pUnitType, enum unitRace pRace){
		resourceCost = 0;
        type = pUnitType;
		name = "";
		health = 0;
		movementMax = 0;
		attackValue = 0;
		armor = 0;
		flying = 0;
		additionalArmor = 0;
		race = pRace;
		initUnitValues();

}


