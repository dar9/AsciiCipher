public class Cipher {

	/*
	 * encode method used to encode string to ascii and change it with rotation
	 * 
	 * @param str string to pass to encode it
	 * 
	 * @param rotations amount of time to rotate it
	 * 
	 * @return returns the string that has been encoded
	 */
	public static String encode(String str, int rotations) {
		char charArray[] = str.toCharArray();
		int[] ascArray = new int[charArray.length];

		// create the ascii array from char array
		for (int i = 0; i < charArray.length; i++) {
			ascArray[i] = (int) charArray[i];
		}

		// add the rotations to the ascii array
		for (int i = 0; i < ascArray.length; i++) {
			if ((ascArray[i] >= 65 && ascArray[i] <= 90) || (ascArray[i] >= 97 && ascArray[i] <= 122)) {

				if (ascArray[i] >= 65 && ascArray[i] <= 90) {
					ascArray[i] += rotations;
					if (ascArray[i] > 90) {
						ascArray[i] -= 26;
					}
				} else if (ascArray[i] >= 97 && ascArray[i] <= 122) {
					ascArray[i] += rotations;
					if (ascArray[i] > 122) {
						ascArray[i] -= 26;
					}
				}

			}
		}

		// change the ascii back to char
		for (int i = 0; i < ascArray.length; i++) {
			charArray[i] = (char) ascArray[i];
		}

		// change char to string
		str = new String(charArray);

		// return string
		return str;

	}

	/*
	 * decode method used to decode the ascii change it with rotation to be able to
	 * read it as a string
	 * 
	 * @param str string to pass to decode it
	 * 
	 * @param rotations amount of time to rotate it back
	 * 
	 * @return returns the string that has been decoded
	 */
	public static String decode(String str, int rotations) {
		char charArray[] = str.toCharArray();
		int[] ascArray = new int[charArray.length];

		// create the ascii array from char array
		for (int i = 0; i < charArray.length; i++) {
			ascArray[i] = (int) charArray[i];
		}

		// subtract the rotations to the ascii array
		for (int i = 0; i < ascArray.length; i++) {
			if ((ascArray[i] >= 65 && ascArray[i] <= 90) || (ascArray[i] >= 97 && ascArray[i] <= 122)) {

				if (ascArray[i] >= 65 && ascArray[i] <= 90) {
					ascArray[i] -= rotations;
					if (ascArray[i] < 65) {
						ascArray[i] += 26;
					}
				} else if (ascArray[i] >= 97 && ascArray[i] <= 122) {
					ascArray[i] -= rotations;

					if (ascArray[i] < 97) {
						ascArray[i] += 26;
					}
				}

			}
		}

		// change the ascii back to char
		for (int i = 0; i < ascArray.length; i++) {
			charArray[i] = (char) ascArray[i];
		}

		// change char to string
		str = new String(charArray);

		// return string
		return str;
	}
}
