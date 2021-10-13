package com.neosoft;

public class EnumWeekDaysTest {
	
	WeekDaysEnum day;
	
	public EnumWeekDaysTest(WeekDaysEnum day) {
		// TODO Auto-generated constructor stub
		this.day = day;
	}
	void dayCheck() {
		switch(day) {
		case MONDAY:
			System.out.println("Today is MONDAY!");
			break;
		case TUESDAY:
			System.out.println("Today is TUESDAY!");
			break;
		case WEDNESDAY:
			System.out.println("Today is WEDNESDAY!");
			break;
		case THURSDAY:
			System.out.println("Today is THURSDAY!");
			break;
		case FRIDAY:
			System.out.println("Today is FRIDAY!");
			break;
		case SATUREDAY:
			System.out.println("Today is SATUREDAY!");
			break;
		case SUNDAY:
			System.out.println("Today is SUNDAY!");
			break;
		default:
			System.out.println("Not recorgnized!");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the Day : ");
		String day1 = new java.util.Scanner(System.in).nextLine().toUpperCase();
		try {
			EnumWeekDaysTest obj = new EnumWeekDaysTest(WeekDaysEnum.valueOf(day1));
			obj.dayCheck();
		}
		catch(IllegalArgumentException e) {
			System.out.println("Exception : "+e);
		}
		
	
	}

}
