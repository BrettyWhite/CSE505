package edu.oakland.test;
import edu.oakland.production.*;
import edu.oakland.helper.*;
import javax.swing.*;
import java.awt.*;


public class ATMTest{

	//VARIABLES
	int withdrawl = 400;
	int balance = 500;
	
	/*public void testATM(){
		ATM atm = new ATM();
		BankDB dbbank = new BankDB(balance);
		atm.getDB(dbbank);
		assertTrue(atm.submit(withdrawl));
	}*/

	public static void main(String[] args){

		ButtonFrame buttonframe = new ButtonFrame();
		buttonframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonframe.setSize(275,110);
		buttonframe.setLocationRelativeTo(null);
		buttonframe.setVisible(true);

	}


}
