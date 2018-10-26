
abstract class Animal {
	public abstract void sound();
	public abstract void doWork();
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("¸Û¸Û");
	}
	@Override
	public void doWork() {
		
	}
}

class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("³Ä¿Ë");
	}
	@Override
	public void doWork() {
		
	}
}
public class Ex05 {
	Ex05() {
		String a = new String("Å¬·¡½º");
		Animal[] animal =  new Animal[5];
		animal[0] = new Dog();
		animal[1] = new Cat();
		animal[2] = new Dog();
		animal[3] = new Cat();
		
		animal[0].sound();
		animal[1].sound();
		animal[2].sound();
		animal[3].sound();
	}
	public static void main(String[] args) {
		new Ex05();	
	}
}
