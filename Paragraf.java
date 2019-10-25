package dp_lab2;

public class Paragraf implements Element{
	private String text;

	public Paragraf(String text) {
		super();
		this.text = text;
	}

	public void print()
	{
		System.out.println("Paragraf: " + this.text);
	}
}
