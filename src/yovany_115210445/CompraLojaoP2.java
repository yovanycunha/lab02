package yovany_115210445;

import java.util.*;

public class CompraLojaoP2 {
	
	static Scanner entrada = new Scanner(System.in);
	public static double preco = 1.99;
	public static double totalGasto = 0;
	public static int percentProduto = 0;
	
	public static void precoBase(double novoPreco){
		CompraLojaoP2.preco = novoPreco;
	}
	
	public static double totalGastoCliente(int arrayQuantidade[], double arrayPrecos[] ) {
		for (int i = 0; i < arrayQuantidade.length; i++) {
			totalGasto = totalGasto + ((double)arrayQuantidade[i] * arrayPrecos[i]);
		}
		return totalGasto;
	}
	
	public static String lerString() {
		String s = entrada.nextLine();
		return s;
	}
	
	public static double lerDouble() {
		double d = entrada.nextDouble();
		entrada.nextLine();
		return d;
	}
	
	public static int lerInt() {
		int inteiro = entrada.nextInt();
		entrada.nextLine();
		return inteiro;
	}
	
	public static void imprimeFatura(int arrayQuantidade[], String arrayNomes[], int totalProdutos) {
		for(int j = 0; j < arrayNomes.length ; j++){
			percentProduto = (int) Math.round((100.0*((double)arrayQuantidade[j]/(double)totalProdutos)));
			System.out.print(arrayQuantidade[j] + " " + arrayNomes[j]);
			System.out.println("(" + percentProduto + "%)");
			percentProduto = 0;
		}		
	}
	
		
	public static void main(String[] args) {
		
		int totalProdutos = 0;
		double preco = CompraLojaoP2.preco;
		
		System.out.print("Digite a quantidade de produtos diferentes que sera comprada:");
		int qntProdutos;
		qntProdutos = lerInt();
		
		String arrayNomes[] =  new String[qntProdutos];
		int arrayQuantidade[] = new int[qntProdutos];
		double arrayPrecos[] = new double[qntProdutos];
		
		System.out.println("-- Cadastro de Produtos --");
		for(int i = 0; i < qntProdutos ; i++){
			int opcaoPreco = 0;
			System.out.print("Nome do Produto " + (i + 1) + ": ");
			arrayNomes[i] = lerString();
			System.out.print("Quantidade de " + arrayNomes[i] + ": ");
			arrayQuantidade[i] = lerInt();
			System.out.println("Digite 1 para cadastrar " + arrayNomes[i] + " com preco base.");
			System.out.println("Digite outro numero para cadastrar " + arrayNomes[i] + " preco personalizado.");
			System.out.print("Opcao: ");
			opcaoPreco = lerInt();
			if(opcaoPreco == 1){
				arrayPrecos[i] = preco;
			}else{
				System.out.print("Informe o preco de " + arrayNomes[i] + ": ");
				arrayPrecos[i] = lerDouble();
			}
			totalProdutos += arrayQuantidade[i];
		}
		
		
		System.out.println("-- Cadastro Concluido --");
		
		CompraLojaoP2.totalGastoCliente(arrayQuantidade, arrayPrecos);
		
		
		System.out.println("A sua Compra foi:");
		imprimeFatura(arrayQuantidade, arrayNomes, totalProdutos);
		System.out.println("Total de Produtos: " + totalProdutos);
		System.out.println("Total Gasto: R$" + totalGasto);
		System.out.println("-- Fim da Execucao --");
	}
}