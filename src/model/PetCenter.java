package model;

/**
*descripction:  name of the principal class of model
*/
public class PetCenter
{
    private Pet[] pett; 					  //array of pets
    public static final int MAX_PET = 120;    //constant variable for maximun pets

    private Veterinary[] vets;                //array of vets
    public static final int MAX_VETS = 7;     //constant variable of max vets

    private Owner[] owners;               
    public static final int MAX_OWNERS = 120;



    public PetCenter()
    {
      pett = new Pet[MAX_PET];

      vets = new Veterinary[MAX_VETS];

      owners = new Owner[MAX_OWNERS]; 


    }


    public void showaddvet(String id, String name, String lastName, String vetRegister)
    {
	 	Veterinary vet = new Veterinary(id, name, lastName, vetRegister);

	 	for(int i=0; i<MAX_VETS; i++)
	 	{
	 		if(vets[i] == null)
	 		{
	 			vets[i] = vet;
	 		}
	 	}
	}



	public void showremoveveterinary()
	{
		System.out.print("this the method to remove a some vet");
	}







	public void showaddpet(String specie, String name, String age, String race, String symptoms, String id, Priority priority)
	{
		Owner owner = null;
		for(int i=0; i<MAX_OWNERS;i++)
		{
    			if(owners[i] != null && owners[i].getId().equalsIgnoreCase(id))
    		{
        		owner = owners[i];
    		}
		}

		Pet pet = new Pet(specie,name,age,race,symptoms,owner,priority);

	    for(int i=0;i<MAX_PET;i++)
	    {
	    	if(pett[i] == null)
	    	{
	    		pett[i] = pet;
	    	}
	    }


	    //(for) hacer arrelgo dw owner y si el id get owner.id


	}

	/**
	*This method is to change the status of a pet
	*Object of type pet must be in status waiting
	*Change pet status to DEPARTURE
	*@param name type String  
	*@param owner type String
	*/


	public void showremovepet(String name, String owner)
	{
		boolean find = false;
		for(int i=0; i< pett.length && !find &&(pett[i].getStatus() == Status.WAITING);i++)
			{	
				if(pett[i] != null)
				{
			 		if(pett[i].getName().equals(name) && (pett[i].getOwner().getName().equals(owner)))
			 		{
			 		System.out.print("The Pet "+pett[i].getName()+" has been successfully removed");
			 		pett[i].setStatus(Status.DEPARTURE_WHITOUT_ATTENTION);
			 		pett[i].setPriority(Priority.NOTONE);
			 		find = true;
			 		}

			 		else
			 		{
			 			System.out.print("The pet can't be removed 'cause it is in consultation or has already been attended");
			 		}
				}
	 		}	

	}


	/*
	public int vPriority(Priority priority)

	{
		int anw = 0;

		if(Priority.RED == priority)
		{
			asw = 5;

		}

		else if(Priority.ORANGE == priority)
		{
			asw = 4;

		}

		else if(Priority.YELLOW == priority)
		{
			asw = 3;

		}

		else if(Priority.GREEN == priority)
		{
			asw = 2;

		}

		else if(Priority.BLUE == priority)
		{
			asw = 1;

		}

		else if(Priority.NOTONE == priority)
		{
			asw = 0;

		} return asw;
	}
	*/


	/*public void findnextpet()
	{
	 Pet =  nexPpet = null,

	 int priorityy = 0;
	 int priorityyy = 0;	


		if(pett[0] != null)
		{
			if(pett[i].getStatus().equals(Status.WAITING))
			{
				priorityy  = vPriority(nextPet.getPriority());
				priorityyy = vPriority(pett[i].getPriority());
					if(priorityy > priorityyy)
					{
						nextPet = pett[i];
					} 
			}

		} return nextPet;

	}
	*/




	public void showstartconsultation()
	{
		System.out.print("this the method to remove a some vet");	
	}


	public void showendconsultation()
	{
		System.out.print("this the method to ..");	
	}

	public void showamountpets()
	{
		System.out.print("this the method to ..");	
	}


	public void showdailyclosing()
	{
		System.out.print("this the method to ...");	
	}






 

	//prioridad para cambiarlo

	 //pet.setStatus(Status.IN_CONSULTATION);
	

}