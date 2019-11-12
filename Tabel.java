package dp_lab2;

import java.util.List;

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
	
	public void accept(Visitor a) {
		a.visit(this);  
	

		
	}

	public void add(Element x) {
    System.out.println("ERORR");
  }

  @Override
  public void remove(Element x) {
    System.out.println("ERORR");
  }

  @Override
  public Element getElement(int index) {
    System.out.println("ERORR");
    return null;
  }
}

