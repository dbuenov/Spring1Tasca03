package n1exercici3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Generadora generadora = new Generadora();
		int tamany = generadora.tamanyLlista();
				
		ArrayList<String> arrayList = new ArrayList<String>();
		for (int i = 0; i < tamany; i++) {
			arrayList.add(generadora.seguentPersonatge());
		}
		System.out.println("ArrayList");
		System.out.println(arrayList.toString());
		
		
		LinkedList<String> linkedList = new LinkedList<String>();
		for (int i = 0; i < tamany; i++) {
			linkedList.add(generadora.seguentPersonatge());
		}
		System.out.println("LinkedList");
		System.out.println(linkedList.toString());
		
		
		HashSet<String> hashSet = new HashSet<String>();
		for (int i = 0; i < tamany; i++) {
			hashSet.add(generadora.seguentPersonatge());
		}
		System.out.println("HashSet");
		System.out.println(hashSet.toString());
				
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		for (int i = 0; i < tamany; i++) {
			linkedHashSet.add(generadora.seguentPersonatge());
		}
		System.out.println("LinkedHashSet");
		System.out.println(linkedHashSet.toString());
		
		
		TreeSet<String> treeSet = new TreeSet<String>();
		for (int i = 0; i < tamany; i++) {
			treeSet.add(generadora.seguentPersonatge());
		}
		System.out.println("TreeSet");
		System.out.println(treeSet.toString());
		
	}
}
