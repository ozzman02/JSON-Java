package udemy.json.domain;

public class UdemyStudent {
	
	private long id;
	
	private String name;
	
	private String lastName;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "UdemyStudent [id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
	}
	
}
