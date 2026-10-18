package application;
import entities.Produto;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("DADOS DO PRODUTO: ");
        System.out.println("------------------------");
        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Preço do produto: ");
        double precoUnitario = sc.nextDouble();


        Produto produto1 = new Produto(nome, precoUnitario);

        System.out.println("Dados do produto: " + produto1);

        System.out.println("Quanto será adicionado no estoque:" );
        int qtdEntrada = sc.nextInt();
        produto1.adicionarEstoque(qtdEntrada);

        System.out.println("Quanto será removido do estoque: ");
        int qtdSaida = sc.nextInt();
        produto1.removerEstoque(qtdSaida);

        System.out.println("Dados atualizados: " +produto1.toString());
        sc.close();




    }
}
