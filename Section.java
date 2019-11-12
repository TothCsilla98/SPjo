package dp_lab2;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
	private String title;
	private List<Element> content;

	public Section(String title) {
		super();
		this.title = title;
		this.content=new ArrayList<Element>();
	}

	public int addElm(Element elm)
	{
		content.add(elm);
		return content.indexOf(elm);
	}
	
	public void delete(Element elm)
	{
		content.remove(elm);
	}
	
	public Element getElement(int ind)
	{
		return content.get(ind);
	}
	@Override
	public void print()
	{
		System.out.println(this.title);
		for(Element x : content)
		{
			x.print();
		}
	}
	
public void accept(Visitor a) {
	a.visit(this);
	
	 for (Element x : content) {
	      x.accept(a);
	    }
		
}

@Override
public void add(Element element) {
	// TODO Auto-generated method stub
	
}

@Override
public void remove(Element element) {
	// TODO Auto-generated method stub
	
}
}
