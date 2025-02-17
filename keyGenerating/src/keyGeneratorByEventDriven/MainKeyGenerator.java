package keyGeneratorByEventDriven;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
public class MainKeyGenerator {
 
	public static void main(String[] args) {
		JFrame frame = new JFrame("System of key generator"); // The fram of table that will appear for the key system
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // To close the window that appear
		frame.setSize(500, 500); // Size of the window
 
		JPanel panel = new JPanel(); // The component of this panel
		frame.add(panel); // To add this panel to the frame (window) that will appear
		JLabel userLabel = new JLabel("Number of keys:"); // The word that will appear to enter the number
		userLabel.setBounds(50, 20, 160, 25); // Its size
		panel.add(userLabel); // Add it
		JTextField userText = new JTextField(25); // The field to write the number and the width of this field or its
													// column
		userText.setBounds(50, 50, 165, 25); // Its size
		panel.add(userText); // Add it
		JButton generateButton = new JButton("Generate Keys"); // The button to click it to generate the keys
		generateButton.setBounds(50, 80, 150, 25); // Its size
		panel.add(generateButton); // Add it
		JTextArea outputArea = new JTextArea(); // The area that keys will appear inside it
		outputArea.setBounds(250, 250, 1000, 500);// Its size
		panel.add(outputArea); // Add it
 
		generateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numberOfKeys = readKeysNumber(userText.getText());
				if (numberOfKeys > 0) { // If the given number from user are valid, the key will start generating
					String keys = printTheKeys(numberOfKeys);
					outputArea.setText(keys);
				} else { // If the number that given from user not valid, this message will appear
							// because the number not valid and the user will enter new number
					JOptionPane.showMessageDialog(panel, "Enter number more than zero");
				}
			}
		});
		frame.setVisible(true); // To make it appear when the system start
	}
 
	private static int readKeysNumber(String messageToUser) { // Method to read this number and try it then convert a
																// message if its not correct
		try {
			int numberOFTheKeys = Integer.valueOf(messageToUser); // Send the message to user
			return numberOFTheKeys; // To convert the number
		} catch (NumberFormatException enumber) {
			return -1; // To make the user know what the problem
		}
	}
 
	private static String printTheKeys(int numberOfKeys) { // Method that will accept the number of keys after check it
		KeyGenerator generateTheKey = new KeyGenerator(numberOfKeys); // object from the super class
		generateTheKey.generateKeys(numberOfKeys); // To start generating the keys from the number that the user wanted
 
		keyGeneratorByOOP.TheKeys[] keysArray = generateTheKey.getKeysArray(); // To get the numbers that was generated
																				// from the KeyGenerated object
		String theKey = ""; // The key will print
		for (int i = 0; i < keysArray.length; i++) {
			theKey += "Key number[" + (i + 1) + "]: " + keysArray[i].getKey() + "\n"; // To print the keys
		}
		return theKey;
	}
 
}