/*
 * unit.h
 *
 *  Created on: Oct 6, 2014
 *  Author: Jake Hayhurst
 *  Version: 0.0
 */

#ifndef UNIT_H_
#define UNIT_H_
#import <string>

using namespace std;

class unit {

	enum RACE{
		HUMAN, ELF, ORC, DRYAD, LIZARD_FOLK, GOBLIN
	};
	enum UNIT_TYPE{
		STANDARD_INFANTRY,
		HEAVY_INFANTRY,
		INFANTRY_RACE_UNIT,
		SMALL_VEHICLE,
		MEDIUM_VEHICLE,
		LARGE_VEHICLE,
		RACE_VEHICLE,
		SMALL_AIR,
		MEDIUM_AIR,
		LARGE_AIR,
		RACE_AIR,
		ULTIMATE_RACE_UNIT
	};


public:

	unit(UNIT_TYPE unittype, RACE race);
	string getName();
	int getHealth();
	void setHealth(int);
	int getMovementMax();
	void setMovementMax(int);
	double getAttackValue();
	int getArmor();
	void updateArmor();
	bool getFlying();
	RACE getRace();
	int getResourceCost();



private:
	int resourceCost;
	string name;
	int health;
	int movementMax;
	double attackValue;
	int armor;
	bool flying;
	int additionalArmor;
	RACE race;
	UNIT_TYPE unitType;
	void updateAttackValue();
    void updateHealthValue();
    int calculateHealthValues(UNIT_TYPE, RACE);
    int calculateMovementMax(UNIT_TYPE,RACE);
    int calculateArmor(UNIT_TYPE, RACE);
    string createUnitName(UNIT_TYPE, RACE);
    bool calculateFlying(UNIT_TYPE, RACE);
    double calculateAttackValue(UNIT_TYPE, RACE);

};



#endif /* UNIT_H_ */
