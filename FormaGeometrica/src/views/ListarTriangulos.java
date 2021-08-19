package views;

import controller.FormaController;
import models.Triangulo;

public class ListarTriangulos {	
	public static void renderizar() {
		System.out.println("\n **** LISTAGEM DE TRIĀNGULOS **** \n");
		for (Triangulo triangulos : FormaController.listarTriangulos()) {
			System.out.println(triangulos);
		}
	}
}
