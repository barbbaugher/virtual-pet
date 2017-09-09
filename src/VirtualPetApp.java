import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPet theDanimal = new VirtualPet(8, 5, 10);

		System.out.println(theDanimal.welcome());

		int tickTock = 0;

		do {

			System.out.println(theDanimal.status());
			System.out.println(theDanimal.menu());

			String menuEntry = input.next();

			switch (menuEntry) {

			case "1":
				int food = 3;
				theDanimal.letsEat(food);
				System.out.println(theDanimal.afterEating());
				theDanimal.tickMethod(tickTock);
				break;

			case "2":
				int fun = 6;
				theDanimal.letsDance(fun);
				System.out.println(theDanimal.afterDancing());
				theDanimal.tickMethod(tickTock);
				break;

			case "3":
				int sleep = 5;
				theDanimal.letsReadABedtimeStory(sleep);
				System.out.println(theDanimal.afterSleeping());
				theDanimal.tickMethod(tickTock);
				break;

			case "4":
				theDanimal.tickMethod(tickTock);
				break;

			case "5":
				System.out.println(theDanimal.afterExit());
				System.exit(0);
				break;

			default:
				System.out.println(theDanimal.invalidMenuOption());

			}

		} while (theDanimal.isTheDanimalAliveAndWell());

		System.out.println(theDanimal.causeOfDeath());

		input.close();
	}

}
