/*
 * unit.h
 *
 *  Created on: Oct 6, 2014
 *      Author: jake
 */

#ifndef UNIT_H_
#define UNIT_H_


using namespace std;

class unit {

public:
    enum unitType{
        standardGunner, heavyGunner,specRaceGunner, smallVehUnit, mediumVehUnit,
        largeVehUnit, raceVehUnit, smallAirUnit, mediumAirUnit, largeAirUnit,
	raceAirUnit, ultiRaceUnit
    };
    enum unitRace{
        human, elven, orc, dryad, lizardFolk, goblin
    };

    unit(unitType unitType, unitRace race);
    string getName();
    int getHealth();
    void setHealth(int);
    int getMovementMax();
    void setMovementMax(int);
    double getAttackValue();
    int getArmor();
    void updateArmor();
    bool isFlying();
    unitRace getRace();
    int getResourceCost();
    void updateAttackValue();
    void initUnitValues();




private:
    int resourceCost;
    unitType type;
    string name;
    int health;
    int movementMax;
    double attackValue;
    int armor;
    bool flying;
    int additionalArmor;
    unitRace race;

};



#endif /* UNIT_H_ */
