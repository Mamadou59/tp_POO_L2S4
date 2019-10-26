package date;

import date.util.*;

import java.lang.IllegalArgumentException;
/**
* this class creates and manages the different 
*manipulation of a date to know the date of the 
*following day or several days after, the distance between two dates
*and tests if two date are identical.
*/

public class Date{
	private int day;
	private Month mont;
	private int year;

	/**
	* Creates a date by the day, month and year passed in parameter.
	* @throws IllegalArgumentException if day < 0 or day > month number of days.
	*/
	public Date(int day, Month mont, int year){
		 if ((day < 0) || (mont.getNbDays(year) < day)){
		 throw new IllegalArgumentException("the first argument can not be negative");
		 }
		this.day = day;
		this.mont = mont;
		this.year = year;
	}

	/**
	* Creates a date by an another Date object passed in parameter.
	* @param date the date  which we create the new date (the two dates will be same but diferente object)
	*/
	public Date (Date date){
		this.day = date.day;
		this.mont = date.mont;
		this.year = date.year;
	}

	/**
	* @return the day of the date.
	*/
	public int getDay(){
		return this.day;
	}

	/**
	* @return the month of the date.
	*/
	public Month getMonth(){
		return this.mont;
	}

	/**
	* @return the year of the date.
	*/
	public int getYear(){
		return this.year;
	}

	/**
	* @return tomorrow date.
	*/
	public Date tomorrow(){
		if (this.mont.getNbDays(this.year) == this.day){
			int year = this.year;
			if (this.mont == Month.december) year++;
			return new Date(1,this.mont.getNextMonth(),year);
		}
		return new Date(this.day+1,this.mont,this.year);
	}

	/**
	* @param date the second date from which the distance is calculated.
	* @return a distance between two date.
	*/
	public int distanceInDays(Date date){
		int nb = 0;
		Date d1 = new Date(this);
		Date d2 = new Date(date);
		while( !d1.equals(date) && !d2.equals(this)){
			d1 = d1.tomorrow();
			d2 = d2.tomorrow();
			nb++;
		}
		return nb;
	}

	/**
	* @param n the number of days separating the date we have and the one that we want to find.
	* @throws IllegalArgumentException if n < 0.
	* @return this new date after the n days.
	*/
	public Date nDaysLater(int n){
		if (n<0){
			throw new IllegalArgumentException();
		}

		Date date = new Date(this);
		for(int i=0; i<n; i++){
			date = date.tomorrow();
		}
		return date;
	}

	/**
	* Test if two date are identical
	* @param o any object a priori a date object.
	* @return boolean true if the two object are same and false is not.
	*/
	public boolean equals(Object o){
		if (o == null) return false;
		if (o instanceof Date) {
			Date other = (Date) o;
			return this.day == other.day && this.mont == other.mont && this.year == other.year;
		}
		return false;
	}

	/**
	* @return a string description of this date.
	*/
	public String toString(){
		return "The date is: "+ this.day +" "+this.mont+" "+this.year;
	}

	/**
    * @param year the year that have it test whether it's leap or not.
    * @return boolean true if the year is leap and false if not.
    */
	public static boolean isLeap(int y){
		return ((y % 4 == 0) && (y % 100 != 0)) || (y % 400==0);
	}
}