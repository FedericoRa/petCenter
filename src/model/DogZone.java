package model;

public class DogZone extends PetHabitats
{
	/**
	 *toys of dog
	*/
	private String toysNumber;


	/**
	*Constructor method of dog zone
	*@param habitatID    type String
	*@param length       type String
	*@param width        type String 
	*@param toy´sNumber       type String
	*/

	public DogZone(String habitatID, String length, String width, String toysNumber, int days)
	{
		super(habitatID, length, width);
		this.toysNumber = toysNumber;
		this.days = days;

	}

	public DogZone(String habitatID, String length, String width, String toysNumber)
	{
		super(habitatID, length, width);
		this.toysNumber = toysNumber;

	}

	//getters of dog zone

	public String getToysNumber()
	{
		return toysNumber;
	}


	//setters of dog zone

	public void setToysNumber(String toysNumber)
	{
		this.toysNumber = toysNumber;
	}


	@Override
	public String toString()
	{
		return super.toString() +		
		"\nmtoys Number " + toysNumber+ "\n";
	}

	




}