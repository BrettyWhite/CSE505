package edu.oakland.test;
import junit.framework.*;
import edu.oakland.production.*;
import edu.oakland.helper.*;

public class ATMTest extends TestCase{

	//VARIABLES
	int withdrawl = 400;
	int balance = 500;
	
	public void testATM(){
		ATM atm = new ATM();
		BankDB dbbank = new BankDB(balance);
		atm.getDB(dbbank);
		assertTrue(atm.submit(withdrawl));
	}
}
