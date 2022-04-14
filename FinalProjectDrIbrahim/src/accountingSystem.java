import java.util.Scanner;

public class accountingSystem {

	public static void main(String[] args) {
		
		/* ----- Declaring Objects ----- */
		Scanner Keyborad = new Scanner (System.in); //Scanner Object
		
		
		
		/* ----- The Code ----- */
		System.out.println("\t\t" + "----- Welcome to Java Subermarket -----");
	
		System.out.println("\t\t" + "----- Please Choose From the Menu Below -----");
		
			
			System.out.print("\n\n\t" //The Menu
					+ " The Menu: "
					+ "\n\t" + "1- Eggs         / 19 SR"
					+ "\n\t" + "2- Meat         / 56 SR"
					+ "\n\t" + "3- Chicken      / 15 SR"
					+ "\n\t" + "4- Bread        / 1  SR"
					+ "\n\t" + "5- Potatoes     / 5  SR"
					+ "\n\t" + "6- Tomatoes     / 5  SR"
					+ "\n\t" + "7- Parsley      / 1  SR"
					+ "\n\t" + "8- Onions       / 4  SR"
					+ "\n\t" + "9- Shampoo      / 17 SR"
					+ "\n\t" + "10- Toothpaste  / 13 SR"
					+ "\n\t" + "11- Napkins     / 25 SR");
			System.out.print("\n\n\t" + "Choose: ");
			int items = Keyborad.nextInt();
			
			
			//If else Statement for Determine What to Print
			if (items == 1) {
				Bill("Eggs", 19);
			}
			else if (items == 2) {
				Bill("Meat", 56);
			}
			else if (items == 3) {
				Bill("Chicken", 15);
			}
			else if (items == 4) {
				Bill("Bread", 1);
			}
			else if (items == 5) {
				Bill("Potatoes", 5);
			}
			else if (items == 6) {
				Bill("Tomatoes", 5);
			}
			else if (items == 7) {
				Bill("Parsley", 1);
			}
			else if (items == 8) {
				Bill("Onions", 4);
			}
			else if (items == 9) {
				Bill("Shampoo", 17);
			}
			else if (items == 10) {
				Bill("Toothpaste", 13);
			}
			else if (items == 11) {
				Bill("Napkins", 25);
			}
			
		
		
		
		Keyborad.close();

	}
	
	public static void Bill (String name, int price) { //Bill Method - For Printing the Bill With Different Variables
		System.out.print("\n\n" + "Here is Your Bill: ");
		System.out.println("\n\n"
						  +" " + "---------------------------------------"
						  + "\n" + "|" + "\t" + "JAVA SUBERMARKET"                       + "\t\t" + "|"
						  + "\n" + "|" + "\t"                                            + "\t\t\t\t" + "|"
						  + "\n" + "|" + "\t" + "Items:        Price:"                      + "\t\t" + "|"
						  + "\n" + "|" + "\t"                                            + "\t\t\t\t" + "|"
						  + "\n" + "|" + "       " + name + "          " + price                       + "\t\t|"
						  + "\n" + "|" + "\t"                                            + "\t\t\t\t" + "|"
						  + "\n" + "|" + "\t"                                            + "\t\t\t\t" + "|"
						  + "\n" + "|" + "\t" + "-----------------------"                + "\t\t" + "|"
						  + "\n" + "|" + "\t"                                            + "\t\t\t\t" + "|"
						  + "\n" + "|" + "\t" + "Number of Items: 1"                     + "\t\t" + "|"
						  + "\n" + "|" + "\t" + "Price without tax: " + price + " SR  "    + "\t" + "|"
						  + "\n" + "|" + "\t" + "Tax: " + (price * 0.15) + " SR"            + "\t\t\t" + "|"
						  + "\n" + "|" + "\t" + "Final Price with tax: " + ((price * 0.15) + price) + " SR" + "\t" + "|"
						  + "\n" + "|" + "\t"                                            + "\t\t\t\t" + "|"
						  + "\n" + "|" + "\t"                                            + "\t\t\t\t" + "|"
						  + "\n" + "|" + "\t" + "THANK YOU, AND COME AGAIN"              + "\t" + "|"
						  + "\n" + "|" + "\t"                                            + "\t\t\t\t" + "|"
						  + "\n" + "|" + "\t"                                            + "\t\t\t\t" + "|"
						  + "\n"
						  + " " + "---------------------------------------");
	}

}
