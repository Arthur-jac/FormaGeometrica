package views;
import java.util.Scanner;
import console.Console;

public class Principal 
{	
	private static Scanner ler = new Scanner(System.in);
	
	// Menu da aplicação
	static int Menu()
	{
		int opcao;
		Scanner ler = new Scanner(System.in);
		System.out.println("0- Sair");
		System.out.println("1- Cadastrar retângulo");
		System.out.println("2- Cadastrar triângulo");
		System.out.println("3- Cadastrar circulo");
		System.out.println("4- Listar todos");
		System.out.println("5- Listar retângulos");
		System.out.println("6- Listar triângulos");
		System.out.println("7- Listar circulos");
		opcao = Console.lerInteiro("Digite a opção que deseja: ");
		return opcao;
	}
	
	// Principal
	public static void main(String[] args) {
		int op;

		do{
			op = Menu();
			switch (op){
			case 0: System.out.println("Programa encerrado"); break;
			
			case 1:	CadastrarRetangulo.renderizar(); break;
			
			case 2: CadastrarTriangulo.renderizar(); break;
			
			case 3: CadastrarCirculo.renderizar(); break;
			
			case 4: ListarTodos.renderizar(); break;
			
			case 5: ListarRetangulos.renderizar(); break;
			
			case 6: ListarTriangulos.renderizar(); break;
			
			case 7: ListarCirculos.renderizar(); break;
			
			default:
				System.out.println("Opção invalida");
			}
		} while (op != 0);
				
	}	
}
