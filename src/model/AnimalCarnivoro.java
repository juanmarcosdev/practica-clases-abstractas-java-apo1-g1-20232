package model;

public class AnimalCarnivoro extends Animal {

	@Override
	public void alimentarse() {
		System.out.println("Solo me alimento de carne");
	}
}