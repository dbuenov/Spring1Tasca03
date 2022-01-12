package n1exercici4;

import java.util.ArrayList;

public class Generadora {
	
	private int index;
	private ArrayList<String> personatges;
		
	public Generadora() {
		this.index = 0;
		personatges = new ArrayList<String>();
		personatges.add("Woody");
		personatges.add("Buzz");
		personatges.add("Sr Potato");
		personatges.add("Ham");
		personatges.add("Rex");
		personatges.add("Jessie");
		personatges.add("Sra Potato");
	}
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	//primer controlo que no estiguem a la ultima posició, en aquest cas reiniciem
	public String seguentPersonatge() {
		if (index == personatges.size()) {
			index = 0;
		}
		String personatge = personatges.get(index);
		index ++;
		return personatge; 		
	}
	
	//el faré servir per consultar el tamany de la llista de personatges
	public int tamanyLlista() {
		return personatges.size();
	}
	
}
