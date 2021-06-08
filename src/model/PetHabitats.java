package model;

public abstract class PetHabitats
{
	/**
	 * ID of habitat
	*/
	protected String habitatID;

	/**
	 * length of habitat 
	*/
	protected String length;

	/**
	 * width of habitat 
	*/
	protected String width;

	protected HabitatStatus habitatStatus;


	protected Pet pet;

	protected int days;

	/**
	*Constructor method of reptile zone
	*@param habitatID    type String
	*@param length       type String
	*@param width        type String 
	*@param habitatStatus   type HabitatStatus 
	*/

	public PetHabitats(String habitatID, String length, String width, int days)
	{
		this.habitatID = habitatID;
		this.length = length;
		this.width = width;
		this.days = days;
		habitatStatus = HabitatStatus.V;
		pet = null;
	}

	public PetHabitats(String habitatID, String length, String width)
	{
		this.habitatID = habitatID;
		this.length = length;
		this.width = width;
		habitatStatus = HabitatStatus.V;
		pet = null;
	}


	//getters

	public Pet  getPet()
	{
		return pet;
	}

	public String getHabitatID()
	{
		return habitatID;
	}

	public String  getLength()
	{
		return length;
	}

	public String  getWidth()
	{
		return width;
	}

	public HabitatStatus  getHabitatStatus()
	{
		return habitatStatus;
	}


	//setters

	public void setPet(Pet pet)
	{
		this.pet = pet;
	}

	public void setHabitatID(String habitatID)
	{
		this.habitatID = habitatID;
	}

	public void setLength(String length)
	{
		this.length = length;
	}

	public void setWidth(String width)
	{
		this.width = width;
	}

	public void setHabitatStatus(HabitatStatus habitatStatus)
	{
		this.habitatStatus = habitatStatus;
	}





}