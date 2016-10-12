//Question 3
package edu.oakland.homework.homework_02;

public class FooConstructor2{

	private String name;

	public static void main(String[] args){
		String firstArg = args[0];
		String secondArg = args[1];
		String concat = firstArg+secondArg;
		FooConstructor2 namey = new FooConstructor2(concat);
	}

	FooConstructor2(String namey){
		storeArg(namey);
	}

	void storeArg(String variable){
		name = variable;
		System.out.println(name);
	}
}