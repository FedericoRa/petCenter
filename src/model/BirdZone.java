package model;

public class BirdZone extends PetHabitats
{
	/**
	 *max bird in the cages
	*/
	private String maxBirds;

	/**
	 *height of cage
	*/
	private String height;



	private CageType cage;

	/**
	*Constructor method of bird zone
	*@param habitatID    type String
	*@param length       type String
	*@param width        type String 
	*@param maxBirds       type String
	*@param height   type String
	*@param days type int
	*@param cage   type CageType
	*/

	public BirdZone(String habitatID, String length, String width,String maxBirds,String height,int days, CageType cage)
	{
		super(habitatID, length, width);
		this.maxBirds = maxBirds;
		this.height = height;
		this.days = days;
		this.cage = cage;

	}

	public BirdZone(String habitatID, String length, String width,String maxBirds,String height, CageType cage)
	{
		super(habitatID, length, width);
		this.maxBirds = maxBirds;
		this.height = height;
		this.cage = cage;

	}

	//getters of bird zone

	public String getMaxBirds()
	{
		return maxBirds;
	}

	public String getHeight()
	{
		return height;
	}

	public CageType getCage()
	{
		return cage;
	}
	

	//setters of bird zone

	public void setMaxBirds(String maxBirds)
	{
		this.maxBirds = maxBirds;
	}

	public void setHeight(String height)
	{
		this.height = height;
	}

	public void setCage(CageType cage)
	{
		this.cage = cage;
	}

	@Override
	public String toString()
	{
		return super.toString() +		
		"\nmaxBirds " + maxBirds +
		"\nheight " + height+ 
		"\ntype of cage" + cage +"\n";
	}


	




}
	




