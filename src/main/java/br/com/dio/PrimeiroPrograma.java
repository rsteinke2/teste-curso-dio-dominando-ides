package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		// TODO Auto-generated method stub
			/*int a = 2;
			int b = 3;
			System.out.println("Hello World!\n "  + (a+b));*/
		System.out.println(gato);
		System.out.println(livros);
				
	}

}

class Livros {
	private String nome;
	private String npag;
}
