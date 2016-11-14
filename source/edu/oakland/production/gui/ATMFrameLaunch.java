package edu.oakland.production.gui;
import edu.oakland.production.*;
import edu.oakland.helper.*;
import javax.swing.*;
import java.awt.*;

public class ATMFrameLaunch{

	public static void main(String[] args){

		ATMFrame atmframe = new ATMFrame();
		atmframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		atmframe.setSize(300,300);
		atmframe.setLocationRelativeTo(null);
		atmframe.setVisible(true);

	}
}

/*
COMPILE && LAUNCH

javac -d bin/ -sourcepath source source/edu/oakland/production/gui/ATMFrameLaunch.java

java -cp bin edu.oakland.production.gui.ATMFrameLaunch
*/