package views;

import controller.FormaController;
import models.Circulo;

public class ListarCirculos {	
	public static void renderizar() {
		System.out.println("\n **** LISTAGEM DE CIRCULOS **** \n");
		for (Circulo circulos : FormaController.listarCirculos()) {
			System.out.println(circulos);
		}
	}
}