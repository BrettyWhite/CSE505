package edu.oakland.homework.homework_01;
import java.util.*;

public class YearOfBirth {
	public static void main(String[] args) {

		int age;
		Scanner ageScanner = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = ageScanner.nextInt();
		System.out.println("You are "+ age + " years old now.");
		int year = 2016 - age;
		System.out.println("So you were probably born in "+ year);
	}
}
 
