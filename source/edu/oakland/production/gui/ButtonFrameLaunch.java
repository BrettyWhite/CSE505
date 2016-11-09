package edu.oakland.production.gui;
import edu.oakland.production.*;
import edu.oakland.helper.*;
import javax.swing.*;
import java.awt.*;


public class ButtonFrameLaunch{

	public static void main(String[] args){

		ATMFrame buttonframe = new ATMFrame();
		buttonframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonframe.setSize(275,110);
		buttonframe.setLocationRelativeTo(null);
		buttonframe.setVisible(true);

	}


}
