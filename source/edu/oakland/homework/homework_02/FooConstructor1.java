//Question 2
package edu.oakland.homework.homework_02;

public class FooConstructor1{

	private String name;

	public static void main(String[] args){
		FooConstructor1 namey = new FooConstructor1(args[0]);
	}

	FooConstructor1(String namey){
		storeArg(namey);
	}

	void storeArg(String variable){
		name = variable;
		System.out.println(name);
	}
}