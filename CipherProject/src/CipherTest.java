public class CipherTest {

	public static void main(String[] args) {
		String str = "hello";
		int rotations = 1;

		str = Cipher.encode(str, rotations);
		System.out.println(str);

		str = Cipher.decode(str, rotations);
		System.out.println(str);
	}

}
