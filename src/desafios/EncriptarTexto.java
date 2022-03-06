package desafios;

import java.util.Scanner;

public class EncriptarTexto{
	public void calculo(){
		
		//ENTRADA DE DADOS 
		Scanner sc1 = new Scanner(System.in);
		System.out.println("digite um texto para ser encriptado:");
		String nome = sc1.nextLine();
		String result = nome.replace(" ", "");//REMOVE ESPA�OS
		String[] name = result.split("");//SEPARA OS CARACTERES NA ARRAY
		
		int tamanho1 = name.length;//TAMANHO DO TEXTO SEM ESPA�OS 
		
		double tamanho2 = Math.sqrt(tamanho1); 
		int tamanhoArredondado = (int)Math.ceil(tamanho2);//ARREDONDA A RAIZ PRA CIMA
		
		//ORGANIZA��O NA GRID
		for (int i = 0; i < tamanhoArredondado; i++){
			for (int j = i; j < tamanho1; j = j + tamanhoArredondado){
				System.out.printf("%s",name[j]);
			}
			System.out.printf(" "); 
		}
		
		
		sc1.close();
	}
}
