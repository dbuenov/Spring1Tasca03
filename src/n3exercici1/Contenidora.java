package n3exercici1;

import java.util.Arrays;

public class Contenidora {
	
	private String[] llista;
	int elements=0;

	public Contenidora(int size) {
		
		this.llista = new String[size];
				
	}

	public String[] getLlista() {
		return llista;
	}

	public void add(String cadena) {
		if(elements<this.llista.length) {
			llista[elements] = cadena;
			elements++;
		}else {
			//String[] copia;
			llista = Arrays.copyOf(llista, elements+1);
			llista[elements] = cadena;
			elements++;
			
		}
		
		
	}
	
	
	
	
	
	
}
