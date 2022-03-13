// Interface
interface Animal {
	public void animalSound();
	public void sleep();
}

// Pig implements animal interface
class Pig implements Animal {
	public void animalSoundn() {
		System.out.println("The pig says: wee wee");
	}

	public void sleep() {
		System.out.println("Zzz");
	}
}

class Classes10 {
	public static void main(String[] args) {
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
	}
}