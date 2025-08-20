package firstCodingAssignment.zoo;


public class Animal {
	public String name;
	public int age;
	public String sound;
	
	public Animal (String name, int age, String sound) {
		this.name = name;
		this.age = age;
		this.sound = sound;
	}
	public void makeSound() {
		System.out.println(this.sound);
	}
}
