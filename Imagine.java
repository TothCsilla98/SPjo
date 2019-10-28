package dp_lab2;

import java.util.concurrent.TimeUnit;

public class Imagine implements Element{
	public String nume;

	public Imagine(String nume) {
		super();
		this.nume = nume;
		//imageName = nume;
		try {
			TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
	}
	
	@Override
	public void print()
	{
		System.out.println("Imagine: " + this.nume);
	}
}
