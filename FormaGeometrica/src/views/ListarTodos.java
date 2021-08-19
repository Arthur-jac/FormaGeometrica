package views;
import controller.FormaController;
import models.Forma;

public class ListarTodos {
	public static void renderizar() {
		System.out.println("\n **** LISTAGEM DE TODAS AS FORMAS **** \n");
		for (Forma formas : FormaController.listar()) {
			System.out.println(formas);
		}
	}
}
