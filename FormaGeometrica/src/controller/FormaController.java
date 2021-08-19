package controller;

import java.util.ArrayList;
import models.Forma;
import models.Circulo;
import models.Retangulo;
import models.Triangulo;

public class FormaController {
	private static ArrayList<Forma> formas = new ArrayList<Forma>();
	private static ArrayList<Circulo> circulos = new ArrayList<Circulo>();
	private static ArrayList<Retangulo> retangulos = new ArrayList<Retangulo>();
	private static ArrayList<Triangulo> triangulos = new ArrayList<Triangulo>();
	
	public static void cadastrar(Forma forma, Circulo cl, Triangulo tg, Retangulo rt) {
		if (forma instanceof Circulo) {
			formas.add(forma);
			circulos.add(cl);
		}
		if (forma instanceof Triangulo) {
			formas.add(forma);
			triangulos.add(tg);
		}if (forma instanceof Retangulo) {
			formas.add(forma);
			retangulos.add(rt);
		}
	}
	
	public static ArrayList<Forma> listar(){
		return formas;
	}
	
	public static ArrayList<Retangulo> listarRetangulos(){
		return retangulos;
	}
	
	public static ArrayList<Circulo> listarCirculos(){
		return circulos;
	}
	
	public static ArrayList<Triangulo> listarTriangulos(){
		return triangulos;
	}
}
