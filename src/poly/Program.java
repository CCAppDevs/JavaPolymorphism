package poly;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myAnimal = new Animal("Animal");
		Cat myCat = new Cat("Catty", "Orange Tabby");
		
		Animal[] myAnimals = { myAnimal, myCat };
		
		myAnimals[0].MakeSound();
		myAnimals[1].MakeSound();
	}

}
