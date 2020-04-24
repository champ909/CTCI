package arrayAndString;

public class On {

	public static void main(String[] args) {

		String randomString = "abcdefghijklmnopqrst";
		
		boolean result = isUniqueString(randomString);
		System.out.println(result);
	}
	
	
	
	public static boolean isUniqueString(String str) {
		boolean[] b = new boolean[128];

		for (int i = 0; i < str.length(); i++) {
			if (b[str.charAt(i)]) {
				return false;
			}
			
			b[str.charAt(i)] = true;
		}

		return true;
	}
}
