package n3exercici2;

import java.util.Arrays;

public class Contenidora {
	
	private Integer[] llista;
	int elements=0;

	public Contenidora(int size) {
		
		this.llista = new Integer[size];
				
	}

	public Integer[] getLlista() {
		return llista;
	}

	public void add(Integer numero) {
		if(elements<this.llista.length) {
			llista[elements] = numero;
			elements++;
		}else {
			llista = Arrays.copyOf(llista, elements+1);
			llista[elements] = numero;
			elements++;
			
		}
		
		
	}
	
	
	
	
	
	
}
