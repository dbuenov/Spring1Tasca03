package n2exercici1;

import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		
		Numero primer = new Numero();
		Numero segon  = new Numero();
		Numero tercer = new Numero();
		Numero quart  = new Numero();
		Numero cinque = new Numero();
		Numero sise   = new Numero();
		Numero sete   = new Numero();
		Numero vuite  = new Numero();
		Numero nove   = new Numero();
		Numero dece   = new Numero();
			
		//necessito poder dir quin es l'ordre de prioritat
		ComparadorDeNumeros comparador = new ComparadorDeNumeros();
		
		PriorityQueue<Numero> cua = new PriorityQueue<Numero>(10, comparador);
				
		cua.add(primer);
		cua.add(segon);
		cua.add(tercer);
		cua.add(quart);
		cua.add(cinque);
		cua.add(sise);
		cua.add(sete);
		cua.add(vuite);
		cua.add(nove);
		cua.add(dece);
		
		//surten ordenats de menor a major
		while(!cua.isEmpty()) {
			System.out.println(cua.poll().getRandom());
		}

	}

}
