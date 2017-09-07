
public class VirtualPet {

	// Attributes & Initial Values
	int hungerLevel = 8;
	int boredomLevel = 5;
	int tirednessLevel = 10;

	// Activities
	
	void letsEat (int food) {
		hungerLevel += food;
	}
	
	void letsDance (int fun) {
		boredomLevel += fun;
	}
	
	void letsReadABedtimeStory (int sleep) {
		tirednessLevel += sleep;
	}
}
