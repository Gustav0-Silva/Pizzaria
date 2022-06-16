package ActionAdm;

import Objetos.ArmazenaDados;
import Objetos.Produto;
import Objetos.TipoProduto;
import Utils.UtilsConfirmaSeExiste;
import Utils.UtilsExibirListas;

import java.util.Scanner;

public class RemoverProduto extends ArmazenaDados implements IConfirmaRemover{

    public void executar(Scanner sc){
        System.out.println("Digite o produto que deseja remover: ");
        System.out.println("1 - Pizza");
        System.out.println("2 - Bebida");
        System.out.println("3 - Sobremesa");
        String action = sc.nextLine();

        switch (action) {
            case "1" -> remover(sc, TipoProduto.PIZZA);
            case "2" -> remover(sc, TipoProduto.BEBIDA);
            case "3" -> remover(sc, TipoProduto.SOBREMESA);
            default -> System.out.println("Opção inválida");
        }
    }

    private void remover(Scanner sc, Enum tipo){
        UtilsConfirmaSeExiste prodExiste = new UtilsConfirmaSeExiste();
        String nome;

        UtilsExibirListas.imprimirProdutos(tipo);
        System.out.println();

        System.out.println("Digite o nome ou número do produto que deseja remover: ");
        nome = sc.nextLine();

        Produto produto = prodExiste.isValidProduto(nome,tipo);
        if (produto != null){
            boolean confirma = confirmaRemover(sc);
            if (confirma){
                excluirProduto(produto);
            }else {
                System.out.println("Operação cancelada");
            }
            return;
        }
        System.out.println("Produto informado não é válido");
    }
    @Override
    public boolean confirmaRemover(Scanner sc) {
        System.out.println("Deseja realmente remover?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        String action = sc.nextLine();

        switch (action){
        case "1":
            return true;
        case "2":
            return false;
        default:
            System.out.println("Opção inválida");
            confirmaRemover(sc);
    }
        return false;
    }


    private static void excluirProduto(Produto produtoRemover){
       listaProdutos.remove(produtoRemover);
        System.out.println("Produto removido com sucesso");
    }

}
