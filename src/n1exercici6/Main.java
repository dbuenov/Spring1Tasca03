package n1exercici6;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Integer> llista = new LinkedList<Integer>(); 
		
		inserirAlMig(llista, 0);
		inserirAlMig(llista, 1);
		System.out.println(llista.toString());
		inserirAlMig(llista, 2);
		System.out.println(llista.toString());
		inserirAlMig(llista, 3);
		System.out.println(llista.toString());
		inserirAlMig(llista, 4);
		System.out.println(llista.toString());
		inserirAlMig(llista, 5);
		System.out.println(llista.toString());
		inserirAlMig(llista, 6);
		System.out.println(llista.toString());
		inserirAlMig(llista, 7);
		System.out.println(llista.toString());
		inserirAlMig(llista, 8);
		System.out.println(llista.toString());
		inserirAlMig(llista, 9);
		System.out.println(llista.toString());
		inserirAlMig(llista, 10);
		System.out.println(llista.toString());
		inserirAlMig(llista, 11);
		System.out.println(llista.toString());
				
	}
	
	//he creat un mètode per afegir a la posició central de la llista
	public static void inserirAlMig(LinkedList<Integer> llista, int numero) {
		int posicio = llista.size()/2;
		ListIterator<Integer> it = llista.listIterator(posicio);
		it.add(numero);	
	}

}
