package edu.oakland.helper;

public abstract class Student {

	protected int grizzlyID;
	protected String major;
	protected boolean majorStandingAchieved;

	public int getGrizzlyID(){
		return grizzlyID;
	}

	public String getMajor(){
		return major;
	}

	public boolean getMajorStandingAchieved(){
		return majorStandingAchieved;
	}


}