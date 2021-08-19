package views;
import java.util.Scanner;
import models.Triangulo;
import console.Console;
import controller.FormaController;

public class CadastrarTriangulo {
	private static Scanner ler = new Scanner(System.in);
	private static Triangulo triangulo;
	public static void renderizar() {
		triangulo = new Triangulo();
		
		System.out.println("\n ****CADASTRO DO TRI�NGULO**** \n");
		triangulo.setAltura(Console.lerInteiro("Digite a altura do tri�ngulo: "));
		triangulo.setBase(Console.lerInteiro("Digite a base do tri�ngulo: "));
		FormaController.cadastrar(triangulo, null, triangulo, null);
		System.out.println("Tri�ngulo cadastrado com sucesso!");
	}
}
