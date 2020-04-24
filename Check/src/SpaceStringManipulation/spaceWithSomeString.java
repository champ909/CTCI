package SpaceStringManipulation;

public class spaceWithSomeString {

	public static void main(String[] args) {

		String helloWorld = "Prodigy is noob	";
		int count = 0;
		char[] charArray = new char[helloWorld.length() * 2];

		for (int i = 0; i < helloWorld.length(); i++) {

			if (helloWorld.charAt(i) != ' ') {
				charArray[count] = helloWorld.charAt(i);
				count++;
			} else {
				count = i + 3;
				charArray[count - 3] = '%';
				charArray[count - 2] = '2';
				charArray[count - 1] = '0';

			}
		}

		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
	}
}
