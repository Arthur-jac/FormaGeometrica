package views;
import java.util.Scanner;
import models.Circulo;
import console.Console;
import controller.FormaController;

public class CadastrarCirculo {
	private static Scanner ler = new Scanner(System.in);
	private static Circulo circulo;
	public static void renderizar() {
		circulo = new Circulo();
		
		System.out.println("\n ****CADASTRO DO CIRCULO**** \n");
		circulo.setRaio(Console.lerInteiro("Digite o raio do circulo: "));
		FormaController.cadastrar(circulo, circulo, null, null);
		System.out.println("Circulo cadastrado com sucesso!");
	}
}
