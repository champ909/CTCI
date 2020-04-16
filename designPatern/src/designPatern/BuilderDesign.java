package designPatern;

public class BuilderDesign {

	public static void main(String[] args) {

		User user1 = new User.UserBuilder("r", "k").
				age(10).phone("123123132123").address("b").build();
		
		System.out.println(user1);
	}

}
