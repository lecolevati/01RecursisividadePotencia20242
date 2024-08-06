package view;

import controller.PotenciaController;

public class Principal {

	public static void main(String[] args) {
		PotenciaController potCont = new PotenciaController();
		int base = 3;
		int expoente = 5;
		int resp = potCont.potencia(base, expoente);
		System.out.println(resp);
	}

}
