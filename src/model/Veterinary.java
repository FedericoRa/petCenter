package model;

public class Veterinary
{

	private String id;         //private variable of veterinarian's id
	private String nameVet;     //private variable of veterinarian's name
	private String lastName;    //private variable of veterinarian's last name
	private String vetRegister;  //private variable of the veterinarian's unique record


	public Veterinary()
	{
		
	}



	//constructor of veterinarians

	/**
	*Constructor method to creates an object 
	*@param id      type String
	*@param nameVet     type String
	*@param lastName     type String 
	*@param vetRegister   type String
	*/
	public Veterinary(String id, String nameVet, String lastName, String vetRegister)
	{
		this.id = id;
		this.nameVet = nameVet;
		this.lastName = lastName;
		this.vetRegister = vetRegister;

	}

	//getters of veterinarians

	/**
	*get the value
	*/

	public String getId()
	{
		return id;
	}

	public String getNameVet()
	{
		return nameVet;
	}

	public String getLastName()
	{
		return lastName;
	}
	
	public String getVetRegister()
	{
		return vetRegister;
	}


	//setters of veterinarians

	/**
	*Change id of the vet
	*Change id that is saved in the variable
	*@param id type String
	*/

	public void setId(String id)
	{
		this.id = id;
	}

	/**
	*Change name of the vet
	*Change name is saved in the variable
	*@param nameVet type String
	*/

	public void setNamevet(String nameVet)
	{
		this.nameVet = nameVet;
	}

	/**
	*Change lastName of the vet
	*Change lastName is saved in the variable
	*@param lastName type String
	*/

	public void setLastname(String lastName)
	{
		this.lastName = lastName;
	}

	/**
	*Change vetRegister in the vet
	*Change vetRegister is saved in the variable
	*@param vetRegister type String
	*/

	public void setVetRegister(String vetRegister)
	{
		this.vetRegister = vetRegister;
	}

}