package palindromePermutation;

public class palindromePermutation {

	public static void main(String[] args) {

		String example = "aabbcd";

		int[] check = new int[128];

		for (int i = 0; i < example.length(); i++) {

			int addCountToArray = example.charAt(i);

			check[addCountToArray] = check[addCountToArray] + 1;
		}

		int flag = 0;
		boolean flag1 = false;
		checking:
			for (int i = 0; i < check.length; i++) {

			if (check[i] <= 2) {
				if (check[i] == 1) {
					flag++;
				}

				if (flag >= 2 || check[i] > 2) {
					System.out.println("not a palindrome");
					flag1 = true;
					break checking;
				}

			}

		}
		if(!flag1) {
			System.out.println("is palindrome");
		}
		
	}
}
