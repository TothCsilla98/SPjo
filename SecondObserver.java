package dp_lab2;

import java.util.Observable;
import java.util.Observer;

public class SecondObserver implements Observerr{

	public void update(String oldValue, String newValue) {
		System.out.println("SecondObserver: Oldvalue :  "+oldValue+" newValue: "+newValue);
		
	}


}
