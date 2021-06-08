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

    private Owner[] owners;                   //array of owners
    public static final int MAX_OWNERS = 120; //constant of max owners

    private final int MAX_ROW_MATRIX = 6;    //constant of max row in matrix
    private final int MAX_COLUMN_MATRIX = 5;  //constant of max column in matrix

    public static final int MIN_CAT_ROW = 0; //constant of min row in matrix
    public static final int MAX_CAT_ROW = 2;  //constant of max row in matrix
    public static final int MIN_CAT_CL = 0;	//constant of min column in matrix
    public static final int MAX_CAT_CL = 2; //constant of max column in matrix

    public static final int MIN_RABB_ROW = 2; //constant of min row in matrix
    public static final int MAX_RABB_ROW = 3; //constant of max row in matrix
    public static final int MIN_RABB_CL = 3; //constant of min column in matrix
    public static final int MAX_RABB_CL = 4; //constant of max column in matrix

    public static final int MIN_REP_ROW = 0; //constant of min row in matrix
    public static final int MAX_REP_ROW = 1; //constant of max row in matrix
    public static final int MIN_REP_CL = 3; //constant of min column in matrix
    public static final int MAX_REP_CL = 4; //constant of max column in matrix

    public static final int MIN_BIRD_ROW = 4; //constant of min row in matrix
    public static final int MAX_BIRD_ROW = 5; //constant of max row in matrix
    public static final int MIN_BIRD_CL = 3; //constant of min column in matrix
    public static final int MAX_BIRD_CL = 4; //constant of max column in matrix

    public static final int MIN_DOG_ROW = 3; //constant of min row in matrix
    public static final int MAX_DOG_ROW = 5; //constant of max row in matrix
    public static final int MIN_DOG_CL = 0; //constant of min column in matrix
    public static final int MAX_DOG_CL = 2; //constant of max column in matrix

    private PetHabitats [][] matrixhabitats; //matrix of habitats



    public PetCenter()
    {
      pett = new Pet[MAX_PET];

      vets = new Veterinary[MAX_VETS];

      owners = new Owner[MAX_OWNERS]; 


    }

    /**
	*This method is to add a vet
	*@param id type String  
	*@param name type String
	*@param lastName type String
	*@param vetRegister type String
	*/


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

/**
	*This method is to find some vet in petcenter
	*@param ie type String  
	*/



	public String showremoveveterinary(String ie)
	{

		String sh;
		int count = 0;
		
		for(int i = 0; i < MAX_PET; i++){
			if(pett[i] == null)
				{
					count++;
				}
		}
		
		if(count == MAX_PET)
		{
			sh = "Vet has been eliminated successfully " + vets[ie].getNameVet() + " " + vets[ie].getLastName();
			vets[index] = null;
		} else sh = "Vet cant be eliminated cause are pets into veterinary";
		
		return sh;
	}




/**
	*This method is to change the status of a pet
	*Object of type pet must be in status waiting
	*Change pet status to DEPARTURE
	*@param name type String  
	*@param owner type String
	*/


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



//initialized habitats

	/**
	*This method is to initialized the "space" of habitat
	*/

	public void createdHabitats()
	{	
		matrixHabitats  = new PetHabitats[MAX_ROW_MATRIX][MAX_COLUMN_MATRIX];


		int acum = 0;

		for(int i = MIN_CAT_ROW; i <= MAX_CAT_ROW; i ++)
		{
			for(int j = MIN_CAT_CL; j <= MAX_CAT_CL; i++)
			{
				matrixHabitats[i][j] = new CatZone("CZ"+(acum+1), "200", "150", "100", "75"); 
				acum ++;
			}
		}



		acum = 0;

		for(int i = MIN_DOG_ROW; i <= MAX_DOG_ROW; i ++)
		{
			for(int j = MIN_DOG_CL; j <= MAX_DOG_CL; i++)
			{
				matrixHabitats[i][j] = new DogZone("DZ"+(acum+1), "200", "150", "2"); 
				acum ++;
			}
		}



		acum = 0;

			for(int i = MIN_RABB_ROW; i <= MAX_RABB_ROW; i ++)
		{
			for(int j = MIN_RABB_CL; j <= MAX_RABB_CL; i++)
			{
				matrixHabitats[i][j] = new RabbitZone("RZ"+(acum+1), "200", "150", "madriguera", "1");
				acum ++;
			}
		}



		acum = 0;

			for(int i = MIN_BIRD_ROW; i <= MAX_BIRD_ROW; i ++)
		{
			for(int j = MIN_BIRD_CL; j <= MAX_BIRD_CL; i++)
			{
				matrixHabitats[i][j] = new BirdZone("BZ"+(acum+1), "200", "150", "4", "100"); 
				acum ++;
			}
		}



		acum = 0;

			for(int i = MIN_REP_ROW; i <= MAX_REP_ROW; i ++)
		{
			for(int j = MIN_REP_CL; j <= MAX_REP_CL; i++)
			{
				matrixHabitats[i][j] = new ReptileZone("RpZ"+(acum+1), "400", "320","Madera");
				acum ++;
			}
		}


	

	}



public void showaddpetinhabitats()
{
	int op = 0;

	do
	{
		System.out.println("Choose some option\n"+
			"(1) CAT\n"+
			"(2) DOG\n"+
			"(3) RABBIT\n"+
			"(4) BIRD\n"+
			"(5) REPTILE");
		op = entradat.nextInt();
		entradat.nextLine();

		switch(op)
		{

			case 1:
			if(findHabitatCat() == true)
			{
				Species cat = Species.CAT;
		    System.out.print("Race\n");
		    String race = entradat.nextLine();
		    System.out.print("Pet's name\n");
		    String name = entradat.nextLine();
		    System.out.print("Age\n");
		    String age = entradat.nextLine();
		    System.out.print("ID owner\n");
		    String id = entradat.nextLine();
		    System.out.print("Name\n");
		    String name = entradat.nextLine();
		    System.out.print("Cellphone\n");
		    String cellphone = entradat.nextLine();
		    System.out.print("Address\n");
		    String address = entradat.nextLine();
		    System.out.print("Days in hospitalization\n");
		    String days = entradat.nextInt();
		    entradat.nextLine();

		    Pet nCat = new Pet(cat, race, name, age, id, name, cellphone, address, days);

		    System.out.println(findHabitatCat.addPet(op, ncat));
			}

			else System.out.println("No habitats available");
			break;


			case 2:
			if(findHabitatDog() == true)
			{
				Species dog = Species.DOG;
		    System.out.print("Race\n");
		    String race = entradat.nextLine();
		    System.out.print("Pet's name\n");
		    String name = entradat.nextLine();
		    System.out.print("Age\n");
		    String age = entradat.nextLine();
		    System.out.print("ID owner\n");
		    String id = entradat.nextLine();
		    System.out.print("Name\n");
		    String name = entradat.nextLine();
		    System.out.print("Cellphone\n");
		    String cellphone = entradat.nextLine();
		    System.out.print("Address\n");
		    String address = entradat.nextLine();
		    System.out.print("Days in hospitalization\n");
		    String days = entradat.nextInt();
		    entradat.nextLine();

		    Pet nDog = new Pet(dog, race, name, age, id, name, cellphone, address, days);

		    System.out.println(findHabitatDog.addPet(op, nDog));
			}

			else System.out.println("No habitats available");
			break;

			case 3:
			if(findHabitatRabbit() == true)
			{
				Species rabbit = Species.RABBIT;
		    System.out.print("Race\n");
		    String race = entradat.nextLine();
		    System.out.print("Pet's name\n");
		    String name = entradat.nextLine();
		    System.out.print("Age\n");
		    String age = entradat.nextLine();
		    System.out.print("ID owner\n");
		    String id = entradat.nextLine();
		    System.out.print("Name\n");
		    String name = entradat.nextLine();
		    System.out.print("Cellphone\n");
		    String cellphone = entradat.nextLine();
		    System.out.print("Address\n");
		    String address = entradat.nextLine();
		    System.out.print("Days in hospitalization\n");
		    String days = entradat.nextInt();
		    entradat.nextLine();

		    Pet nRabbit = new Pet(rabbit, race, name, age, id, name, cellphone, address, days);

		    System.out.println(findHabitatRabbit.addPet(op, nRabbit));
			}

			else System.out.println("No habitats available");
			break;

			case 4:
			if(findHabitatBird() == true)
			{
				Species bird = Species.BIRD;
		    System.out.print("Race\n");
		    String race = entradat.nextLine();
		    System.out.print("Pet's name\n");
		    String name = entradat.nextLine();
		    System.out.print("Age\n");
		    String age = entradat.nextLine();
		    System.out.print("ID owner\n");
		    String id = entradat.nextLine();
		    System.out.print("Name\n");
		    String name = entradat.nextLine();
		    System.out.print("Cellphone\n");
		    String cellphone = entradat.nextLine();
		    System.out.print("Address\n");
		    String address = entradat.nextLine();
		    System.out.print("Days in hospitalization\n");
		    String days = entradat.nextInt();
		    entradat.nextLine();

		    Pet nBird = new Pet(bird, race, name, age, id, name, cellphone, address, days);

		    System.out.println(findHabitatBird.addPet(op, nBird));
			}

			else System.out.println("No habitats available");
			break;

			case 5:
			if(findHabitatReptile() == true)
			{
				Species reptile = Species.REPTILE;
		    System.out.print("Race\n");
		    String race = entradat.nextLine();
		    System.out.print("Pet's name\n");
		    String pname = entradat.nextLine();
		    System.out.print("Age\n");
		    String age = entradat.nextLine();
		    System.out.print("ID owner\n");
		    String id = entradat.nextLine();
		    System.out.print("Name\n");
		    String name = entradat.nextLine();
		    System.out.print("Cellphone\n");
		    String cellphone = entradat.nextLine();
		    System.out.print("Address\n");
		    String address = entradat.nextLine();
		    System.out.print("Days in hospitalization\n");
		    String days = entradat.nextInt();
		    entradat.nextLine();

		    Pet nReptile = new Pet(reptile, race, name, age, id, name, cellphone, address, days);

		    System.out.println(findHabitatReptile.addPet(op, nReptile));
			}

			else System.out.println("No habitats available");
			break;


		}

	}while (optionnn !=0);

}


	//find pet
	public String findApet(String name)
	{
		msg ="";
		boolean c = false;
		boolean cc = false;

		for(int i = 0; i <= MAX_ROW_MATRIX && !c; i++)
		{
			for(int j = 0; j <= MAX_COLUMN_MATRIX && !cc; i++)
			{
				if(habitats [i][j].getPet().getName().equals(name))
				{
					c = true;
					cc = true;
					msg += "la mascota esta en "+ matrixHabitats[i][j].getIdNumber();

					if (matrixhabitats[i][j].getHabitatStatus() == HabitatStatus.E)
					{
						msg += "E";
					}
					else
					{
						msg += "S";

					}
				}
				else msg += "This name cant find here";

			}
		}
	}

	//show zone
	public void showzoneofpet()
	{
		System.out.println("Enter name of pet");
		String name = entradat.nextLine();

		System.out.println(findApet(name));
	}

	public void showmap()
	{
		System.out.print("this the method to ...");	
	}

	public void showinfohabitat()
	{
		System.out.print("this the method to ...");	
	}

	public void showStatistics()
	{
		System.out.print("this the method to ...");	
	}

	


//Methods of cat

	/**
	*This method is to find some space in the habitat of th matrix in the place of cats
	*/

	public boolean findHabitatCat()
	{
		boolean message = false;

				for(int i = MIN_CAT_ROW; i <= MAX_CAT_ROW && !message; i ++)
		{
			for(int j = MIN_CAT_CL; j <= MAX_CAT_CL && !message; i++)
			{
				if(matrixHabitats[i][j].getPet() == null)
				{
					message = true;
				}
				else message = false;
			}
		}
		return message;


	}

	/**
	*This method is to add a pet in the habitat of th matrix in the place of cat
	*/


	public String addCatInHabitat(String specie,String name,Owner ownerr,int days)
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
					matrixHabitats [i][j].setHabitatStatus(HabitatStatus.V);
					message = "the cat has been transfer to kindergarden";

				}
			}
		}
		return message;
	}


	

	//Methods of Dog

	/**
	*This method is to find some space in the habitat of th matrix in the place of dog
	*/

	public boolean findHabitatDog()
	{
		boolean message = false;

				for(int i = MIN_DOG_ROW; i <= MAX_DOG_ROW && !message; i ++)
		{
			for(int j = MIN_DOG_CL; j <= MAX_DOG_CL && !message; i++)
			{
				if(matrixHabitats[i][j].getPet() == null)
				{
					message = true;
				}
				else message = false;
			}
		}
		return message;


	}


	/**
	*This method is to add a pet in the habitat of th matrix in the place of dog
	*/

	public String addDogInHabitat(String specie,String name,Owner ownerr,int days)
	{
		boolean cen = false;

		String message ="";

		for(int i = MIN_DOG_ROW; i <= MAX_DOG_ROW && !cen; i ++)
		{
			for(int j = MIN_DOG_CL; j <= MAX_DOG_CL && !cen; i++)
			{
				if(matrixHabitats[i][j].getPet() ==  null)
				{
					cen = true;
					matrixHabitats [i][j].setPet(dog);
					matrixHabitats [i][j].setHabitatStatus(HabitatStatus.V);
					message = "the dog has been transfer to kindergarden";

				}
			}
		}
		return message;
	}




	//Methods of Rabbit

	/**
	*This method is to find some space in the habitat of th matrix in the place of rabbbits
	*/

	public boolean findHabitatRabbit()
	{
		boolean message = false;

				for(int i = MIN_RABB_ROW; i <= MAX_RABB_ROW && !message; i ++)
		{
			for(int j = MIN_RABB_CL; j <= MAX_RABB_CL && !message; i++)
			{
				if(matrixHabitats[i][j].getPet() == null)
				{
					message = true;
				}
				else message = false;
			}
		}
		return message;


	}

	/**
	*This method is to add a pet in the habitat of th matrix in the place of rabbit
	*/


	public String addRabbitInHabitat(String specie,String name,Owner ownerr,int days)
	{
		boolean cen = false;

		String message ="";

		for(int i = MIN_RABB_ROW; i <= MAX_RABB_ROW && !cen; i ++)
		{
			for(int j = MIN_RABB_CL; j <= MAX_RABB_CL && !cen; i++)
			{
				if(matrixHabitats[i][j].getPet() ==  null)
				{
					cen = true;
					matrixHabitats [i][j].setPet(rabbit);
					matrixHabitats [i][j].setHabitatStatus(HabitatStatus.V);
					message = "the rabbit has been transfer to kindergarden";

				}
			}
		}
		return message;
	}


	//Method of Bird

	/**
	*This method is to find some space in the habitat of th matrix in the place of bird
	*/

	public boolean findHabitatBird()
	{
		boolean message = false;

				for(int i = MIN_BIRD_ROW; i <= MAX_BIRD_ROW && !message; i ++)
		{
			for(int j = MIN_BIRD_CL; j <= MAX_BIRD_CL && !message; i++)
			{
				if(matrixHabitats[i][j].getPet() == null)
				{
					message = true;
				}
				else message = false;
			}
		}
		return message;


	}

	/**
	*This method is to add a pet in the habitat of th matrix in the place of bird
	*/

	public String addBirdInHabitat(String specie,String name,Owner ownerr,int days,AquariumType ttpr)
	{
		boolean cen = false;

		String message ="";

		for(int i = MIN_BIRD_ROW; i <= MAX_BIRD_ROW && !cen; i ++)
		{
			for(int j = MIN_BIRD_CL; j <= MAX_BIRD_CL && !cen; i++)
			{
				if(matrixHabitats[i][j].getPet() ==  null)
				{
					cen = true;
					matrixHabitats [i][j].setPet(bird);
					matrixHabitats [i][j].setHabitatStatus(HabitatStatus.V);
					message = "the bird has been transfer to kindergarden";

				}
			}
		}
		return message;
	}



	//Methods of Reptile

	/**
	*This method is to find some space in the habitat of th matrix in the place of reptile
	*/

	public boolean findHabitatReptile()
	{
		boolean message = false;

				for(int i = MIN_REP_ROW; i <= MAX_REP_ROW && !message; i ++)
		{
			for(int j = MIN_REP_CL; j <= MAX_REP_CL && !message; i++)
			{
				if(matrixHabitats[i][j].getPet() == null)
				{
					message = true;
				}
				else message = false;
			}
		}
		return message;


	}

	/**
	*This method is to add a pet in the habitat of th matrix in the place of reptile
	*/

	public String addReptileInHabitat(String specie,String name,Owner ownerr,int days,AquariumType prtt)
	{
		boolean cen = false;

		String message ="";

		for(int i = MIN_REP_ROW; i <= MAX_REP_ROW && !cen; i ++)
		{
			for(int j = MIN_REP_CL; j <= MAX_REP_CL && !cen; i++)
			{
				if(matrixHabitats[i][j].getPet() ==  null)
				{
					cen = true;
					matrixHabitats [i][j].setPet(bird);
					matrixHabitats [i][j].setHabitatStatus(HabitatStatus.V);
					message = "the reptile has been transfer to kindergarden";

				}
			}
		}
		return message;
	}










 


	

}