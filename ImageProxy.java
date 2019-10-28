package dp_lab2;

public class ImageProxy implements  Element {


private String nume;
private Imagine realImage;
public ImageProxy(String nume) {
	super();
	this.nume = nume;
}


public void print()
{

	if(realImage == null ) 
		realImage=new Imagine(this.nume);
	else
		realImage.print();
	
	
	
}

}
