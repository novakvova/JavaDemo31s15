
public class Person implements ShowInfo {
	protected String name;
	protected String lastname;
	

	public Person(String name, String lastName) {
		//super();
		this.name = name;
		this.lastname = lastName;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastName) {
		this.lastname = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void Show() {
		System.out.printf("Name: %s\nLastName: %s", name, lastname);
		
	}
}
