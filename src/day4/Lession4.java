package day4;

import java.util.Scanner;

public class Lession4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int myInt = scanner.nextInt();
		float myFloat = scanner.nextFloat();
		String myString = scanner.next();
		System.out.println(myInt);
		System.out.println(myFloat);
		System.out.println(myString);
		

		System.out.println("**--------For--------**");

		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}

		System.out.println("**--------While--------**");

		int a = 1;
		while (a < 6) {
			System.out.println(a);
			a++;
		}

		System.out.println("**--------Do,While--------**");

		int b = 1;

		do {
			System.out.println(b);
			b++;
		} while (b < 11);

		System.out.println("**--------BREAK--------**");

		for (int x = 1; x < 6; x++) {
			if (x == 4) {
				break;
			}
			System.out.println(x);
		}

		System.out.println("**--------BREAK + For + For--------**");

		for (int c = 1; c < 6; c++) {

			System.out.print(c + ": ");

			for (int d = 1; d < 6; d++) {
				if (d == 4) {
					break;
				}
				System.out.print(d + " ");
			}

			System.out.println();
		}

		System.out.println("**--------Continue + For + For--------**");

		for (int e = 1; e < 6; e++) {

			System.out.print(e + ": ");

			for (int f = 1; f < 6; f++) {
				if (f == 4) {
					continue;
				}
				System.out.print(f + " ");
			}

			System.out.println();
		}

	}

}
