public class Date
{
  protected int year, month, day;

  // Constructor
  public Date(int newMonth, int newDay, int newYear)
  {
    month = newMonth;  day = newDay;  year = newYear;
   }

  // Observers
  public int getYear() { 
	return year;  
  }
  public int getMonth(){ 
	return month; 
  }
  public int getDay(){ 
	return day;
  }
  
  
  // return true if this year is a leap year, otherwise, return false
  // Hint:
  // The year is a leap year if:
  // The year can be evenly divided by 4;
  // If the year can be evenly divided by 100, it is NOT a leap year, unless;
  // The year is also evenly divisible by 400. Then it is a leap year. 
  public boolean isLeapYear(){
	/* 1. Filling your code here */
	if(year%400==0) { //if year divisible by 400
		return true;
	}
	else if(year%100==0) { //else if year divisible by 100 (but not 400)
		return false;
	}
	else if(year%4==0) { //else if year divisible by 4 (but not 100)
		return true;
	}
	return false; //if year not divisible by 4
	/* 1. End of code */
  }
  
  // calculate the number of days from this date to AD (1/1/0), and return the number of days. 
  // e.g. result of getDaysToAD(1,2,0) is 1.
  public int getDaysToAD(){
	/* 2. Filling your code here */
	Date dateCopy=new Date(month, day, year); //make a copy of date so that we can modify it
	int days=0; //how many days to AD
	days += day-1; //add however many days over 1 the date's day is 
	while(dateCopy.month>1) {
		if(dateCopy.month==2) { //if february
			if(isLeapYear()){ //and a leap year
				days+=29; //add 29 days
			}
			else {
				days+=28; //if not leap year, only add 28 days
			}
		}
		else if(dateCopy.month==4 || dateCopy.month==6 || dateCopy.month==9 || dateCopy.month==11) { //if it's a 30 day month
			days+=30;
		}
		else { //31 day months
			days+=31; 
		}
		dateCopy.month--; //decrement variable
	}
	while(dateCopy.year>0) { 
		if(dateCopy.isLeapYear()) { //if this year is a leap year
			days+=366; //add 366 days
		}
		else { //if not a leap year
			days+=365; //add 365 years
		}
		dateCopy.year--; //decrement variable
	}
	return days;
	/* 2. End of code */
  }
  
  // check if this date is between two other given dates (exclusive). 
  // E.g. either 2/5/2020 of 2/15/2020 is not between 2/5/2020 and 2/15/2020
  // Hint: it might save your effort if you use the getDaysToAD function
  public boolean isBetween(int month1, int day1, int year1, int month2, int day2, int year2){
	/* 3. Filling your code here */
	//create date objects so that we can call functions on them
	Date date1=new Date(month1, day1, year1);
	Date date2=new Date(month2, day2, year2);
	int days0=getDaysToAD(); //how many days from 1/1/0 date object is
	int days1=date1.getDaysToAD(); //how many days from 1/1/0 date1 is
	int days2=date2.getDaysToAD(); //how many days from 1/1/0 date2 is
	
	if(days0>days1 && days0<days2 || days0<days1 && days0>days2) { //if date1<date<date2 or date2<date<date1
		return true;
	}
	return false; //otherwise
	
	/* 3. End of code */
  }
  
  // calculate the number of days from this date to an specifed date, and return the number of days.
  // E.g. 2/5/2020 to 2/15/2020 is 10; 2/15/2020 to 2/8/2020 is 7;
  // Hint: you might get help from getDaysToAD function
  public int getDaysToDate(int newMonth, int newDay, int newYear){
	/* 4. Filling your code here */
	Date date2=new Date(newMonth, newDay, newYear);
	return(Math.abs(getDaysToAD()-date2.getDaysToAD())); //this will return the difference between the two dates in terms of days
	/* 4. End of code */
  }
  
  // Returns this date as a String in formate of month/day/year. E.g. 02/05/2020
  public String toString(){
	return(month + "/" + day + "/" + year);
  }
}
