import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPet theDanimal = new VirtualPet();

		System.out.println("Meet the Danimal:");
		System.out.println("The Danimal is not hungry: " + theDanimal.hungerLevel);
		System.out.println("The Danimal is bored: " + theDanimal.boredomLevel);
		System.out.println("The Danimal is not sleepy: " + theDanimal.tirednessLevel);
		System.out.println("Please select an option below by entering the corresponding number:");
		System.out.println("1.  Let's Eat!");
		System.out.println("2.  Let's Dance!");
		System.out.println("3.  Let's Read a Bedtime Story!");
		System.out.println("4.  Or you can be lame and we can do nothing...");

		String menuEntry = input.next();

		switch (menuEntry) {
		case "1":
			int food = 2;
			theDanimal.letsEat(food);
			System.out.println("Nom Nom Nom" + theDanimal.hungerLevel);
			break;
		case "2":
			int fun = 5;
			theDanimal.letsDance(fun);
			System.out.println("Put on your red shoes and dance the blues" + theDanimal.boredomLevel);
			break;

		case "3":
			int sleep = 5;
			theDanimal.letsReadABedtimeStory(sleep);
			System.out.println("Once upon a time... " + theDanimal.tirednessLevel);
			break;

		case "4":

		}

		input.close();
	}

}
