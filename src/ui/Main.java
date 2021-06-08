package ui;
import java.util.Scanner;
import model.PetCenter;
import model.Priority;
import java.util.ArrayList;
import model.Owner;
import model.AquariumType;
import model.CageType;
import model.HabitatStatus;

/**
*descripction:  name of the class to solve the problem using a Menu
*/

public class Main
{
	private Scanner entradat;
	private PetCenter petcenter;


	/*
	*main that use scanner and petcenter
	*/
	public Main ()  
	{
		entradat = new Scanner (System.in);
		petcenter = new PetCenter();

	}

	/**
    @param args array of strings as part main´s method of the program to redirect to Menu
    */
	public static void main (String[] args)
	{
		Main op = new Main();

		op.showMenuPrincipal();


	}

	public void showMenuPrincipal()
	{
		int optionn = 0;

		do{
			System.out.println("Menu:\n"+
				"(1) Emergencies\n"+
				"(2) kindergarten");

				optionn = entradat.nextInt();
				entradat.nextLine();

				switch (optionn) // Switch that redirect the class to de user chose
				{
				case 1:
				showMenu(); 									
				break;

				case 2:                 					
				showMenuKinder();       
				break;
				}

			}while (optionn !=0);

	}


    /**
    *description: first method that corresponds to the introductory menu 
    *descripción: method for the execution of the problems
    */
	public void showMenu()  //
	{
		int option = 0;

		do{
			System.out.println("Menu:\n"+
				"(1) Add Vete\n"+
				"(2) Remove Veterinarian\n"+
				"(3) Register Pet\n"+
				"(4) Remove Pet\n"+
				"(5) Start Consultation\n"+
				"(6) End Consultation\n"+
				"(7) Show number of pets attended\n"+
				"(8) Closing daily\n"+
				"(0) Close Program");

				option = entradat.nextInt();
				entradat.nextLine();

				switch (option) // Switch that redirect the class to de user chose
				{
				case 1: 									//option to add a veterinarian
				System.out.print("enter ID\n");
				String id = entradat.nextLine();
				System.out.print("enter name\n");
				String nameVet = entradat.nextLine();
				System.out.print("enter fullname\n");
				String fullName = entradat.nextLine();
				System.out.print("enter unique veterinary register\n");
				String vetRegister = entradat.nextLine();
				petcenter.showaddvet(id,nameVet,fullName,vetRegister);
				break;

				case 2:   
				System.out.print("enter ID of Vet\n");
				String id = entradat.nextLine();              					//option to remove a veterinary
				petcenter.showremoveveterinary(id);

				break;

				case 3:                                     // option to add a new pet 
				System.out.print("enter specie\n");
				String specie =entradat.nextLine();
				System.out.print("enter name\n");
				String name = entradat.nextLine();
				System.out.print("enter age\n");
				String age = entradat.nextLine();
				System.out.print("enter race\n");
				String race = entradat.nextLine();
				System.out.print("enter symptom\n");
				String symptoms = entradat.nextLine();
				System.out.print("enter name of id owner\n");
				String owner = entradat.nextLine();
				System.out.print("enter priority level (RED, ORANGE, YELLOW, GREEN, BLUE, NOTONE)\n");
				String priority = entradat.nextLine();
				Priority tpr = vPriority(priority);
				petcenter.showaddpet(specie,name,age,race,symptoms,owner,tpr);
				break;

				case 4:	                                  //option to remove a pet
				System.out.print("enter name\n");
				String nameo =entradat.nextLine();
				System.out.print("enter name owner\n");
				String nameowner = entradat.nextLine();									
				petcenter.showremovepet(nameo, nameowner);
				break;

				case 5:										//option to start a consultation
				petcenter.showstartconsultation();
				break;

				case 6:										//option to end a consultation
				petcenter.showendconsultation();
				break;

				case 7:										//option to show the smount of pets attended
				petcenter.showamountpets();
				break;

				case 8:									    //option to close the day
				petcenter.showdailyclosing();
				break;

				case 0:
				System.out.println("Bye :)");               //option to close th program

			 }
			


		    }while (option !=0);

			


	}


	public void showMenuKinder()
	{
		int optionnn = 0;

		do{
			System.out.println("Menu kindergarden:\n"+
				"(1) ADD\n"+
				"(2) SHOW Zone of pet\n"+
				"(3) Map\n"+
				"(4) Info Pet and Habitat\n"+
				"(5) Statistics\n"+
				"(0) go back\n");

				optionnn = entradat.nextInt();
				entradat.nextLine();

				switch (optionnn) // Switch that redirect the class to de user chose
				{
				case 1:
				showaddpetinhabitats();
				break;

				case 2:                 					
				showzoneofpet();      
				break;

				case 3:                 					
				showmap();      
				break;

				case 4:                 					
				showinfohabitat();      
				break;

				case 5:                 					
				showStatistics();      
				break;

				case 2:                 					
				showzoneofpet();      
				break;
				}

			}while (optionnn !=0);

	}

	/**
    *description: method that evaluates the entered string and also assigns the priority of  pet
    *@param priority type String
    *@return return priority
    */

	public Priority vPriority(String priority)

	{
		Priority prt = Priority.NOTONE;

		if( priority.equalsIgnoreCase("RED"))
		{
			prt = Priority.RED;

		}

		else if( priority.equalsIgnoreCase("ORANGE"))
		{
			prt = Priority.ORANGE;

		}

		else if( priority.equalsIgnoreCase("YELLOW"))
		{
			prt = Priority.YELLOW;

		}

		else if( priority.equalsIgnoreCase("GREEN"))
		{
			prt = Priority.GREEN;

		}

		else if( priority.equalsIgnoreCase("BLUE"))
		{
			prt = Priority.BLUE;

		}return prt;
	}


}

