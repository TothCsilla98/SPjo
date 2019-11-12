package dp_lab2;

import java.util.concurrent.TimeUnit;

public class Imagine implements Element{
	String nume;

	public Imagine(String nume) {
		super();
		this.nume = nume;
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
	
	public void accept(Visitor a) {
		a.visit(this);
			
	}
	 public void add(Element element) {
    System.out.println("ERORR");
  }

  @Override
  public void remove(Element element) {
    System.out.println("ERORR");
  }

  @Override
  public Element getElement(int index) {
    System.out.println("ERORR");
    return null;
  }
}

