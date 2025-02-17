package keyGeneratorByEventDriven;
 
import keyGeneratorByOOP.TheKeys;
 
public class KeyGenerator {
	private TheKeys[] keysArray; // Create an object array from the Thekeys class
 
	public KeyGenerator(int numberOfKeys) { // Constractor for the class take the numberOfKeys
		keysArray = new TheKeys[numberOfKeys]; // Make the numberOfKeys a size of the array that we will use it to //
												// generate keys
	}
 
	public void generateKeys(int numberOfKeys) { // Methods to generate keys, by use the generateKey() methods in
													// TheKeys class
		for (int i = 0; i < numberOfKeys; i++) { // The method will store the keys inside the array of keys
			keysArray[i] = new TheKeys(); // The array to make the key as an srray
			keysArray[i].keyGenerate();
		}
	}
 
	public TheKeys[] getKeysArray() {
		return keysArray; // This method will return the key as an array
	} // The key will generate from the TheKeys class and store to the KeysArray on
		// the KeyGenerator
}