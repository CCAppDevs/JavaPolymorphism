package poly;

public class Animal {
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void MakeSound() {
		System.out.println(this.name + " makes a sound");
	}
}
