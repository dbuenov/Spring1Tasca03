package n1exercici5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> llista1 = new ArrayList<Integer>();
		List<Integer> llista2 = new ArrayList<Integer>();
		
		llista1.add(1);
		llista1.add(2);
		llista1.add(3);
		llista1.add(4);
		llista1.add(5);
		
		llista2.add(6);
		llista2.add(7);
		llista2.add(8);
		llista2.add(9);
		llista2.add(10);
		
		//per recorrer la llista de forma inversa
		ListIterator<Integer> it = llista1.listIterator(llista1.size());
		
		while (it.hasPrevious()) {
			llista2.add(it.previous());
		}
		
		System.out.println(llista2.toString());
		
		
		
		
		
		
		
		
		
		
		
		
			

	}

}
