
package date.util;

import date.*;

/**
* This class enumerates the possible 12 month
*/
public enum Month{
	january(31),february(28),march(31), april(30), may(31), june(30),
    july(31), august(31), september(30), october(31),
    november(30), december(31);
    private int nbDays;
    private Month(int nbDays){
    	this.nbDays = nbDays;
    }
    /**
    * @param year the year that will be used to know if the month of February is 28 or 29 days.
    * @return the number of days in a month.
    */
    public int getNbDays(int year){
    	if (this == february && Date.isLeap(year)) {
    		return this.nbDays + 1;
    	} else{
    		return this.nbDays;
    	}
    }

    /**
    * @return the next month.
    */
    public Month getNextMonth(){
    	return Month.values()[(this.ordinal()+1)%Month.values().length];
    }
}