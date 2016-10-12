package edu.oakland.homework.homework_01;
import java.util.*;

public class AreaCalculator {

	public static void PrintCircleArea(double radius){
		System.out.println("Circle Area = " + Math.PI*radius*radius);
	}
	public static void PrintRectangleArea(double length, double width){
		System.out.println("Rectangle Area = " + length*width);
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input the radius of the circle: ");
		double rad = keyboard.nextDouble();
		System.out.println("Input the length of the circle: ");
		double len = keyboard.nextDouble();
		System.out.println("Input the width of the circle: ");
		double wid = keyboard.nextDouble();

		PrintCircleArea(rad);
		PrintRectangleArea(len,wid);

	}
}
 
