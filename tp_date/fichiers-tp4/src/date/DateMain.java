package date;

import date.*;

import date.util.*;

public class DateMain{
	public static void main(String[] args){
		Date d1 = new Date(12,Month.february,2019);
		Date d12 = new Date(20,Month.february,2019);
		Date d2 = new Date(31,Month.december,2019);
		System.out.println("'d1': "+d1.toString());
		System.out.println("'d12': "+d12.toString());
		System.out.println("'d2': "+d2.toString());
		System.out.println("'d2 tomorrow': "+d2.tomorrow().toString());
		System.out.println("'d1 month':"+d1.getMonth());
		System.out.println("'d1 distance d12': "+d1.distanceInDays(d12));
		System.out.println("'d1 77 days later': "+d1.nDaysLater(77).toString());
		System.out.println("'d1 equals d2': "+d1.equals(d2));
		System.out.println("'d1 equal the new date' 12/february/2019: "+d1.equals(new Date(12,Month.february,2019)));
		Date d3 = new Date(d1);
		System.out.println("'d3 a date created from d1 so they are the same date but not the same object': "+d1.toString());
		System.out.println("'d3 == d1' :"+d3.equals(d1));
		Date d4 = d1.nDaysLater(0);
		System.out.println("d4 obtained from the method nDaysLater() rate white 0 on d1 ': "+d4.toString());
		System.out.println("d1 and d4 are not the same object");
		d4 = new Date(d2);
		System.out.println("'d4 a date created from d2': "+d4.toString());
		//Vous remarquez que d4 est modifier mais pas d1
		System.out.println("'d1 remains unmodified' :"+d1.toString());
		Date dateError = new Date(-2,Month.february,2019);
	}
}