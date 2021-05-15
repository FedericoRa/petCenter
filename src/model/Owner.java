package model;


/**
*descripction:  name of the class owner
*/
public class Owner
{

	private String id;
	private String name;
	private String cellphone;
	private String address;
	
	public Owner()
	{
		
	}



	//constructors

	/**
	*Constructor method to creates an object of Owner
	*@param id   type String
	*@param name     type String
	*@param cellphone     type String
	*@param address     type String
	*/

	public Owner(String id, String name, String cellphone, String address)
	{
		this.id = id;
		this.name = name;
		this.cellphone = cellphone;
		this.address = address;
	}



	//getters
	
	public String getId()
	{
		return id;
	}


	public String getName()
	{
		return name;
	}


	public String getcellphone()
	{
		return cellphone;
	}	


	public String getaddress()
	{
		return address;
	}
	


	//setters

	/**
	*Change id of the pet owner
	*Change id that is saved in the variable
	*@param id type String
	*/

	public void setId(String id)
	{
		this.id = id;
	}

	/**
	*Change name of the pet owner
	*Change name that is saved in the variable
	*@param name type String
	*/

	public void setName(String name)
	{
		this.name = name;
	}


	/**
	*Change cellphone of the pet owner
	*Change cellphone that is saved in the variable
	*@param cellphone type String
	*/

	public void setCellphone(String cellphone)
	{
		this.cellphone = cellphone;
	}


	/**
	*Change address of the pet owner
	*Change address is saved in the variable
	*@param address type String
	*/

	public void setaddress(String address)
	{
		this.address = address;
	}

	


}