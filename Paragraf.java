package dp_lab2;

public class Paragraf implements Element{

	private String text;
	private  AlignStrategy aliniere;

	public Paragraf(String text) {
		super();
		this.text = text;
	}
	

	
	public void setAlignStrategy(AlignStrategy alig)
	{
		aliniere=alig;
		
	}

	
	public void print()
	{   
		
		if(aliniere!=null)
			aliniere.print(this.text);
		else
			System.out.println("Paragraf: " + this.text);
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
