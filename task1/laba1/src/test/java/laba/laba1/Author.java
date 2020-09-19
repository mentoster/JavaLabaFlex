package laba.laba1;

public class Author {

	String name;
	String email;
	char gender;

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public String toString() {
		return "автор - " + getName() + "  (" + getGender() + ")  на  адрес  электронной  почты,  \"" + getEmail()
				+ "\"";
	}
}
