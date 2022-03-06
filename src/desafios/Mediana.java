package desafios;

import java.util.Scanner;

public class Mediana{
	public void calculo(){
				
		//ENTRADA DE DADOS	
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite o n�mero de itens da sua lista");
		int quantidade = sc1.nextInt();
		int[] arr = new int[quantidade];
		
		for(int i = 0; i < quantidade; i++){
			System.out.printf("Digite o n�mero %d: ",i+1);
			arr[i] = sc1.nextInt();
	
		}
			
		//ORGANIZA��O DOS N�MERO EM ORDEM CRESCENTE
		int tamanho = arr.length;
		int numeroAux;
		boolean alinhando;
		numeroAux = 0;
		alinhando = false;

		while (!alinhando) {
			alinhando = true;
			for (int i = 0; i < tamanho - 1; i++){

				if (arr[i] > arr[i + 1]){
					numeroAux = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = numeroAux;
					alinhando = false;
					
				}
			}
		}

		//DISPLAY DO N�MERO NA TELA
		int mediana = arr[tamanho/2];
		System.out.printf("\nA mediana dessa lista � igual a: %d",mediana);
		
		sc1.close();
	}
}