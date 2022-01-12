package n1exercici7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(10, "Ham");
		map.put(100, "Rex");
		map.put(1000, "Jessie");
		map.put(800, "Sra Potato");
		map.put(60, "Woody");
		map.put(33, "Buzz");
		map.put(2000, "Sr Potato");
		
		//com queda el HashMap, NO ordenat
		System.out.println(map);
				
		//com queda al pasar-ho a un TreeMap, ordenat
		TreeMap <Integer, String> mapOrdenat = new TreeMap<>(map);
		System.out.println(mapOrdenat);
				
		//i ara a un LinkedHashMap, ordenat
		LinkedHashMap linkedMap = new LinkedHashMap(mapOrdenat);
		System.out.println(linkedMap);
		
		
		
		//per recorrer el LinkedHashMap, extrec les claus
		Set<Integer> claus = linkedMap.keySet();
        
        // fico les claus en un HashSet
		HashSet<Integer> clausHashSet = new HashSet<Integer>();
        for (int clau : claus) {
        	clausHashSet.add(clau);
        }
        
        //comprovo que NO manté l'ordre
        System.out.println(clausHashSet.toString());
		        
        // fico les claus en un LinkedHashSet
        LinkedHashSet<Integer> clausLinkedHashSet = new LinkedHashSet<Integer>();
        for (int clau : claus) {
        	clausLinkedHashSet.add(clau);
        }
        
        //comprovo que SI manté l'ordre
        System.out.println(clausLinkedHashSet.toString());
		
		
		
		
		
		
		
		
		
		
		
	}

}
