package desafios;

import java.util.Scanner;

public class Vetores{
	public void calculo(){

	System.out.println("Esse algor�timo determina o n�mero de elementos pares\n"
			+ "do vetor que tem uma diferen�a igual ao valor de X.\n");
	
	System.out.printf("Digite um valor para X: ");
	Scanner sc1 = new Scanner(System.in);
	int x = sc1.nextInt();
	System.out.printf("Quantos n�meros ter� o vetor? ");
	int aux = sc1.nextInt();
	int[] vetor = new int[aux];
	
	for (int i = 0; i < aux; i++) {
		System.out.printf("digite um n�mero: ");
		vetor[i] = sc1.nextInt();
	}
	
	
	int quantidade = 0;	
	for(int i = 0; i < aux; i++) {
		for(int j = 0; j <= i; j++){
			if(vetor[i] - vetor[j] == x){
				// System.out.printf("[%d,%d]\n", n[i], n[j]);
				quantidade++;
			}	
			
			else if(vetor[j] - vetor[i] == x){
				// System.out.printf("[%d,%d]\n", n[i], n[j]);
				quantidade++;
			}
			
		}	
	}
	System.out.printf("Existem %d pares, com a diferen�a de %d, para esse vetor!",quantidade, x );
	sc1.close();
	}
}		
	
