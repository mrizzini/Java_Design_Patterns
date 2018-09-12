package OOPConcepts;

public class Giraffe extends Creature {
	
	// this will use the Creature abstract class
	
	private String name;
	private double weight;

	@Override
	public void setName(String newName) {
		
		name = newName;
	}

	@Override
	public String getName() {

		return name;
	}

	@Override
	public void setWeight(double newWeight) {
		this.weight = newWeight;
		
	}

	@Override
	public double getWeight() {
		return weight;
	}
	


}
