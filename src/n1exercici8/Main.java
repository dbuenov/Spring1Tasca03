package n1exercici8;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<String, String> map = new LinkedHashMap<String, String>();
		
		map.put("a", "Ham");
		map.put("c", "Rex");
		map.put("d", "Jessie");
		map.put("e", "Sra Potato");
		map.put("b", "Woody");
		map.put("g", "Buzz");
		map.put("f", "Sr Potato");
		
		//linkedHashMap NO ordenat
		System.out.println("mapa sense endreçar");
		System.out.println(map);
		
		//fico els valors a un ArrayList
		ArrayList<Map.Entry<String, String>> arrayList = new ArrayList<Map.Entry<String, String>>(map.entrySet());
		System.out.println("ArrayList sense endreçar");
		System.out.println(arrayList.toString());
				
		//amb la clase OrdenarArrayList que implementa Comparable, endreço l'ArrayList
		Collections.sort(arrayList, new OrdenaArrayList());
		
		//ArrayList ja ordenat
		System.out.println("ArrayList endreçat");
		System.out.println(arrayList.toString());
		
		//creo un nou LinkedHashMap i fico els valors per ordre
		Map<String, String> mapOrdenat = new LinkedHashMap<String, String>();
		
		for(Map.Entry<String, String> posicio : arrayList) {
			mapOrdenat.put(posicio.getKey(), posicio.getValue());
		}
		
		//resultat del mapa ordenat
		System.out.println("mapa endreçat");
		System.out.println(mapOrdenat.toString());
		
		
	}
}


