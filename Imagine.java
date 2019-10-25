package dp_lab2;

public class Imagine implements Element{
	private String nume;

	public Imagine(String nume) {
		super();
		this.nume = nume;
	}
	
	@Override
	public void print()
	{
		System.out.println("Imagine: " + this.nume);
	}
}
