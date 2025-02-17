package keyGeneratorByOOP;
 
import java.util.Scanner;
 
public class MainKeyGenerator {
 
	private static int readPositiveNumber(String messageToUser) { // Method to enter the number of keys
		int numberKeys = -1;
		try {
			Scanner inputFromUser = new Scanner(System.in); // exception of user input if the user enter the number
			do { // not positive of not grater than zero
				System.out.println(messageToUser);
				try {
					numberKeys = inputFromUser.nextInt(); // To keep the code work and accept the number even if not
															// correct, and accept another number
				} catch (Exception e) { // If the number is not correct
					System.out.println("The number is not correct and");
				}
			} while (numberKeys <= 0);
		} finally {
			System.out.println(); // To complete the try statement
		}
		return numberKeys;
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfKeys = readPositiveNumber("Hello, please enter a positive number more than 0: "); // Number of keys
		KeyGenerator generateTheKey = new KeyGenerator(numberOfKeys); // Start the object by the KeyGenerator class
		generateTheKey.generateKeys(numberOfKeys);
		generateTheKey.printKeys();
		
	}
}
