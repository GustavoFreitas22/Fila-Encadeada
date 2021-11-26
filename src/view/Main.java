package view;
import java.util.LinkedList;
import java.util.List;

import controller.ListaController;

public class Main {
	public static void main(String[] args) {
		ListaController controller = new ListaController();
		List<Integer> lista1 = new LinkedList<Integer>();
		List<Integer> lista2 = new LinkedList<Integer>();
		
		for (int i = 0; i < 6; i++) {
			int num1 = (int) ((Math.random() * 200) + 1);
			lista1.add(num1);
			
			int num2 = (int) ((Math.random() * 200) + 1);
			lista2.add(num2);
		}

		controller.concat(lista1, lista2);
		controller.split(lista1, 2);
	}
}
