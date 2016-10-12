package edu.oakland.homework.homework_01;
import java.util.*;

public class Chirps {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("How many Chirps have you heard in the last minute? ");
		int chirps = keyboard.nextInt();
		int temp = 40 + (chirps/4);
		System.out.println("We estimate that the temperature is "+ temp + " Degress F.");
	}
}

//T= 40+c/4 where c = chirps per minute. T = temp in F