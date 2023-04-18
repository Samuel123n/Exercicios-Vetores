package AtividadeVetoresEmatrisez;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int n1, x, busca = 10;

		System.out.println("\n*2, 5, 1, 3, 4, 9, 7, 8, 10, 6,*");
		System.out.println("\nEscolha um numero: ");
		n1 = ler.nextInt();

		for (x = 0; x < vetor.length; x++) {
			if (n1 == vetor[x]) {
				busca = x;
			}
		}

		if (busca == 10) {
			System.out.printf("o numero %d não foi localizado", n1);
		} else {
			System.out.printf("o numero %d esta localizado na posição: %d", n1, busca);
		}
	}

}
