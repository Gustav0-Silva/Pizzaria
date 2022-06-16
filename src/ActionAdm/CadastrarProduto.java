package ActionAdm;

import Factory.FactoryProduto;
import Objetos.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class CadastrarProduto {
    public void executar(Scanner sc){
        System.out.println("Digite o produto que deseja cadastrar: ");
        System.out.println("1 - Pizza");
        System.out.println("2 - Bebida");
        System.out.println("3 - Sobremesa");
        String action = sc.nextLine();

        switch (action) {
            case "1": case "2": case "3":
                cadastro(sc, action);
            default: System.out.println("Opção inválida");
        }
    }

    private void cadastro(Scanner sc, String action){
        FactoryProduto criarProd = new FactoryProduto();

        System.out.println("Digite o nome do produto que deseja adicionar: ");
        String nome = sc.nextLine();
        System.out.println("Digite a descrição do produto: ");
        String descricao = sc.nextLine();
        System.out.println("Digite o valor do produto: ");
        BigDecimal valor = sc.nextBigDecimal();

        switch (action) {
            case "1" -> criarProd.criarProduto(nome, descricao, valor, TipoProduto.PIZZA);
            case "2" -> criarProd.criarProduto(nome, descricao, valor, TipoProduto.BEBIDA);
            case "3" -> criarProd.criarProduto(nome, descricao, valor, TipoProduto.SOBREMESA);
            default -> System.out.println("Produto não adicionado");
        }
    }
}
