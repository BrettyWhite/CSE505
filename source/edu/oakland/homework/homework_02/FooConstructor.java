//Question 1
package edu.oakland.homework.homework_02;

public class FooConstructor{

	private String name;

	public static void main(String[] args){
		FooConstructor namey = new FooConstructor();
		namey.storeArg(args[0]);
	}

	void storeArg(String variable){
		name = variable;
		System.out.println(name);
	}
}