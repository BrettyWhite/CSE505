package edu.oakland.helper;
import edu.oakland.production.*;

public class BankDB{
	
	public int bal;
	private boolean funds;
	
	public BankDB(int test){
		bal = test;
	}

	public boolean verifyFunds(int val){
		
		if(val <= bal){
			funds = true;
		}else{
			funds = false;
		}
		return funds;
	}
	
}