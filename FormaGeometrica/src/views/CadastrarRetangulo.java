package views;
import java.util.Scanner;
import models.Retangulo;
import console.Console;
import controller.FormaController;

public class CadastrarRetangulo {
	private static Scanner ler = new Scanner(System.in);
	private static Retangulo retangulo;
	public static void renderizar() {
		retangulo = new Retangulo();
		
		System.out.println("\n ****CADASTRO DO RET�NGULO**** \n");
		retangulo.setAltura(Console.lerInteiro("Digite a altura do ret�ngulo: "));
		retangulo.setLargura(Console.lerInteiro("Digite a largura do ret�ngulo: "));
		FormaController.cadastrar(retangulo, null, null, retangulo);
		System.out.println("Ret�ngulo cadastrado com sucesso!");
	}
}
