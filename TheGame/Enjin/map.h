/*
 * map.h
 *
 *  Created on: Oct 1, 2014
 *  Author: Jake Hayhurst
 *  Version: 0.0
 */

#ifndef MAP_H_
#define MAP_H_

using namespace std;
class map{

public:
	map();
	map(char**);
	char getSelectedLandTile();
	char ** getCurrentMap();
	string getName();




private:
	string name;
	void populateCurrentMap();
	void updateCurrentMap();
	void populateUnitMap();
	void updateUnitMap();


};



#endif /* MAP_H_ */
