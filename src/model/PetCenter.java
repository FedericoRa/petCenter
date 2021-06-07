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

    static PetHabitats[][]matrixHabitats = new PetHabitats [6][5];

    public static final int MIN_CAT_ROW = 0;
    public static final int MAX_CAT_ROW = 2;
    public static final int MIN_CAT_CL = 0;
    public static final int MAX_CAT_CL = 2;

    public static final int MIN_RABB_ROW = 2;
    public static final int MAX_RABB_ROW = 3;
    public static final int MIN_RABB_CL = 3;
    public static final int MAX_RABB_CL = 4;

    public static final int MIN_REP_ROW = 0;
    public static final int MAX_REP_ROW = 1;
    public static final int MIN_REP_CL = 3;
    public static final int MAX_REP_CL = 4;

    public static final int MIN_BIRD_ROW = 4;
    public static final int MAX_BIRD_ROW = 5;
    public static final int MIN_BIRD_CL = 3;
    public static final int MAX_BIRD_CL = 4;

    public static final int MIN_DOG_ROW = 3;
    public static final int MAX_DOG_ROW = 5;
    public static final int MIN_DOG_CL = 0;
    public static final int MAX_DOG_CL = 2;




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



//Methods of cat

	public String addCatHabitat(pet)
	{
		boolean cen = false;

		String message ="";

		for(int i = MIN_CAT_ROW; i <= MAX_CAT_ROW && !cen; i ++)
		{
			for(int j = MIN_CAT_CL; j <= MAX_CAT_CL && !cen; i++)
			{
				if(matrixHabitats[i][j].getPet() ==  null)
				{
					cen = true;
					matrixHabitats [i][j].setPet(cat);
					matrixHabitats [i][j].setHabitatStatus.V;
					message = "the cat has been transfer to kindergarden";

				}
			}
		}
		return message;
	}

	public HabitatIDCat()
	{
		matrixHabitats = new PetHabitats [6][5];
		int acum = 0;

			for(int i = MIN_CAT_ROW; i <= MAX_CAT_ROW; i ++)
		{
			for(int j = MIN_CAT_CL; j <= MAX_CAT_CL; i++)
			{
				matrixHabitats[i][j] = new CatZone("CZ"+(acum+1), 160, 130, 100,75); //falta status
				acum ++;
			}
		}

	}

	public boolean findhabitatCat()
	{
		boolean message = false;

				for(int i = MIN_CAT_ROW; i <= MAX_CAT_ROW; i ++)
		{
			for(int j = MIN_CAT_CL; j <= MAX_CAT_CL; i++)
			{
				if(matrixHabitats[i][j].getPet() = null)
				{
					message = true;
				}
				else message = false;
			}
		}
		return message;


	}


	//Methods of Dog

	public String addDogHabitat(pet)
	{
		boolean cen = false;

		String mmssgg ="";

		for(int i = MIN_DOG_ROW; i <= MAX_DOG_ROW && !cen; i ++)
		{
			for(int j = MIN_DOG_CL; j <= MAX_DOG_CL && !cen; i++)
			{
				if(matrixHabitats[i][j].getPet() ==  null)
				{
					cen = true;
					matrixHabitats [i][j].setPet(dog);
					matrixHabitats [i][j].setHabitatStatus.V;
					mmssgg = "the dog has been transfer to kindergarden";

				}
			}
		}
		return mmssgg;
	}

	public HabitatIDDog()
	{
		matrixHabitats = new PetHabitats [6][5];
		int acum = 0;

			for(int i = MIN_DOG_ROW; i <= MAX_DOG_ROW; i ++)
		{
			for(int j = MIN_DOG_CL; j <= MAX_DOG_CL; i++)
			{
				matrixHabitats[i][j] = new DogZone("DZ"+(acum+1), 200, 160, 2); //falta status
				acum ++;
			}
		}

	}

	public boolean findhabitatDog()
	{
		boolean mmssgg = false;

				for(int i = MIN_DOG_ROW; i <= MAX_DOG_ROW; i ++)
		{
			for(int j = MIN_DOG_CL; j <= MAX_DOG_CL; i++)
			{
				if(matrixHabitats[i][j].getPet() = null)
				{
					mmssgg = true;
				}
				else mmssgg = false;
			}
		}
		return mmssgg;


	}

	//Methods of Rabbit

	public String addRabbitHabitat(pet)
	{
		boolean cen = false;

		String messgg ="";

		for(int i = MIN_RABB_ROW; i <= MAX_RABB_ROW && !cen; i ++)
		{
			for(int j = MIN_RABB_CL; j <= MAX_RABB_CL && !cen; i++)
			{
				if(matrixHabitats[i][j].getPet() ==  null)
				{
					cen = true;
					matrixHabitats [i][j].setPet(rabbit);
					matrixHabitats [i][j].setHabitatStatus.V;
					messgg = "the rabbit has been transfer to kindergarden";

				}
			}
		}
		return messgg;
	}

	public HabitatIDRabbit()
	{
		matrixHabitats = new PetHabitats [6][5];
		int acum = 0;

			for(int i = MIN_RBB_ROW; i <= MAX_RBB_ROW; i ++)
		{
			for(int j = MIN_RBB_CL; j <= MAX_RBB_CL; i++)
			{
				matrixHabitats[i][j] = new RabbitZone("RZ"+(acum+1), 70, 40, "madriguera", 1);//falta status
				acum ++;
			}
		}

	}

	public boolean findhabitatRabbit()
	{
		boolean mssgg = false;

				for(int i = MIN_RABB_ROW; i <= MAX_RABB_ROW; i ++)
		{
			for(int j = MIN_RABB_CL; j <= MAX_RABB_CL; i++)
			{
				if(matrixHabitats[i][j].getPet() = null)
				{
					mssgg = true;
				}
				else mssgg = false;
			}
		}
		return mssgg;


	}


	//Method of Bird

	public String addBirdHabitat(pet)
	{
		boolean cen = false;

		String messsgg ="";

		for(int i = MIN_BIRD_ROW; i <= MAX_RABB_ROW && !cen; i ++)
		{
			for(int j = MIN_RABB_CL; j <= MAX_RABB_CL && !cen; i++)
			{
				if(matrixHabitats[i][j].getPet() ==  null)
				{
					cen = true;
					matrixHabitats [i][j].setPet(bird);
					matrixHabitats [i][j].setHabitatStatus.V;
					messsgg = "the bird has been transfer to kindergarden";

				}
			}
		}
		return messsgg;
	}

	public HabitatIDBird()
	{
		matrixHabitats = new PetHabitats [6][5];
		int acum = 0;

			for(int i = MIN_BIRD_ROW; i <= MAX_BIRD_ROW; i ++)
		{
			for(int j = MIN_BIRD_CL; j <= MAX_BIRD_CL; i++)
			{
				matrixHabitats[i][j] = new BirdZone("BZ"+(acum+1), 300, 200, 4, 100); ///falta status, cage
				acum ++;
			}
		}

	}

	public boolean findhabitatBird()
	{
		boolean msssgg = false;

				for(int i = MIN_BIRD_ROW; i <= MAX_BIRD_ROW; i ++)
		{
			for(int j = MIN_BIRD_CL; j <= MAX_BIRD_CL; i++)
			{
				if(matrixHabitats[i][j].getPet() = null)
				{
					msssgg = true;
				}
				else msssgg = false;
			}
		}
		return msssgg;


	}


	//Methods of Reptile

	public String addReptileHabitat(pet)
	{
		boolean cen = false;

		String mg ="";

		for(int i = MIN_REP_ROW; i <= MAX_REP_ROW && !cen; i ++)
		{
			for(int j = MIN_REP_CL; j <= MAX_REP_CL && !cen; i++)
			{
				if(matrixHabitats[i][j].getPet() ==  null)
				{
					cen = true;
					matrixHabitats [i][j].setPet(reptile);
					matrixHabitats [i][j].setHabitatStatus.V;
					mg = "the reptile has been transfer to kindergarden";

				}
			}
		}
		return mg;
	}

	public HabitatIDReptile()
	{
		matrixHabitats = new PetHabitats [6][5];
		int acum = 0;

			for(int i = MIN_REP_ROW; i <= MAX_REP_ROW; i ++)
		{
			for(int j = MIN_REP_CL; j <= MAX_REP_CL; i++)
			{
				matrixHabitats[i][j] = new ReptileZone("RpZ"+(acum+1), 400, 320,"Madera"); //falta status, aquarium
				acum ++;
			}
		}

	}

	public boolean findhabitatReptile()
	{
		boolean mg = false;

				for(int i = MIN_REP_ROW; i <= MAX_REP_ROW; i ++)
		{
			for(int j = MIN_REP_CL; j <= MAX_REP_CL; i++)
			{
				if(matrixHabitats[i][j].getPet() = null)
				{
					mg = true;
				}
				else mg = false;
			}
		}
		return mg;


	}










 


	

}