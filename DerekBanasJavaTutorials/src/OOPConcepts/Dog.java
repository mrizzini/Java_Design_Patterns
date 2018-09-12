package OOPConcepts;

public class Dog extends Animal {

	public void digHole() {
		System.out.println("Dug a hole");
	}
	
	public Dog() {
		
		setSound("Bark");
		
	}
	
	public void changeVar(int randNum) {
		
		randNum = 12;
		
		System.out.println("randNum in method: " + randNum);
		
	}
	
	private void bePrivate() {
		System.out.println("in a private method");
	}
	
	public void accessPrivate() {
		bePrivate();
	}
	
}
