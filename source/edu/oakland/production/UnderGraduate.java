package edu.oakland.production;
import edu.oakland.helper.Student;

public class UnderGraduate extends Student {

	private String name;

	// 
	public Undergraduate(int grizInput, String majorInput, boolean majorStandingInput, recordName){
		
		if (String.valueOf(grizInput).length() != 4 ){
			//error
		}

		this.grizInput = grizzlyID;
		this.majorInput = major;
		this.majorStandingInput = majorStandingAchieved;
		this.recordName = name;
	}

	public String getName(){
		return name;
	}




}