/*
 * heroUnit.h
 *
 *  Created on: Oct 10, 2014
 *      Author: jake
 */

#ifndef HEROUNIT_H_
#define HEROUNIT_H_
#include "unit.h"
using namespace std;


class heroUnit :unit {

enum HERO_NAME{
};
enum RACE{
    HUMAN, ELF, ORC, DRYAD, LIZARD_FOLK, GOBLIN
};

public:
	heroUnit(heroName);
	void castAbility;
private:
	heroName name;

};



#endif /* HEROUNIT_H_ */
