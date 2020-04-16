package designPatern;

public class User {

	private final String firstName; // required
	private final String lastName; // required
	private final int age; // optional
	private final String phone; // optional
	private final String address; // optional

	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}
	
	
	@Override
	public String toString() {
		return this.firstName+", "+this.lastName +","+ this.age + ","+this.address+ ","+this.phone;
		
	}

	public static class UserBuilder {

		private String firstName;
		private String lastName;
		private int age; // optional
		private String phone; // optional
		private String address;

		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		
		public UserBuilder age (int age) {
			this.age = age;
			return this;
		}
		
		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public User build() {
			User user = new User(this);
			return user;

		}
	}
}
