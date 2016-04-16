package collection;

public class Person {
	// instance variables
	private String name;
	private String email;
	private String gender;
	private int age;
	//constructor
	public Person(String name, String email, String gender, int age){
		this.setName(name);
		this.setEmail(email);
		this.setGender(gender);
		this.setAge(age);
	}
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
