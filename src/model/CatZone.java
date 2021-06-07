package model;

public class CatZone extends PetHabitats
{
	/**
	 *height 
	*/
	private String height;

	/**
	 *weight 
	*/
	private String max_weight;


	/**
	*Constructor method of cat zone
	*@param habitatID    type String
	*@param length       type String
	*@param width        type String 
	*@param height       type String
	*@param max_weight   type String
	*/


	public CatZone(String habitatID, String length, String width, String height, String max_weight)
	{
		super(habitatID, length, width);
		this.height = height;
		this.max_weight = max_weight;

	}

	//getters of cat zone

	public String getHeight()
	{
		return height;
	}

	public String getMax_weight()
	{
		return max_weight;
	}


	//setters of cat zone

	public void setHeight(String height)
	{
		this.height = height;
	}

	public void setMax_weight(String max_weight)
	{
		this.max_weight = max_weight;
	}


	@Override
	public String showInfo()
	{
		String out = super.showstats();
		out += "Dog";

		return out;
	}

	




}