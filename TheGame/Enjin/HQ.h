/*
 * HQ.h
 *
 *  Created on: Oct 10, 2014
 *      Author: jake
 */

#ifndef HQ_H_
#define HQ_H_
#include "unit.h"
using namespace std;
enum level{
    ONE = 1,TWO = 2,THREE = 3
};

class HQ{

public:


private:
    string owner;
    unit * unitList;
    level HQLevel;
};



#endif /* HQ_H_ */
