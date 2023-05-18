package unit02;

class Animal
{
	void nameAnimal()
	{
		System.out.println("Animal");
	}
	
}

class Mammal extends Animal
{
	void nameMammal()
	{
		System.out.println("Mammal");
		nameAnimal();
	}
}

public class P8_Task01_InheritanceInJava {

//	- Simply inherit the super class Animal by creating Mammal class
//	- Try to call super class method inside child class method
//	- Try to call super class method form main method of respective public class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal m = new Mammal();
		m.nameAnimal();
		System.out.println("-----------------");
		m.nameMammal();
	}

}
