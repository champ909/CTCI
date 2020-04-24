package twoStringPermutation;

import java.util.Arrays;

public class firstAttempt {

	public static void main(String[] args) {

		String str1 = "dog";
		String str2 = "god";

		str1 = sort(str1);
		System.out.println(str1);
		str2 = sort(str2);
		System.out.println(str2);
		boolean result = permutation(str1, str2);

		if (result) {
			System.out.println("is a permutation");
		} else {
			System.out.println("not a permutation");
		}
	}

	public static boolean permutation(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		return str1.equals(str2);
	}

	public static String sort(String s) {

		char[] c = s.toCharArray();
		Arrays.sort(c);

		return new String(c);
	}

}
