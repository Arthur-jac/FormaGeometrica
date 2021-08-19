package views;

import controller.FormaController;
import models.Retangulo;

public class ListarRetangulos {	
	public static void renderizar() {
		System.out.println("\n **** LISTAGEM DE RETÂNGULOS **** \n");
		for (Retangulo retangulos : FormaController.listarRetangulos()) {
			System.out.println(retangulos);
		}
	}
}
