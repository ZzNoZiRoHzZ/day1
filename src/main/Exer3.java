package main;

public class Exer3 {
	public static void main(String[] args) {
		int myNum1 = 20;
		int myNum2 = 10;
		if (myNum1 < myNum2) {
			System.out.println("My num1 greater than my num2");
		} else if (myNum1 == myNum2) {
			System.out.println("My num1 equals to my num2");
		} else {
			System.out.println("My num1 less than my num2");
		}
		
		int result1 = 0;
		int result2 = 0;
		
		if(myNum1 < myNum2)
		{
			result1 = myNum1 - myNum2;
		}
		else
		{
			result1 = myNum1 + myNum2;
		}
		System.out.println("Result1: " + result1);
		
		result2 = myNum1 > myNum2 ? myNum1 - myNum2 : myNum1 + myNum2;
		System.out.println("Result2: " + result2);
		
		int month = 2;
		
		switch(month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		default:
			break;
		   
		}
		
		int month1 = 12;
		
		switch(month) {
		case 1:
			System.out.println("31 days");
		case 3:
		case 5:
			System.out.println("31 days");
			break;
		case 7:
		case 9:
		case 11:
			System.out.println("31 days");
			break;
		case 2:
		case 4:
			System.out.println("30 days");
		case 6:
		case 8:
			System.out.println("30 days");
		case 10:
		case 12:
			System.out.println("30 days");
			break;
		default:
			break;
		   
		}
		
	}
}
