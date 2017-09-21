
public class VirtualPet {

	// Attributes & initial status

	int hungerLevel;
	int boredomLevel;
	int tirednessLevel;

	public VirtualPet(int hunger, int boredom, int tiredness) {
		hungerLevel = hunger;
		boredomLevel = boredom;
		tirednessLevel = tiredness;
	}

	// The welcome display

	public String welcome() {
		return ("Meet the Danimal:\n        _________         .    .\r\n" + "       (..       \\_    ,  |\\  /|\r\n"
				+ "        \\       0  \\  /|  \\ \\/ /\r\n" + "         \\______    \\/ |   \\  /\r\n"
				+ "            vvvv\\    \\ |   /  |\r\n" + "            \\^^^^  ==   \\_/   |\r\n"
				+ "             `\\_   ===    \\.  |\r\n" + "             / /\\_   \\ /      |\r\n"
				+ "             |/   \\_  \\|      /\r\n" + "                    \\________/");
	}

	// The menu display

	public String menu() {
		return ("Please select an option below by entering the corresponding number:\n1.  Let's Eat!\n2.  Let's Dance! \n3.  Let's Read a Bedtime Story! \n4.  Or we can be lame and we can do nothing...\n5.  Exit the program.\n");
	}

	// Invalid menu option entered

	public String invalidMenuOption() {
		return ("Please select a valid menu option.\n");
	}

	// The status display

	public String status() {
		return ("Hunger Level: " + hungerLevel + "\nBoredom Level: " + boredomLevel + "\nTiredness Level: "
				+ tirednessLevel + "\n");
	}

	// Activities

	void letsEat(int food) {
		hungerLevel += food;
		tirednessLevel -= 1;
	}

	public String afterEating() {
		return ("Nom, nom, nom...\n");
	}

	void letsDance(int fun) {
		boredomLevel += fun;
		tirednessLevel -= 1;
	}

	public String afterDancing() {
		return ("Put on your red shoes and dance the blues...\n");
	}

	void letsReadABedtimeStory(int sleep) {
		tirednessLevel += sleep;
		hungerLevel -= 2;
		boredomLevel -= 1;
	}

	public String afterSleeping() {
		return ("Once upon a time...\n");
	}

	// Tick method

	void tickMethod() {
		hungerLevel--;
		boredomLevel -= 2;
		tirednessLevel--;
	}

	// Is the Danimal still alive?

	Boolean isTheDanimalAliveAndWell() {
		if (hungerLevel > 0 && boredomLevel > 0 && tirednessLevel > 0) {
			return true;
		}
		return false;
	}

	public String causeOfDeath() {
		if (hungerLevel <= 0) {
			return ("You starved the Danimal to death...");
		} else if (boredomLevel <= 0) {
			return ("You bored the Danimal to death...");
		}
		return ("The Danimal died of exhaustion.");
	}

	// Exit menu

	public String afterExit() {
		return ("Thanks for playing.\n");
	}
}
