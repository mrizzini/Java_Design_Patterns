package OOPConcepts;

public interface Living {
	
	// sets up a contract for anything that implements Living
	// all these methods are abstract by default
	
	public void setName(String newName);
	public String getName();
	
	public void setHeight(String newHeight);
	public String getHeight();
	
	public void setWeight(String newWeight);
	public String getWeight();
	
	public void setFavFood(String newFood);
	public String getFavFood();
	
	public void setSpeed(String newSpeed);
	public String getSpeed();
	
	public void setSound(String newSound);
	public String getSound();

}
