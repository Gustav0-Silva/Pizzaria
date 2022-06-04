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

        switch (action){
            case "1":
                cadastro(sc,TiposProdutos.PIZZA);
                break;
            case "2":
                cadastro(sc,TiposProdutos.BEBIDA);
                break;
            case "3":
                cadastro(sc,TiposProdutos.SOBREMESA);
            default:
                System.out.println("Opção inválida");
        }

    }

    public static void cadastro(Scanner sc, Enum tipo){

        System.out.println("Digite o nome do produto que deseja adicionar: ");
        String nome = sc.nextLine();
        System.out.println("Digite a descrição do produto: ");
        String descricao = sc.nextLine();
        System.out.println("Digite o valor do produto: ");
        BigDecimal valor = sc.nextBigDecimal();

        Produto produto = new Produto(nome, descricao, valor, tipo);

    }
}
