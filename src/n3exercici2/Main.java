package n3exercici2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		long inici = System.nanoTime();
		Contenidora contenidora = new Contenidora(3);
		contenidora.add(1);
		contenidora.add(2);
		contenidora.add(3);
		contenidora.add(4);
		contenidora.add(5);
		long fi = System.nanoTime();

        long diferencia = fi-inici;
		double diferenciaMilisegons = (double) diferencia / 1_000_000;
		System.out.println("Temps d'un Array sobredimensionat");
		System.out.println(diferenciaMilisegons+ " milisegons");
       
        inici = System.nanoTime();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
		fi = System.nanoTime();

        diferencia = fi-inici;
		diferenciaMilisegons = (double) diferencia / 1_000_000;
		System.out.println("Temps d'un ArrayList");
        System.out.println(diferenciaMilisegons+ " milisegons");
        
        //amb només 5 elements la diferencia es molt gran
        
	}

}
