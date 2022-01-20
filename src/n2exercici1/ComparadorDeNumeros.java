package n2exercici1;

import java.util.Comparator;

public class ComparadorDeNumeros implements Comparator<Numero>{

	@Override
	public int compare(Numero o1, Numero o2) {
		return o1.getRandom()-o2.getRandom();
	}
	

}
