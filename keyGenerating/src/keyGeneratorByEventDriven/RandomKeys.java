package keyGeneratorByEventDriven;
 
import java.util.Random;
 
public class RandomKeys {
	public static final int smallLetter = 1; // Constant of component of the key
	public static final int upperLetter = 2;
	public static final int number = 3;
	public static final int spicalCharacter = 4;
 
	private Random randomNumbers; // To import the random util package
 
	public RandomKeys() { // constrctor to make object by the Random package
		randomNumbers = new Random();
	}
 
	public int FindRandomNumber(int fromThisNumber, int toThisNumber) { // The random algorithm start from
		// (fromThisNumber) is the point we will
		// start from it
//and the toThisNumber is the point we will stop on it
//Make the random number from the package random util
		return randomNumbers.nextInt(toThisNumber - fromThisNumber + 1) + fromThisNumber;
	}
 
	public char randomCharacter(int characterType) { // To make a random character by number of character in ascii table
		switch (characterType) {
		case smallLetter:
			return (char) FindRandomNumber(97, 122); // For small letter
		case upperLetter:
			return (char) FindRandomNumber(65, 90); // For upper letter
		case number:
			return (char) FindRandomNumber(48, 57); // For number
		case spicalCharacter:
			return (char) FindRandomNumber(33, 47);// For spical character
		default:
			return ' ';
		}
	}
 
	public String randomletter(int characterTyoe, int numberKeys) {
		String wordKeys = "";
		for (int i = 0; i < numberKeys; i++) {
			wordKeys += randomCharacter(characterTyoe); // To complete the key and then return it
		}
		return wordKeys;
	}
}