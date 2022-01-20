package n3exercici1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		long inici = System.nanoTime();
		Contenidora contenidora = new Contenidora(3);
		contenidora.add("Un");
		contenidora.add("Dos");
		contenidora.add("Tres");
		contenidora.add("Quatre");
		contenidora.add("Cinc");
		long fi = System.nanoTime();

        long diferencia = fi-inici;
		double diferenciaMilisegons = (double) diferencia / 1_000_000;
		System.out.println("Temps d'un Array sobredimensionat");
		System.out.println(diferenciaMilisegons+ " milisegons");
       
        inici = System.nanoTime();
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Un");
        arrayList.add("Dos");
        arrayList.add("Tres");
        arrayList.add("Quatre");
        arrayList.add("Cinc");
		fi = System.nanoTime();

        diferencia = fi-inici;
		diferenciaMilisegons = (double) diferencia / 1_000_000;
		System.out.println("Temps d'un ArrayList");
        System.out.println(diferenciaMilisegons+ " milisegons");
        
        //amb només 5 elements la diferencia es molt gran
        
	}

}
