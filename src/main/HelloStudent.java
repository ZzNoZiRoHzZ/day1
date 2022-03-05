package main;

public class HelloStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countNumberStudent = 10;
		float  countNumberTeacher = 10.5f;
		boolean isAStudent = true;
		char myName = 'T';
		String myClass = "JDEV-D014#$";
		
		System.out.println("Number student: " + countNumberStudent);
		System.out.println("Number teacher: " + countNumberTeacher);
		System.out.println("I'm a student: " + isAStudent);
		System.out.println("My name:  " + myName);
		System.out.println("My name:  " + myClass);
		
		printMyname();
		System.out.println(printNumber());
		
		int total = sumA(20);
		
		System.out.println("Total: " + total);
		
		
		int totalCAndD = sumCAndD(20,30);
		System.out.println("Sum CD: " + totalCAndD);
	
	}
	
	public static void printMyname() {
		System.out.println("My name: Khoa Nguyen");
		
	}
	
	public static float printNumber() {
		
		
		return 24.3f;
		
		
	}
	
	public static int  sumA(int a) {
		
		return 10 + a;
		
	}
	
	public static int sumCAndD(int c, int d) {
		
		return c + d;
		
	}
	
	

}
