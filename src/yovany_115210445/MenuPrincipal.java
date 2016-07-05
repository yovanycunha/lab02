package yovany_115210445;

import java.util.Scanner;

public class MenuPrincipal {
	
	public static void main(String[] args) {
		
		int opcao = 0;
		double totalVendido = 0;
		System.out.println("Bem Vindo ao Lojao LP2!");
		System.out.println("Menu inicial: Digite uma das opcoes abaixo:\n");
		System.out.print("1 - Realizar Compra.\n2 - Mudar preco base de produtos.\n3 - Sair\n\nOpcao:");
		
		Scanner entrada = new Scanner(System.in);
		opcao = entrada.nextInt();
		
		if (opcao == 1) {
			CompraLojaoP2.main(args);
		}
		else if (opcao == 2) {
			System.out.print("Informe o novo preco base:");
			double novoPreco = entrada.nextDouble();
			CompraLojaoP2.precoBase(novoPreco);	
			CompraLojaoP2.main(args);
		}
		else if (opcao == 3){
			System.out.println("-- Fim da Execucao --");		
		}
	}

}

/* Essas variaveis fora dos metodos, ou atributos de classe sao definidos na classe CompraLojaoP2
 * pois toda a imnplementação do programa eh feita nela. */
