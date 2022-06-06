package Produtos;

import Objetos.*;

import java.math.BigDecimal;
import java.util.Scanner;

public class CadastrarProduto extends ArmazenaDados {
    public static void executar(Scanner sc){
        System.out.println("Digite o produto que deseja cadastrar: ");
        System.out.println("1 - Pizza");
        System.out.println("2 - Bebida");
        System.out.println("3 - Sobremesa");
        String action = sc.nextLine();

        switch (action) {
            case "1", "2", "3" -> cadastro(sc, action);
            default -> System.out.println("Opção inválida");
        }

    }

    public static void cadastro(Scanner sc, String action){

        System.out.println("Digite o nome do produto que deseja adicionar: ");
        String nome = sc.nextLine();
        System.out.println("Digite a descrição do produto: ");
        String descricao = sc.nextLine();
        System.out.println("Digite o valor do produto: ");
        BigDecimal valor = sc.nextBigDecimal();

        switch (action){
            case "1":
                Pizza pizza = new Pizza(nome,descricao,valor);
                listaProdutos.add(pizza);
                System.out.println("Produto adicionado com sucesso!");
                System.out.println();
                break;
            case "2":
                Bebida bebida = new Bebida(nome,descricao,valor);
                listaProdutos.add(bebida);
                System.out.println("Produto adicionado com sucesso!");
                System.out.println();
                break;
            case "3":
                Sobremesa sobremesa = new Sobremesa(nome,descricao,valor);
                listaProdutos.add(sobremesa);
                System.out.println("Produto adicionado com sucesso!");
                System.out.println();
                break;
            default:
                System.out.println("Produto não adicionado");
        }

    }
}
