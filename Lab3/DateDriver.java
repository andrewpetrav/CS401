
public class DateDriver {
	public static void main(String[] args) {
		//TEST OUT OF BOUNDS DATES
		try {
			SafeDate date = new SafeDate(2,29,1); //non leap year day>29
		} catch (DateOutOfBoundsException e) {
			e.printStackTrace();
		}
		try {
			SafeDate date = new SafeDate(2,20,-1); //neg year
		} catch (DateOutOfBoundsException e) {
			e.printStackTrace();
		}
		try {
			SafeDate date = new SafeDate(-2,20,1); //neg month
		} catch (DateOutOfBoundsException e) {
			e.printStackTrace();
		}
		try {
			SafeDate date = new SafeDate(2,-20,1); //neg day
		} catch (DateOutOfBoundsException e) {
			e.printStackTrace();
		}
		try {
			SafeDate date = new SafeDate(13,29,1); //invalid month
		} catch (DateOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		//TEST isLeapYear()
		Date date1=new Date(1,1,100);
		Date date2=new Date(1,1,400);
		Date date3=new Date(1,1,4);
		Date date4=new Date(1,1,2021);
		assert date1.isLeapYear()==false;
		assert date2.isLeapYear()==true;
		assert date3.isLeapYear()==true;
		assert date4.isLeapYear()==false;
		//TEST getDaysToAD()
		Date date5=new Date(1,1,0);
		Date date6=new Date(1,2,0);
		Date date7=new Date(1,1,1);
		Date date8=new Date(12,31,4);
		assert date5.getDaysToAD()==0;
		assert date6.getDaysToAD()==1;
		assert date7.getDaysToAD()==365;
		assert date8.getDaysToAD()==1826;
		
		//TEST isBetween()
		Date date9=new Date(1,10,0);
		assert date9.isBetween(1, 9, 0, 1, 11, 0)==true;
		assert date9.isBetween(1, 11, 0, 1, 9, 0)==true;
		assert date9.isBetween(1, 9, 0, 1, 10, 0)==false; //edge case 
		assert date9.isBetween(1, 10, 0, 1, 11, 0)==false; //edge case
		assert date9.isBetween(1, 11, 0, 1, 12, 0)==false; 
		assert date9.isBetween(1, 8, 0, 1, 9, 0)==false;
		
		//TEST getDaysToDate()
		Date date10=new Date(2,5,2020);
		Date date11=new Date(2,15,2020);
		assert date10.getDaysToDate(2, 15, 2020)==10; //works no matter which date
		assert date11.getDaysToDate(2, 8, 2020)==7; //comes first

		
		System.out.println("All test cases successful");
	}
	
	
}
