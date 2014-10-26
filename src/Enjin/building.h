/*
 * building.h
 *
 *  Created on: Oct 7, 2014
 *  Author: Jake Hayhurst
 *  Version: 0.0
 */

#ifndef BUILDING_H_
#define BUILDING_H_
#include "unit.h"

using namespace std;
class building{
enum RACE{
	HUMAN, ELF, ORC, DRYAD, LIZARD_FOLK, GOBLIN
};
public:

	building(string);
	int getAdditionalArmor();
	string* returnUnitList();
	int getHealth();
	bool isFullyBuilt();
	string getOwner();

private:
	string name;
	unit* unitList;
	int additionalArmor;
	int health;
	bool fullyBuilt;
	void checkHQLevel();
	string owner;


};



#endif /* BUILDING_H_ */
