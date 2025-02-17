package keyGeneratorByEventDriven;
 
import keyGeneratorByOOP.RandomKeys;
 
public class TheKeys {
	private String theKey; // The key that we will add character to generate it
 
	public TheKeys() {
		theKey = ""; // Constractor default, to make the first value of theKey
	}
 
	public void keyGenerate() {
		RandomKeys generateRandomKeys = new RandomKeys(); // Method to generate keys by the random method
		theKey = generateRandomKeys.randomletter(RandomKeys.upperLetter, 2) // to generate two upper letter
				+ generateRandomKeys.randomletter(RandomKeys.smallLetter, 2) // to generate two small letter
				+ generateRandomKeys.randomletter(RandomKeys.number, 2) // to generate two number
				+ generateRandomKeys.randomletter(RandomKeys.spicalCharacter, 2) // to generate two spical character
				+ generateRandomKeys.randomletter(RandomKeys.upperLetter, 1) // to generate two upper letter
				+ generateRandomKeys.randomletter(RandomKeys.smallLetter, 1) // to generate two small letter
				+ generateRandomKeys.randomletter(RandomKeys.number, 2) // to generate two number
				+ generateRandomKeys.randomletter(RandomKeys.spicalCharacter, 2) // to generate two spical character
				+ generateRandomKeys.randomletter(RandomKeys.upperLetter, 1) // to generate two upper letter
				+ generateRandomKeys.randomletter(RandomKeys.smallLetter, 1); // to generate two small letter
	}
 
	public String getKey() {
		return theKey; // To send the key to print it, because the key is private and we can't access
						// it from out of the class
	}
 
}