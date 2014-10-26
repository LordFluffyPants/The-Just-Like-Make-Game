/*
 * HQ.h
 *
 *  Created on: Oct 10, 2014
 *  Author: Jake Hayhurst
 *  Version: 0.0
 */

#ifndef HQ_H_
#define HQ_H_
#include "unit.h"
using namespace std;

class HQ: unit{
enum level{
    ONE = 1,TWO = 2,THREE = 3
};

public:
	HQ(string owner);

private:
	string owner;
	unit * unitList;
	level HQLevel;

};



#endif /* HQ_H_ */
