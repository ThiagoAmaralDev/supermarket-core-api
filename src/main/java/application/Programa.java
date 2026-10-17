package application;
import entities.Produto;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Produtos

        Produto produto1 = new Produto();


        produto1.nome = sc.nextLine();
        produto1.precoUnitario = sc.nextDouble();
        produto1.quantidadeEstoque = sc.nextInt();

        System.out.println(produto1);

        produto1.adicionarEstoque(5);

        System.out.println("Novo estoque (adicionado): "+produto1.quantidadeEstoque);

        produto1.removerEstoque(2);

        System.out.println("Novo estoque (removido): " +produto1.quantidadeEstoque);

        sc.close();


    }
}
