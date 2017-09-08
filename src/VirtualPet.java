
public class VirtualPet {

	// Attributes & Initial Status

	int hungerLevel;
	int boredomLevel;
	int tirednessLevel;

	public VirtualPet(int hunger, int boredom, int tiredness) {

		hungerLevel = hunger;
		boredomLevel = boredom;
		tirednessLevel = tiredness;

	}

	// Creating the display menu

	public String menu() {

		return ("Please select an option below by entering the corresponding number:\n1.  Let's Eat!\n2.  Let's Dance! \n3.  Let's Read a Bedtime Story! \n4.  Or we can be lame and we can do nothing...");

	}

	// Creating the status display

	public String status() {

		return ("Hunger Level " + hungerLevel + "\nBoredom Level " + boredomLevel + "\nTiredness Level "
				+ tirednessLevel);

	}

	// Activities

	void letsEat(int food) {
		hungerLevel += food;
	}

	void letsDance(int fun) {
		boredomLevel += fun;
	}

	void letsReadABedtimeStory(int sleep) {
		tirednessLevel += sleep;
	}
	
	// Tick Method
	
	void tickMethod (int tickTock) {
		tickTock++;
		hungerLevel--;
		boredomLevel-=3;
		tirednessLevel--;
	}
	
	// Is the Danimal still alive?
	
}
