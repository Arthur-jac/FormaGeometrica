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
		
		System.out.println("\n ****CADASTRO DO TRIÂNGULO**** \n");
		triangulo.setAltura(Console.lerInteiro("Digite a altura do triângulo: "));
		triangulo.setBase(Console.lerInteiro("Digite a base do triângulo: "));
		FormaController.cadastrar(triangulo, null, triangulo, null);
		System.out.println("Triângulo cadastrado com sucesso!");
	}
}
