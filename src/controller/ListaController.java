package controller;

import java.util.LinkedList;
import java.util.List;

public class ListaController {
	public ListaController() {
		super();
	}
	
	public List<Integer> concat(List<Integer> lista1, List<Integer> lista2) {
		List<Integer> concat = new LinkedList<Integer>();
		
		for (int i = 0; i < lista1.size(); i++) {
			concat.add(lista1.get(i));
			concat.add(lista2.get(i));
		}
		
		return concat; 
	}
	
	public List<List<Integer>> split(List<Integer> lista, int splitBy) {
		List<List<Integer>> partitions = new LinkedList<List<Integer>>();
		int listaSize = lista.size();
		
		
		if (listaSize / splitBy < 1) {
			throw new Error("Não é possível dividir a lista por " + splitBy);
		}
		
		for (int i = 0; i < listaSize; i += splitBy) {
			partitions.add(new LinkedList<Integer>(
					lista.subList(i, Math.min(listaSize, i + splitBy))
			));
		}
		
		return partitions;
	}

}
