/* In this lab, you are required to implement a safe date class. 
If the year, month or day is invalid, a DateOutOfBoundsException will be thrown with appriate error message.
DateOutOfBoundsException is predefined. You don't need to make any modification of this class.
Hint: Please consider the following case.
1/45/2020, 1/13/-2020, 2/29/2019 */
public class SafeDate extends Date
{
  public SafeDate(int newMonth, int newDay, int newYear)
                       throws DateOutOfBoundsException
  {
	/* 7. Filling your code here */
	super(newMonth, newDay, newYear); //call super
	String message="Invalid Date"; //define error message
	if(newDay<0 || newDay>31 || newMonth<0 || newMonth>12 || newYear<0) { //no day can be neg or >31, no month can be neg or >12 and no neg years
		throw new DateOutOfBoundsException(message);
	} //9 4 6 11
	else if(newMonth==4 || newMonth==6 || newMonth==9 || newMonth==11) { //if a 30 day month
		if(newDay>30) { //but day>30
			throw new DateOutOfBoundsException(message);
		}
	}
	else if(newMonth==2) { //if february
		if(isLeapYear()) { //if it's a leap year
			if(newDay>29) {
				throw new DateOutOfBoundsException(message);
			}
		}
		else { //normal year
			if(newDay>28) {
				throw new DateOutOfBoundsException(message);
			}
		}
	}
	/* 7. End of code */
  }
}
 