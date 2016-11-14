package edu.oakland.production.gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import edu.oakland.helper.*;
import edu.oakland.production.*;

public class ATMFrame extends JFrame{

	private JButton balanceBtn;
	private JButton withdrawlBtn;
	private JTextField balanceText;
	private JTextField withdrawlText;
	private JLabel balanceLabel;
	private JLabel withdrawlLabel;
	private JLabel amtIssuedLabel;
	private JLabel cardStatusLabel;
	private JLabel acceptedLabel;
	private JLabel deniedLabel;

	private BankDB dbbank;

	public ATMFrame() {
		setLayout(new FlowLayout());
		initObjects();
		addObjects();
		addHandelers();
	}

	private class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			Integer bal = Integer.parseInt(balanceText.getText());
			dbbank =  new BankDB(bal);
			//System.out.println("BAL: " + dbbank.bal);
		}
	}

	private class ButtonHandler2 implements ActionListener{
		public void actionPerformed(ActionEvent event){
			Integer withdraw = Integer.parseInt(withdrawlText.getText());
			ATM atm = new ATM();
			atm.getDB(dbbank);
			if (atm.submit(withdraw)){
				//System.out.println("FUNDS AVAILABLE");
				deniedLabel.setVisible(false);
				acceptedLabel.setVisible(true);
				cardStatusLabel.setText("Card Accpted");
				cardStatusLabel.setVisible(true);
				amtIssuedLabel.setText("Amount Issued: "+withdraw.toString());
				amtIssuedLabel.setVisible(true);

			}else{
				//System.out.println("NOT AVAILABLE");
				acceptedLabel.setVisible(false);
				deniedLabel.setVisible(true);
				cardStatusLabel.setText("Card Rejected");
				cardStatusLabel.setVisible(true);
				amtIssuedLabel.setVisible(false);
			}
		}
	}

	private void initObjects(){

		balanceLabel = new JLabel("Account Balance");
		withdrawlLabel = new JLabel("Withdrawl Amount");
		amtIssuedLabel = new JLabel("Amount Issued");

		acceptedLabel = new JLabel("Request Accepted");
		acceptedLabel.setBackground(Color.green);
		acceptedLabel.setOpaque(true);
		acceptedLabel.setVisible(false);

		deniedLabel = new JLabel("Request Denied");
		deniedLabel.setBackground(Color.red);
		deniedLabel.setOpaque(true);
		deniedLabel.setVisible(false);

		cardStatusLabel = new JLabel();
		cardStatusLabel.setOpaque(true);
		cardStatusLabel.setVisible(false);

		amtIssuedLabel = new JLabel();
		amtIssuedLabel.setBackground(Color.white);
		amtIssuedLabel.setOpaque(true);
		amtIssuedLabel.setVisible(false);

		balanceText = new JTextField(10);
		withdrawlText = new JTextField(10);

		balanceBtn = new JButton("ENTER ACCT BALANCE");
		withdrawlBtn = new JButton("ENTER WITHDRAWL AMT");
	}

	private void addObjects(){
		add(balanceLabel);
		add(withdrawlLabel);
		add(balanceText);
		add(withdrawlText);
		add(balanceBtn);
		add(withdrawlBtn);
		add(acceptedLabel);
		add(deniedLabel);
		add(cardStatusLabel);
		add(amtIssuedLabel);
	}

	private void addHandelers(){
		ButtonHandler handler = new ButtonHandler();
		balanceBtn.addActionListener(handler);

		ButtonHandler2 handler2 = new ButtonHandler2();
		withdrawlBtn.addActionListener(handler2);
	}

}