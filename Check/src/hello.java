
public class hello {

	public static void main(String[] args) {

		String randomString = "abcdafghijklmnopqrst";
//		boolean isUnique = true;
//		outerloop: for (int i = 0; i < randomString.length() - 1; i++) {
//			for (int j = i + 1; j < randomString.length(); j++) {
//
//				if (randomString.charAt(i) == randomString.charAt(j)) {
//					isUnique = false;
//					break outerloop;
//
//				} else {
//					isUnique = true;
//
//				}
//			}
//		}
//
//		System.out.println(isUnique);
		
		
		
		boolean[] charSet = new boolean[128];
		int i = 1;
		int asci = randomString.charAt(0);
		System.out.println(asci);
		for(boolean c : charSet) {
			
			System.out.println(i +":"+ c);
			i++;
		}
	}
}
