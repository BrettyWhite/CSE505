package edu.oakland.homework.homework_01;
import java.util.*;

public class Example4 {
	public static void main(String[] args) {

		int iresult, irem, numeratorInt, denominatorInt;
		double dresult, drem, numeratorDouble, denominatorDouble;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter int numerator: ");
		numeratorInt = keyboard.nextInt();

		System.out.println("Enter int denominator: ");
		denominatorInt = keyboard.nextInt();

		System.out.println("Enter double numerator: ");
		numeratorDouble = keyboard.nextDouble();

		System.out.println("Enter double denominator: ");
		denominatorDouble = keyboard.nextDouble();


		iresult = numeratorInt / denominatorInt;

		irem = numeratorInt % denominatorInt;

		dresult = numeratorDouble / denominatorDouble;

		drem = numeratorDouble % denominatorDouble;

		System.out.println("Result and remainder of "+ numeratorInt+ " / "+ denominatorInt+ ": " + iresult + " " + irem);

		System.out.println("Result and remainder of "+ numeratorDouble+ " / "+ denominatorDouble+ ": " + dresult + " " + drem);
	}
}
 
