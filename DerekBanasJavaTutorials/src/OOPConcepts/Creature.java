package OOPConcepts;

abstract public class Creature {

	// CANNOT create objects from a class that is marked as abstract
	// Creatue can never be an object
	
	protected String name;
	protected int weight;
	protected String sound;
	
	public abstract void setName(String newName);
	public abstract String getName();
	
	public abstract void setWeight(double newWeight);
	public abstract double getWeight();
	
	// This will force users of this class to do things the way you want to
}
