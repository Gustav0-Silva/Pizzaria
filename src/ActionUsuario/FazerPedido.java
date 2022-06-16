package ActionUsuario;

import ActionUsuario.FinalizarPedidos.FinalizarMain;
import Factory.FactoryPizzaDoisSabores;
import Objetos.TipoProduto;
import Telas.SolicitarDadosPedido;
import Utils.UtilsExibirListas;
import Utils.UtilsRemover;
import java.util.Scanner;

public class FazerPedido{
    public void fazerPedido(String login){
        Scanner scanner = new Scanner(System.in);
        SolicitarDadosPedido pedir = new SolicitarDadosPedido();
        FinalizarMain finalizar = new FinalizarMain();

        do {
            System.out.println("O que você deseja pedir? ");
            System.out.println("1 - Pizza 1 sabor");
            System.out.println("2 - Pizza 2 sabores");
            System.out.println("3 - Bebida");
            System.out.println("4 - Sobremesa");
            System.out.println("5 - Remover um item");
            System.out.println("6 - Pagar");
            System.out.println("7 - Cancelar e Sair");

            String action = scanner.nextLine();

            switch (action){
                case "1":
                    pedir.receberDados(scanner, TipoProduto.PIZZA);
                    break;
                case"2":
                    FactoryPizzaDoisSabores pedirDoisSabores = new FactoryPizzaDoisSabores();
                    pedirDoisSabores.gerarPedidoDoisSabores(scanner,TipoProduto.PIZZA);
                    break;
                case "3":
                    pedir.receberDados(scanner, TipoProduto.BEBIDA);
                    break;
                case "4":
                    pedir.receberDados(scanner, TipoProduto.SOBREMESA);
                    break;
                case "5":
                    RemoverItem.removerItem(scanner);
                    break;
                case "6":
                    finalizar.finalizarPedido(scanner,login);
                    return;
                case "7":
                    UtilsRemover.limparTemp();
                    return;
                default:
                    System.out.println("Opção inválida, por favor, informe outra");
            }

            UtilsExibirListas.exibirTemp();

        }while(true);

    }

}
