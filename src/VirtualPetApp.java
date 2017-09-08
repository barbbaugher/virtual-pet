import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPet theDanimal = new VirtualPet(8, 5, 10);

		System.out.println("Meet the Danimal");
		System.out.println(theDanimal.status());
		System.out.println(theDanimal.menu());

		String menuEntry = input.next();

		switch (menuEntry) {
		case "1":
			int food = 2;
			theDanimal.letsEat(food);
			System.out.println("Nom Nom Nom");
			break;
		case "2":
			int fun = 5;
			theDanimal.letsDance(fun);
			System.out.println("Put on your red shoes and dance the blues");
			break;

		case "3":
			int sleep = 5;
			theDanimal.letsReadABedtimeStory(sleep);
			System.out.println("Once upon a time... ");
			break;

		case "4":

		}

		input.close();
	}

}
