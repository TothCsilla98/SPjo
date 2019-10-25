package dp_lab2;

import java.util.ArrayList;
import java.util.List;

public class Carte {
	private String name;
	private List<Autor> autori;
	private List<Element> cuprins;
	
	public Carte(String name) {
		this.name=name;
		this.autori=new ArrayList<Autor>();
		this.cuprins= new ArrayList<Element>();
	}
	
	
	public void print()
	{
		System.out.println(this.name);
		for(Autor x : this.autori)
		{
			System.out.println(x.print());
		}
		for(Element x : this.cuprins)
		{
			x.print();
		}
		
	}


	public void AddAutor(Autor a)
	{
		autori.add(a);
	}
	
	public int addContent(Element elm)
	{
		cuprins.add(elm);
		return cuprins.indexOf(elm);
	}
	
	/*public Capitol GetCapitol(int index)
	{
		return cuprins.get(index);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Autor> getAutori() {
		return autori;
	}

	public List<Capitol> getCuprins() {
		return cuprins;
	}

	public void setCuprins(List<Capitol> cuprins) {
		this.cuprins = cuprins;
	}*/
	
	public static void main(String[] args)
	{
		Carte noapteBuna = new Carte("Noapte buna, copii!");
		Autor rpGheo = new Autor("Radu Pavel Gheo");
		noapteBuna.AddAutor(rpGheo);
		Section cap1 = new Section("Capitolul 1");
		Section cap11 = new Section("Capitolul 1.1");
		Section cap111 = new Section("Capitolul 1.1.1");
		Section cap1111 = new Section("Subchapter 1.1.1.1");
		noapteBuna.addContent(new Paragraf("Multumesc celor care au facut posibila......"));
		noapteBuna.addContent(cap1);
		cap1.addElm(new Paragraf("Moto capitol"));
		cap1.addElm(cap11);
		cap11.addElm(new Paragraf("Text from subchapter 1.1"));
		cap11.addElm(cap111);
		cap111.addElm(new Paragraf("Text from subchapter 1.1.1"));
		cap111.addElm(cap1111);
		cap1111.addElm(new Imagine("Image subchapter 1.1.1.1"));
		noapteBuna.print();
	}
	
}
