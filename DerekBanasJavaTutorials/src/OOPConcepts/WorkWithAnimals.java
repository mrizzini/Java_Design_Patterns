package OOPConcepts;

public class WorkWithAnimals {
	
	int justANum = 10;
	
	public static void main(String[] args) {

		Dog fido = new Dog();
		
		fido.setName("Fido");
		System.out.println(fido.getName());
		
		fido.digHole();
		
		fido.setWeight(-1);
		
		
		// passing by value
		int randNum = 10;
		
		fido.changeVar(randNum);
		
		System.out.println("randNum after method call: " + randNum);
		
		// this is passing in a reference to fido
		// any changes to this object will affect this object across all code
		changeObjectName(fido);
		
		System.out.println("Dog name after method call: " + fido.getName());
		
//		--------------------------------------------------------------------------
// 		SECOND VIDEO - POLYMORPHISM, ABSTRACT
		System.out.println(" ");
		
		
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		// these will call the sounds of the dog and cat classes

		System.out.println("Doggy says: " + doggy.getSound());
		System.out.println("Kitty says: " + kitty.getSound());
		
		// but you cannot call methods only declares in dog and cat this way
		// doggy.digHole();
		
		Animal[] animals = new Animal[4];
		animals[0] = doggy;
		animals[1] = kitty;
		
		System.out.println("Doggy says: " + animals[0].getSound());
		System.out.println("Kitty says: " + animals[1].getSound());
		
		speakAnimal(doggy);
		
		// cannot reference non static variable inside a static method
		// System.out.println(justANum);
		
		// cannot reference non static method inside static method
		// sayHello();
		
		// cant access private method
		// fido.bePrivate()
		// have to do the below
		fido.accessPrivate();
		
		
		
		Giraffe giraffe = new Giraffe();
		giraffe.setName("Frank");
		System.out.println(giraffe.getName());
		
		
	}
	
	// objects are passed by reference!
	// static - any methods that are in a class however they are not tied to an object
	// must be static
	// every object that is created from this class they're all going to have the same
	// static methods as well as static variables
	public static void changeObjectName(Dog fido) {
		fido.setName("Marcus");
	}
	
	
	public static void speakAnimal(Animal randAnimal) {
		System.out.println("Animal says: " + randAnimal.getSound());
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
}
