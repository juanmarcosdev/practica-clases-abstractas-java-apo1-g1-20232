package model;

public class AnimalHerbivoro extends Animal {

	@Override
	public void alimentarse() {
		System.out.println("Los herbivoros solo comen plantas y vegetales");
	}
}