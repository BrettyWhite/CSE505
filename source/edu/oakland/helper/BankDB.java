package edu.oakland.helper;
import edu.oakland.production.*;

public class BankDB{
	
	private int bal;
	private boolean funds = false;
	
	public BankDB(int test){
		bal = test;
	}

	public boolean verifyFunds(int val){
		
		if(val <= bal){
			funds = true;
		}

		System.out.println("FUNDS: " + funds);
		return funds;
	}
	
}