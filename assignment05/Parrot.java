package assignment05;

public class Parrot extends Animal {

	private String phrase;

	public Parrot(String name, String phrase) {
		super(name);
		this.phrase = phrase;
	}

	@Override
	public String speak() {
		return phrase;
	}
}