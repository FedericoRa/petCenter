package model;

public class RabbitZone extends PetHabitats
{
	/**
	 *plant Type 
	*/
	private String plant_Type;

	/**
	 *plants Number 
	*/
	private String plants_Number;


	/**
	*Constructor method of rabbit zone
	*@param habitatID    type String
	*@param length       type String
	*@param width        type String 
	*@param plant_Type   type String
	*@param plants_Number   type String
	*/


	public RabbitZone(String habitatID, String length, String width, String plant_Type, String plants_Number)
	{
		super(habitatID, length, width);
		this.plant_Type = plant_Type;
		this.plants_Number = plants_Number;

	}

	//getters of rabbit zone

	public String getPlant_Type()
	{
		return plant_Type;
	}

	public String getPlants_Number()
	{
		return plants_Number;
	}


	//setters of rabbit zone

	public void setPlant_Type(String plant_Type)
	{
		this.height = plant_Type;
	}

	public void setPlants_Number(String plants_Number)
	{
		this.plants_Number = plants_Number;
	}


	@Override
	public String showInfo()
	{
		String out = super.showstats();
		out += "Dog";

		return out;
	}

	




}