package dp_lab2;

public class Tabel implements Element{
	private String nume;

	public Tabel(String nume) {
		super();
		this.nume = nume;
	}
	
	@Override
	public void print()
	{
		System.out.println("Tabel: " + this.nume);
	}
}
