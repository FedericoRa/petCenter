package model;

public class ReptileZone extends PetHabitats
{
	/**
	 *material
	*/
	private String aquariumMaterial;



	private AquariumType aquarium;

	/**
	*Constructor method of reptile zone
	*@param habitatID    type String
	*@param length       type String
	*@param width        type String 
	*@param aquariumMaterial       type String
	*@param days type int
	*@param aquarium   type String
	*/

	public ReptileZone(String habitatID, String length, String width,String aquariumMaterial, int days, AquariumType aquarium)
	{
		super(habitatID, length, width, days);
		this.aquariumMaterial = aquariumMaterial;
		this.days = days;
		this.aquarium = aquarium;

	}

	public ReptileZone(String habitatID, String length, String width,String aquariumMaterial, AquariumType aquarium)
	{
		super(habitatID, length, width);
		this.aquariumMaterial = aquariumMaterial;
		this.aquarium = aquarium;

	}

	//getters of reptile zone

	public String getAquariumMaterial()
	{
		return aquariumMaterial;
	}

	public AquariumType getAquarium()
	{
		return aquarium;
	}
	

	//setters of reptile zone

	public void setAquariumMaterial(String aquariumMaterial)
	{
		this.aquariumMaterial = aquariumMaterial;
	}

	public void setAquarium(AquariumType aquarium)
	{
		this.aquarium = aquarium;
	}

	@Override
	public String toString()
	{
		return super.toString() +		
		"\nAquarium Material " + aquariumMaterial +
		"\nType of aquarium " + aquarium+ "\n";
	}
	
	




}