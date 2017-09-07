
public class VirtualPet {

	// Attributes & Initial Values
	int hunger = 8;
	int boredom = 5;
	int tired = 10;

	// Activities
	
	void letsEat (int food) {
		hunger += food;
	}
	
	void letsDance (int fun) {
		boredom += fun;
	}
}
