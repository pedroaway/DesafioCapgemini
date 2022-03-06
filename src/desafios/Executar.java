package desafios;

import java.util.Scanner;

public class Executar{
	public static void main(String[] args){
		Mediana questao1 = new Mediana();
		Vetores questao2 = new Vetores();
		EncriptarTexto questao3 = new EncriptarTexto();
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Qual questão deseja executar primeiro? #1 #2 ou #3?");
		int executar = sc1.nextInt();
		if (executar == 1 ) {questao1.calculo();}
		if (executar == 2 ) {questao2.calculo();}
		if (executar == 3 ) {questao3.calculo();}

		sc1.close();
	}

}
