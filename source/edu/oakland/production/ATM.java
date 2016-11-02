package edu.oakland.production;
import edu.oakland.helper.*;

public class ATM{
	
	BankDB dbbank;
	
	public void getDB(BankDB init){
		dbbank = init;
	}

	public boolean submit(int val){
		return dbbank.verifyFunds(val);
	}
}
