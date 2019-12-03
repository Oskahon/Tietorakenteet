package tehtava6;

import java.util.Iterator;
import java.util.LinkedList;

public class Stack {

	private LinkedList<String> list;
	
	public Stack() {
		list = new LinkedList<>();
	}
	
	// muodostetaan uusi lista-alkio, asetetaan se pinon huipulle
	public void push(String aData) {
		list.add(aData);
		
	}
	
	// poistetaan lista-alkio pinon huipulta, jos pino tyhjä, palautetaan null
	public String pop() {
		if (!list.isEmpty()) {
		return list.removeLast();
		}
		return null;
	}
	
	// tulostetaan pinon sisältö
	public void printItems() {
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next()); 
		}
	}
	
	public int getSize() {
		return list.size();
	}
	
}
