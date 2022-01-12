package n1exercici4;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		//faig servir la clase de l'exercici anterior per emplenar els tipus de coleccions
		
		
		Generadora generadora = new Generadora();
		int tamany = generadora.tamanyLlista();
				
		ArrayList<String> arrayList = new ArrayList<String>();
		for (int i = 0; i < tamany; i++) {
			arrayList.add(generadora.seguentPersonatge());
		}
		System.out.println("ArrayList");
		
		//faig servir el nou mètode per imprimir
		imprimirColeccio((AbstractCollection)arrayList);
				
		
		LinkedList<String> linkedList = new LinkedList<String>();
		for (int i = 0; i < tamany; i++) {
			linkedList.add(generadora.seguentPersonatge());
		}
		System.out.println("LinkedList");
		imprimirColeccio((AbstractCollection)linkedList);
		
		
		HashSet<String> hashSet = new HashSet<String>();
		for (int i = 0; i < tamany; i++) {
			hashSet.add(generadora.seguentPersonatge());
		}
		System.out.println("HashSet");
		imprimirColeccio((AbstractCollection)hashSet);
				
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		for (int i = 0; i < tamany; i++) {
			linkedHashSet.add(generadora.seguentPersonatge());
		}
		System.out.println("LinkedHashSet");
		imprimirColeccio((AbstractCollection)linkedHashSet);
		
		
		TreeSet<String> treeSet = new TreeSet<String>();
		for (int i = 0; i < tamany; i++) {
			treeSet.add(generadora.seguentPersonatge());
		}
		System.out.println("TreeSet");
		imprimirColeccio((AbstractCollection)treeSet);

	}
	
	//faig servir una clase mare de les coleccions per pasarla per paràmetre
	
	public static void imprimirColeccio(AbstractCollection<Object> colleccio ) {
		
		Iterator<Object> it = colleccio.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next().toString()+" ");
		}
		System.out.println();
		

	}

}
