package keyGeneratorByOOP;
 
public class KeyGenerator {
	private TheKeys[] keysArray; // Create an object array from the Thekeys class
 
	public KeyGenerator(int numberOfKeys) { // Constractor for the class take the numberOfKeys
		keysArray = new TheKeys[numberOfKeys]; // Make the numberOfKeys a size of the array that we will use it to //
												// generate keys
	}
 
	public void generateKeys(int numberOfKeys) { // Methods to generate keys, by use the generateKey() methods in
		//Override											// TheKeys class
		for (int i = 0; i < numberOfKeys; i++) { // The method will store the keys inside the array of keys
			keysArray[i] = new TheKeys();
			keysArray[i].keyGenerate();
		}
	}
 
	public void printKeys() {
		for (int i = 0; i < keysArray.length; i++) {
			System.out.println("Key number[" + (i + 1) + "]: " + keysArray[i].getKey()); // Start print from i = 0, but
																							// the print
			// will be from 1
		}
	}
}

