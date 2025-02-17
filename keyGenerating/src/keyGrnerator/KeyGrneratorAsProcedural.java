package keyGrnerator;
 
import java.util.Random;
import java.util.Scanner;
 
public class KeyGrneratorAsProcedural {
	public static final int smallLetter = 1; // Constant of component of the key
	public static final int upperLetter = 2;
	public static final int number = 3;
	public static final int spicalCharacter = 4;
 
	public static int FindRandomNumber(int fromThisNumber, int toThisNumber) { // The random algorithm start from
																				// (fromThisNumber) is the point we will
																				// start from it
// and the toThisNumber is the point we will stop on it
		Random numberRand = new Random();
// Make the random number from the package random util
		return numberRand.nextInt(toThisNumber - fromThisNumber + 1) + fromThisNumber;
	}
 
	public static char randomCharacter(int characterType) {
		switch (characterType) {
		case smallLetter:
			return (char) FindRandomNumber(97, 122);
		case upperLetter:
			return (char) FindRandomNumber(65, 90);
		case number:
			return (char) FindRandomNumber(48, 57);
		case spicalCharacter:
			return (char) FindRandomNumber(33, 47);
		default:
			return ' ';
		}
	}
 
	public static int readPositiveNumber(String messageToUser) { // Method to enter the number of keys
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
 
	public static void printTheKeys(int keys, String keysArray[]) { // To print the keys
		for (int i = 0; i < keys; i++) {
			System.out.println("Key number[" + (i + 1) + "]: " + keysArray[i]); // Start print from i = 0, but the print
																				// will be from 1
		}
	}
 
	public static void generateTheKeys(int keys, String[] keysArray) { // Store the keys from method generator as an
																		// array
		for (int i = 0; i < keys; i++) {
			keysArray[i] = keyGenerat();
		}
	}
 
	public static String keyGenerat() { // The equation of the key 
		String keys = "";
		keys = randomletter(upperLetter, 2) + randomletter(smallLetter, 2) + randomletter(number, 2)
				+ randomletter(spicalCharacter, 2) + randomletter(upperLetter, 1) + randomletter(smallLetter, 1)
				+ randomletter(number, 2) + randomletter(spicalCharacter, 2) + randomletter(upperLetter, 1)
				+ randomletter(smallLetter, 1);
		return keys;
	}
 
	public static String randomletter(int characterTyoe, int numberKeys) { // The key that will generate  
		String wordKeys = "";
		for (int i = 0; i < numberKeys; i++) {
			wordKeys += randomCharacter(characterTyoe); // Accept the chracter from the randomCharacter method insted to its type
		}
		return wordKeys;
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfKeys = readPositiveNumber("Hello, please enter a positive number more than 0: "); // Number of keys
		String[] keysArray = new String[1000]; // Keys generator will be as an array will not but more than 16 character
		System.out.println();
		generateTheKeys(numberOfKeys, keysArray); // To start generating the keys
		printTheKeys(numberOfKeys, keysArray);// To print the keys
	}
 
}