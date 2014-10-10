/*
 * unit.h
 *
 *  Created on: Oct 6, 2014
 *      Author: jake
 */

#ifndef UNIT_H_
#define UNIT_H_
#import <string>

using namespace std;

class unit {

public:

	unit(string name);
	string getName();
	int getHealth();
	void setHealth(int);
	int getMovementMax();
	void setMovementMax(int);
	double getAttackValue();
	int getArmor();
	void updateArmor();
	bool getFlying();
	string getRace();
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
	string race;
	void updateAttackValue();


};



#endif /* UNIT_H_ */
